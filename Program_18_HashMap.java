import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Program_18_HashMap {
    public static void main(String[] args){

        //creating Map with HashMap
        Map<Integer,String> numStr = new HashMap<>();

        //adding <k,v> in hashmap
        numStr.put(null,"Test");
        numStr.put(0,null);
        numStr.put(1,"AJ");
        numStr.put(2,"BK");

        //compute if keyvalue is present
        numStr.putIfAbsent(null,"test");
        numStr.putIfAbsent(3,"Cid");

        //printing values of the hashmap
        for(Map.Entry<Integer,String> entryMap : numStr.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: "+key+ " Value: "+value);
        }

        //isEmpty
        System.out.println("isEmpty? :"+numStr.isEmpty());

        //size
        System.out.println("Size: "+numStr.size());

        //containsKey
        System.out.println("ConatinsKey(3): "+numStr.containsKey(3));

        //get(key)
        System.out.println("get{1): "+numStr.get(1));

        //getOrDefault(key)
        System.out.println("get(9): "+numStr.getOrDefault(9, "default"));

        //remove(key)
        System.out.println("remove(null): "+numStr.remove(null));

        for(Map.Entry<Integer,String> entryMap : numStr.entrySet()){
            Integer key = entryMap.getKey();
            String value = entryMap.getValue();
            System.out.println("Key: "+key+ " Value: "+value);
        }

        //keySet()
        for(Integer key: numStr.keySet()){
            System.out.println("Key: "+key);
        }

        //values
        Collection<String> values = numStr.values();
        for(String val: values){
            System.out.println("Values: "+val);
        }

    }
}
