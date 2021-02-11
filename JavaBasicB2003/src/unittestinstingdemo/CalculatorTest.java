package unittestinstingdemo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    /**
     * Write some code to test add() from Calculator class
     * 1. 2 + 4 =6 --> Test Passed
     * 2. -2 + 3 = 1 -->
     * 3. 5 + 5 (10) we are going to compare with 11, if it is not same 10 != 11, test is passed .
     * */
    @Test
    public static void addTest(){
        Calculator calculator = new Calculator();
      int actualResult =  calculator.add(2,4);
      int expectedResult = 6;

        Assert.assertEquals(actualResult, expectedResult); // Test Passed
        System.out.println("Test Passed");

        //expectedResult == actualResult
        // Test Passed
       /* boolean testPassed;
        if(actualResult == expectedResult){

             testPassed = true;
            System.out.println("Test Passed: " + actualResult + '=' + expectedResult);
        }
        else {
            System.out.println("Test Failed: " + actualResult + "!=" + expectedResult);
             testPassed = false;
        }*/
    }

    /**
     * Write some code to test deduct() from Calculator class
     *
     * */
}
