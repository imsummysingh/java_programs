import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program_09_IterableCollection {
    public static void main(String[] args){

        //collection of arrayList type
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);


        //using Iterator
        System.out.println("Iterating the value using Iterator Method");
        //creating object of Iterator as integer to hold the value of the list
        Iterator<Integer> valuesIterator = values.iterator();
        while (valuesIterator.hasNext()){
            int val = valuesIterator.next();
            System.out.println(val);
            if(val==3){
                valuesIterator.remove();
            }
        }

        //using foreach for looping through the values
        System.out.println("Iterating using foreach");
        for(int val: values){
            System.out.println(val);
        }

        //using foreach() method of iterable to loop through the value
        System.out.println("Iterating using foreach() method ");
        values.forEach((Integer val)->System.out.println(val));
    }
}
