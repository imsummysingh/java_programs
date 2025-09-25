import java.util.PriorityQueue;

public class Program_12_MaxHeap {
    public static void main(String[] args){
        //creating max heap, with passing paramater(comparator) in the priorityqueue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b)->b-a);
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        //print all values
        for(int i: maxPQ){
            System.out.println(i);
        }

        //remove top element from minPQ
        while(!maxPQ.isEmpty()){
            int val = maxPQ.poll();
            System.out.println("Removed value: "+val);
        }

    }
}
