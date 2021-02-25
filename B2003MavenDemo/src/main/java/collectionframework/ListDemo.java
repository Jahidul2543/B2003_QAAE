package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ListDemo {

    public static void main(String[] args) {
        studentsList();
    }

    public static void studentsList(){
        // Differences between creating list object using List<> interface and ArrayList<> Class?
        List<String> uuidList = new ArrayList<>();
        for (int i = 1; i <= 20 ; i++){
            UUID uuid = UUID.randomUUID(); //Generates random UUID.
            uuidList.add(uuid.toString()); // O(200)
        }
        uuidList.add("");
        uuidList.add(null);
        uuidList.add(null);
        uuidList.add("true");
        uuidList.add("true");

        uuidList.forEach(str -> System.out.println(str));
    }
}
