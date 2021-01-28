public class Light {

    /**
     * Properties of light
     *
     * */
    int weight;
    String color;
    int length;
    String shape;
    int radius;

    // This is single line comment
    /**
    * Write some lines
    * Some info
    * All this info has no meaning to the JVM
    * This is only for code readability
    * This is block comment
    * */
    // This is your Light factory
    // Constructor --> It constructs Objects
    public Light(int weight, String color, int length, String shape, int radius){
        this.weight = weight;
        this.color = color;
        this.length = length;
        this.shape = shape;
        this.radius = radius;
        System.out.println("You are inside Light Factory");
    }

    public static void main(String args[]){
        System.out.println("This is my first java application");
        /**
         * We have Light Factory ready at line 21
         * Let us create light object
         * */
         Light myTableLight = new Light(100, "Black", 7, "round", 2);
         Light myLivingRoomLight = new Light(70,"White",4, "oval", 1);

         myTableLight.turnOnLights("MyTableLight");
         myLivingRoomLight.turnOnLights("MyLivingRoomLight");
    }

    /**
     *
     *  In Java other name of function is method.
     *  We need to write a method/function which can turn on our lights
     *  turnOnLights() --> Method Name
     *  public --> Access Modifier --> WHo can view or use this method
     *  void --> method turnOnLights() returns nothing
     * */

    public void turnOnLights(String lightName){
        // We can write bunch of lines of code to implement this function
        // To keep it simple we will execute one line of code, a print statement
        System.out.println("Light turned on " + lightName );
    }
}
