package controlfowdemo;

public class IfElseDemo {

    public static void main(String[] args) {
        IfElseDemo ifElseDemo = new IfElseDemo();
        ifElseDemo.saveMoney(30);
    }

    public void saveMoney(int pocketMoney){
        //int save = pocketMoney - 5;
        /**
         * If your father gives you $20 save $5
         * If he gives you $30 save $15
         * If he gives you <= $15 save nothing
         *
         * */
        /**
        * if (condition--> True/False){
        *     // Everything in this brace will execute if the condition is true
        *   }
        * */
        if (pocketMoney==20){
            int savings = pocketMoney - 15; // $5
            System.out.println("Savings: "+ savings);
        }
        else if(pocketMoney==30){
            int savings = pocketMoney - 15;
            System.out.println("Savings: "+ savings);
        }
        else if(pocketMoney <= 15){
            System.out.println("Save nothing");
        }
        else{
            System.out.println("It's holiday, stay home, no pocket money");
        }
    }

}
