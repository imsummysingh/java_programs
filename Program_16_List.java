import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Program_16_List {
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();

        //add(int index, element e)
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        //addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);

        list1.addAll(2,list2);
        list1.forEach((Integer val)->System.out.println(val));

        //replaceAll(UniaryOperator op)
        list1.replaceAll((Integer val)-> -1*val);
        System.out.println("After replace all");
        list1.forEach((Integer val)->System.out.println(val));

        //sort(Comparator c)
        list1.sort((Integer val1, Integer val2)->val1-val2);
        System.out.println("Sorting in ascending order");
        list1.forEach((Integer val)->System.out.println(val));

        //get(Index)
        System.out.println("Value at Index 2: "+list1.get(2));

        //set(int index, Element e)
        list1.set(2,-4000);
        System.out.println("After setting value");
        list1.forEach((Integer val)->System.out.println(val));

        //need to provide index in listIterator, from where it start
        //setting the iterator on list1 with the size of it
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

        //traversing backward
        while(listIterator1.hasPrevious()){
            int previousVal = listIterator1.previous();
            System.out.println("Traversing backward: "+previousVal+" nextIndex: "+listIterator1.nextIndex()+" previousIndex: "+listIterator1.previousIndex());
            if(previousVal==-100){
                listIterator1.set(-50);
            }
        }
        list1.forEach((Integer val)->System.out.println("after set: "+val));


        //Traversing forward direction
        ListIterator<Integer> listIterator2 = list1.listIterator();
        while(listIterator2.hasNext()){
            int val=listIterator2.next();
            System.out.println("Traversing forward: "+val+" nextIndex: "+listIterator2.nextIndex()+" previousIndex: "+listIterator2.previousIndex());
            if(val==-200){
                listIterator2.add(-100);
            }
        }
        list1.forEach((Integer val)->System.out.println("After add: "+val));

        //sublist
        List<Integer> subList = list1.subList(1,4);
        subList.forEach((Integer val)-> System.out.println("Sublist: "+val));



    }
}
