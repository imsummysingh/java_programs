import java.util.PriorityQueue;

//min heap or min priority queue
public class Program_11_MinHeap {
    public static void main(String[] args){
        //it is a min heap, because it is in natural sorting order which is ascending
        //we are not passing any value in the constructor of the priority queue.
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        //print all values
        for(int i: minPQ){
            System.out.println(i);
        }

        //remove top element from minPQ
        while(!minPQ.isEmpty()){
            int val = minPQ.poll();
            System.out.println("Removed value: "+val);
        }

    }
}
