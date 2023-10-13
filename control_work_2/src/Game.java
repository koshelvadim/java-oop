package control_work_2.src;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;

/**
 * Класс, который смотрит веса игрушек, назначает им относительный шанс в текущем розыгрыше, и разыгрывает игрушки по списку участников.
 *  Шансы=вес игрушки/общий вес очереди, проигрыш регулируется переменной lossWeight,
 */
public class Game {
    ToyList currentToys;
    UserQueue currentParticipants;
    double lossWeight = 0;
    int lossId;

    ChanceCalc cc = new ChanceCalc();
    Game.QuantityCalc qc = new Game.QuantityCalc();

    public Game(UserQueue kids, ToyList tl) {

        this.currentToys = cc.assignChance(tl);
        this.currentParticipants = kids;
    }

    /**
     * метод перебора розыгрыша
     */
    public void runGame() {
        UserQueue kids = this.currentParticipants;
        ToyList tl = this.currentToys;
        PriorityQueue<Toy> prizes = new PriorityQueue<>(tl.toys.values());
        try {
            BufferedWriter log = FileIO.gameLog();

            while(kids.iterator().hasNext()){
                double winRoll = cc.doRoll();
                User k = kids.iterator().next();
                try {
                    Toy win = cc.checkPrize(prizes, winRoll);
                    prizes = qc.adjustQuantityLeft(win,tl,prizes);
                    log.write(showWin(k, win) + "\n");
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            log.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }


    String showWin(User kid, Toy prize) {
        String winLine;
        if(prize.name.equals("ничего")){
            winLine = kid.toString() + " не выиграл ничего";
        } else {
            winLine = kid.toString() + " выиграл " + prize.name;
        }
        System.out.println(winLine);
        return winLine;
    }

    /**
     * Метод для расчета вес проигрыша, можно передать вручную.
     */
    public void setLossWeight(double lossWeight) {
        this.lossWeight = lossWeight;
        this.lossId = this.currentToys.addToy(new Toy(lossWeight, "ничего", -1));
        cc.assignChance(currentToys);
    }

    /**
     * методы, отвечающие за учет остатков призов.
     */
    class QuantityCalc {
        /**
         * Точка входа в класс, остальные вспомогательные методы
         *
         * @param t    - выигранная игрушка
         * @param tl список игрушек текущего розыгрыша
         * @return возвращает скорректированный список
         */
        PriorityQueue<Toy> adjustQuantityLeft(Toy t, ToyList tl,PriorityQueue<Toy> currentQueue) {
            if(t.quantity > 0){
                t.quantity -= 1;
            }
            if(t.quantity == 0){
                removeStock(t.id, tl);
                Game.this.cc.assignChance(tl);
                currentQueue = new PriorityQueue<>(tl.toys.values());
            }
            return currentQueue;
        }

        void removeStock(int idNum, ToyList toys) {
            toys.removeToy(idNum);
        }


    }

}
/**
 * методы расчета вероятности для Game
 */
class ChanceCalc {
    Random r = new Random();
    double maxChance;
    double totalWeight;

    /** Выдает случайное число от 0 до maxChance.
     */
    double doRoll(){
        return r.nextDouble()*maxChance;
    }

    /**
     * Здесь тянутся из очереди игрушки в соответствии с броском
     * @param prizes игрушки в розыгрыше
     * @param roll бросок текущего участника
     */
    Toy checkPrize(PriorityQueue<Toy> prizes, double roll) throws Exception {
        PriorityQueue<Toy> onePoll = new PriorityQueue<>(prizes);

        while(!onePoll.isEmpty()){
            Toy p = onePoll.poll();
            if(roll <= p.getChance()){
                return checkTies(onePoll,p);
            }
        }
        throw new Exception("Приз с такой вероятностью не найден");
    }

    /**
     * первоначальная обработка списка игрушек для выставления шансов
     */
    ToyList assignChance(ToyList tl){
        this.totalWeight = 0;
        this.maxChance = 0;
        for (Toy t:tl.toys.values()){
            this.totalWeight += t.chanceWeight;
        }

        for (Toy t:tl.toys.values()){
            double ch = t.chanceWeight/totalWeight;
            t.setChance(ch);
            if(maxChance < ch ){
                maxChance = ch;
            }
        }
        return tl;
    }
    /**
     * метод случайного выбора игрушки с одинаковыми весами вероятности
     */
    Toy checkTies(PriorityQueue<Toy> leftovers, Toy drawn  ){
        PriorityQueue<Toy> tiePoll = new PriorityQueue<>(leftovers);
        ArrayList<Toy> sameChance = new ArrayList<>();
        while(!tiePoll.isEmpty()){
            if(drawn.getChance() == tiePoll.peek().getChance()){
                sameChance.add(tiePoll.poll());
            }else {break;}
        }
        sameChance.add(drawn);
        int pickRandom = r.nextInt(sameChance.size());
        return sameChance.get(pickRandom);
    }
}