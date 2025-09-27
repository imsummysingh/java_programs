import java.util.LinkedList;

public class Program_17_LinkedList {
    public static void main(String[] args){

        LinkedList<Integer> list = new LinkedList<>();

        //using dequeue functionality
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);

        System.out.println(list.getFirst());

        //using list functionality
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,100);
        list2.add(1,200);
        list2.add(2,400);
        list2.add(2,300);

        System.out.println(list2.get(2)+" and "+list2.get(3));
        
    }
}
