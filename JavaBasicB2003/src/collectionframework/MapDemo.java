package collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        mapDemo();
    }

    public static void mapDemo(){
        // Map --> K, V
        Map<String, Integer> phoneNumberMap = new HashMap<>();
        // insert
        phoneNumberMap.put("John", 12345); // element1= (k, v)
        phoneNumberMap.put("Jack", 23456);
        phoneNumberMap.put("Joly", 34567);
        phoneNumberMap.put("Jones", 45678);

        // Retrieve

        for(  Map.Entry<String, Integer> e: phoneNumberMap.entrySet()){
            System.out.println(" Key: " + e.getKey() + "," + " Value: "+ e.getValue());
        }

    }
}
