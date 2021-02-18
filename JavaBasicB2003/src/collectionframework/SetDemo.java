package collectionframework;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo(){
        Set<Integer> phoneNumber = new HashSet<>();
        phoneNumber.add(12345);
        phoneNumber.add(2345);
        phoneNumber.add(3456788);
        phoneNumber.add(465758);
        phoneNumber.add(12233); // 5 elements 1 duplicate
        System.out.println(phoneNumber.size());
        // -> lambda sign
        phoneNumber.forEach(numb -> System.out.println(numb));

    }
}
