package control_work_2.src;

import java.util.Collections;
import java.util.HashMap;

/**
 * Классдля сбора объектов игрушек Toy в один Hashmap для быстрого доступа.
 */
public class ToyList {
    HashMap<Integer,Toy> toys = new HashMap<>();
    String toyFilepath;
    FileIO f = new FileIO();
    protected int maxKey;

    public ToyList() {
        this.readFromFile("./toylist.txt");
        this.maxKey = Collections.max(toys.keySet());
    }

    /**
     * добавляем одну игрушку. Если ключи совпали, назначается id = максимально_знакомый_ключ+1
     */
    int addToy(Toy t){
        int finalId = t.id;
        if(toys.containsKey(t.id)){
            finalId = ++maxKey;
            t.setId(finalId);
        }
        toys.put(t.id,t);
        return finalId;
    }
    void removeToy(int idNum){
        toys.remove(idNum);
    }

    /**
     * добавление игрушек из файла через указание пути к конкретному файлу
     */
    void readFromFile(String filepath){
        this.toyFilepath=filepath;
        for (String line:f.readToys(filepath)){
            String[] toyParams = line.split(" ",4);
            int toyId = Integer.parseInt(toyParams[0]);
            toys.put(toyId,new Toy(toyId,
                    Double.parseDouble(toyParams[1]),
                    toyParams[3],
                    Integer.parseInt(toyParams[2])));
        }

    }

    void saveToFile(){
        f.writeToys(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb =new StringBuilder();
        for (Toy t: toys.values()){
            sb.append(t.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
