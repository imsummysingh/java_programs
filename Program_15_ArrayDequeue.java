import java.util.ArrayDeque;

public class Program_15_ArrayDequeue {
    public static void main(String[] args){

        //Array Dequeue as Queue -  FIFO
        ArrayDeque<Integer> arrayDequeAsQueue = new ArrayDeque<>();
        //insertion
        arrayDequeAsQueue.addLast(1);
        arrayDequeAsQueue.addLast(2);
        arrayDequeAsQueue.addLast(3);
        arrayDequeAsQueue.addLast(4);

        System.out.println("Queue:");
        for(int val:arrayDequeAsQueue){
            System.out.println(val);
        }

        //deletion
        int element = arrayDequeAsQueue.removeFirst();
        System.out.println("Deleted Item: "+element);

        System.out.println("Updated Queue:");
        for(int val:arrayDequeAsQueue){
            System.out.println(val);
        }


        //Array Dequeue as Stack - LIFO
        ArrayDeque<Integer> arrayDequeAsStack = new ArrayDeque<>();
        //insertion
        arrayDequeAsStack.addFirst(1);
        arrayDequeAsStack.addFirst(2);
        arrayDequeAsStack.addFirst(3);
        arrayDequeAsStack.addFirst(4);

        System.out.println("Stack:");
        for(int val:arrayDequeAsStack){
            System.out.println(val);
        }

        //delete
        int removedItem = arrayDequeAsStack.removeFirst();
        System.out.println("Removed Item: "+removedItem);

        System.out.println("Updated Stack:");
        for(int val:arrayDequeAsStack){
            System.out.println(val);
        }

    }
}
