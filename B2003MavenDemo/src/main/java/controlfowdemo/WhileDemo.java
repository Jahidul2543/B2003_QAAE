package controlfowdemo;

public class WhileDemo {

    public static void main(String[] args) {
        WhileDemo whileDemo = new WhileDemo();
        whileDemo.lockPhoneForUnlockAttempt(6);
    }

    /**
     * User can take attempt to provide invalid password for 5 times
     *  On 6th attempt lock him for next 30 minutes
     * while (truee/false){
     *     if condition is true execute lines of code within this brace
     * }
     * */

    public void lockPhoneForUnlockAttempt(int attempt){
        int i = 1;
        while (i < attempt){ // 0+1 = 1
            System.out.println("Allow user to try to unlock");
            i++; // i = i + 1 // i = 0
        }
        System.out.println("Lock the phone for next 30 minutes");
    }

}
