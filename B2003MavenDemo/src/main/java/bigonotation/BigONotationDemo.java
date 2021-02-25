package bigonotation;

import java.util.ArrayList;
import java.util.UUID;

public class BigONotationDemo {

    public static void main(String[] args) {
        System.out.println("Hello"); // O(1)

        ArrayList<String> arrayList = new ArrayList<>(); // O(1)
        ArrayList<Integer> student = new ArrayList<>();
        int limit = 1000;
        for (int i = 1; i <= limit ; i++){
            UUID uuid = UUID.randomUUID(); //Generates random UUID.
            arrayList.add(uuid.toString()); // O(200)

            for (int j = i ; j < limit; j++ ){
                Integer value = new Integer(i);
                student.add(value);
            }

        }
        System.out.println("Length of arrayList: " + arrayList.size() );
        System.out.println("Length of student arrayList: " + student.size() );
        arrayList.forEach(a -> System.out.println(a));

        student.forEach(id -> System.out.print(id));

    }


}
