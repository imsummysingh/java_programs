import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program_19_LinkedHashMap {
    public static void main(String[] args){

        //writing hashmap code: it does not maintain order
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"AK");
        hashMap.put(21,"BK");
        hashMap.put(3,"CK");
        hashMap.put(4,"DK");

        System.out.println("HashMap Example for unordered list");
        for(Map.Entry<Integer, String> val : hashMap.entrySet()){
            System.out.println(val.getKey()+" "+val.getValue());
        }


        //writing linkedhashmap code: maintain insertion order
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"AK");
        linkedHashMap.put(21,"BK");
        linkedHashMap.put(3,"CK");
        linkedHashMap.put(4,"DK");

        System.out.println("LinkedHashMap Example for ordered list using Insertion Order");
        for(Map.Entry<Integer, String> val : linkedHashMap.entrySet()){
            System.out.println(val.getKey()+" "+val.getValue());
        }

        //Writing linkedHashMap code: maintain access order
        Map<Integer,String> linkedHashMap1 = new LinkedHashMap<>(16,0.75F, true);
        linkedHashMap1.put(1,"AK");
        linkedHashMap1.put(21,"BK");
        linkedHashMap1.put(3,"CK");
        linkedHashMap1.put(4,"DK");

        linkedHashMap1.get(3);
        System.out.println("LinkedHashMap Example for Access Order");
        for(Map.Entry<Integer, String> val : linkedHashMap1.entrySet()){
            System.out.println(val.getKey()+" "+val.getValue());
        }
    }
}
