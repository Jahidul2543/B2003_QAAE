public class ReturnTypeDemo {

    public static void main(String[] args) {
        ReturnTypeDemo returnTypeDemo = new ReturnTypeDemo();
        int flour = returnTypeDemo.grind(2); // 1 KG
        System.out.println("Flour made by flour maker: " + flour);
        int moneyReturned = returnTypeDemo.getMoney("visa", "john2453", 200);
        System.out.println("Money Returned: " + moneyReturned);
    }

    public int grind(int amountOFWheat) {
        System.out.println("Grind wheat " + amountOFWheat + " KG and generate flour when provided some wheat");
        int flour = amountOFWheat - 1;
        return flour;
    }

    public int getMoney(String atmCard, String password, int amountRequested) {
        System.out.println("If User Name and password and card is good provide money");
        int moneyToReturn = amountRequested;
        String pass = password;
        return moneyToReturn;
    }
}

