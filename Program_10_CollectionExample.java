import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Program_10_CollectionExample {
    public static void main(String[] args){
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        System.out.println("Values: ");
        for(int val: values){
            System.out.println(val);
        }
        //size
        System.out.println("Size: "+values.size());

        //isEmpty?
        System.out.println("isEmpty?: "+values.isEmpty());

        //contains
        System.out.println("Contains 2?: "+values.contains(2));

        //add
        values.add(5);
        //remove
        values.remove(2);

        //remove using object
        values.remove(Integer.valueOf(3));

        System.out.println("Updated Values:");
        for(int val: values){
            System.out.println(val);
        }

        //creating another collection
        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(2);
        stackValues.add(3);
        stackValues.add(4);

        //add all
        values.addAll(stackValues);
        System.out.println("Addall list and stack:");
        for(int val: values){
            System.out.println(val);
        }

    }
}
