public class StringDemo {
     String name = "jack";
    public static void main(String[] args) {
       // calculateLengthOfAString("ferhanali93");
        String userName = "ferhanali93";
        String obj = new String("ferhanali93");
        int length = userName.length();
        System.out.println(obj);
        char[] strArray = {'J', 'o', 'h', 'n'};
        String strUsingCharArray = new String(strArray);
        System.out.println(strUsingCharArray); // John
        System.out.println("John".length());
        System.out.println("John".charAt(0));
        System.out.println("John".concat("'s"));

    }

    public static void calculateLengthOfAString(String userName){
        String[] array = userName.split("");
        int length = array.length;
        System.out.println(length);
    }


}
