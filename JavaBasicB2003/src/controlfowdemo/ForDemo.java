package controlfowdemo;

import java.util.ArrayList;

public class ForDemo {
    public static void main(String[] args) {
        //forDemo();
        dynamicArrayDemo();
    }

    public static void forDemo(){
        /**
         * We are going to store 4 names inside this array
         * 101, 102, 103, 104
         *
         * 1. Declare the container or array variable
         * 2. Store information inside the container // 4  // Done
         * 3. Get or retrieve data from the container // 4 //
         * 4. Delete an element from the array
         *
         * */

        int[] studentsID = new int[4];// 4 --> 5


        for(int i = 0; i <= 3; i++ ){
            // Insert record into array
            studentsID[i] = 101 + i; // studentsID[0] = 101;// studentsID[1] = 102;
        }
         // Read all array elements
        for(int i = 0; i<= 3; i++){
            System.out.println("Student ID: " + studentsID[i]);
        }
    }

    public void forLoopConcept(){
        int counter = 0;
        for(int i = 70; i <= 80; i++ ){
            // This block of code {} will only be executed if the above conditions meet
            System.out.println("Iteration Number: " + (i-69));//6-5 =1 in first iteration --> 7 -5 = 2
            // Insert data into array

            counter++;
        }
        System.out.println(counter);
    }

    public static void dynamicArrayDemo(){
        int[] facebookFriendArray = new int[300];
        // ArrayList is a Java class which helps you to create dynamic Array objects
        // where we can store dynamic array values
        // If Arraylist is a class, it should have method or methods?
        // who has created this class for you? Java
        // Creating dynamic array named facebookFriends to store my facebook friends name
        ArrayList<String> facebookFriends = new ArrayList<String>();
        facebookFriends.add("Ziad");
        facebookFriends.add("Usman");
        facebookFriends.add("Mohsen");
        facebookFriends.add("Abdul");
        int lengthOftheArray = facebookFriends.size(); // 4 || Highest index number of this array = lengthOftheArray - 1
        System.out.println("Length of the facebookFriends dynamic array: "+ lengthOftheArray);
//        System.out.println(facebookFriends.get(0));
//        System.out.println(facebookFriends.get(1));
//        System.out.println(facebookFriends.get(2));
//        System.out.println(facebookFriends.get(3));
         //     i = 23      23 + 4
        for(int i = 23; i<= 22 + lengthOftheArray; i++){
            System.out.println("Ferhan's friend: " + facebookFriends.get(i-23)); // 0 --> 1 --> 2 --> 3
        }

        System.out.println("Reading using foreach loop");
        for(String friend : facebookFriends){
            System.out.println(friend);
        }

        System.out.println("Reading using foreach method");
        facebookFriends.forEach(str -> System.out.println(str));

    }
}
