package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingDemo {
    public static void main(String[] args) {
        sortList();
    }

    public static List<Integer> phoneNumberList(){
        List<Integer> phoneNumber = new ArrayList<>();
        phoneNumber.add(12345);
        phoneNumber.add(2345);
        phoneNumber.add(3456788);
        phoneNumber.add(465758);
        phoneNumber.add(12345);

        return phoneNumber;
    }

    public static void sortList(){
        Set<Integer> sortedSet = new HashSet<>();
        for ( Integer i: phoneNumberList()) {
            System.out.println("Element of the list" +i);
            System.out.println("*****");
            sortedSet.add(i);
        }
        sortedSet.forEach(s -> System.out.println(s));

    }
}
