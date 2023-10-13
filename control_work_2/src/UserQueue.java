package control_work_2.src;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * класс, следящий за порядком очереди участников по id
 */
public class UserQueue implements Iterable<User> {
    PriorityQueue<User> drawQueue;


    public UserQueue(Collection<User> list) {
        this.drawQueue = new PriorityQueue<>(list.size());
        this.drawQueue.addAll(list);
    }

    class ParticipantIterator implements Iterator<User>{
        User current;
        public ParticipantIterator(PriorityQueue<User> participants) {
            this.current = participants.peek();
        }

        @Override
        public boolean hasNext() {
            return !drawQueue.isEmpty();
        }

        @Override
        public User next() {
            return drawQueue.poll();
        }
    }


    @Override
    public Iterator<User> iterator() {
        return new ParticipantIterator(drawQueue);
    }

}
