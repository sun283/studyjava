import java.util.LinkedList;
import java.util.Queue;

public class queueTest {
    public static void main(String[] args) {
        /*
         * Queue
         * FIFO: First-in, First-out 
         * LILO: Last-in, Last-out
         * 
         * -Enqueue : insert data into queue
         * -Dequeue : take out data from queue
         * refs https://visualgo.net/en/list
         * 
         * Queue Class in java.util pacakge
         * -enqueue = add(value) or offer(value)
         * -dequeue = poll() or remove()
         * 
         * To create data, have to use LinkedList Class
         */

         // need to import both Queue and LinkedList Class
         // Declare Integer type queue
         Queue<Integer> queueInt = new LinkedList<Integer>();
         // Declare String type queue
         Queue<String> queueString = new LinkedList<String>();

         // To insert data: add(value) or offer(value)
         queueInt.add(1);
         queueInt.offer(2);
         System.out.println(queueInt);
         // [1,2]
         // When user 'Offer' method, there will be return value
         // if suceed insertion then true or false

         // poll(): To remove data and returning the first value of queue
         queueInt.poll();
         System.out.println(queueInt);
         // [2]
         queueInt.remove();
         System.out.println(queueInt);
         // null
        
        /*
         * Where to use Queue
         * 
         * - process scheduling for multi-tasking
         * refer to operating system
         */

        // Using ArrayList Class, write functions similar to enqueue and dequeue
        // when call dequeue method, if there is no data then return null
        // Use Java Generic type to deal different types of data

        private ArrayList<T> queue = new ArrayList<T>();

        // insertion
        public void enqueue(T data){
            queue.add(data);
        }

        // removal
        public T dequeue(){
            if(queue.isEmpty()){
                return null;
            }
            return queue.remove(0);
        }       
    }    
}