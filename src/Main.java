public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        /**
         *  Creating a var
         */
        int var1 = 1;


        /**
         *  Types of variables
         */
        byte byteVar = 1;       // -128     ...     127
        short shortVar = 1;     // -32,768  ...     32767
        int intVar = 1;         // -2^31    ...     2^31 - 1
        long longVar = 1;       // -2^63    ...     2^63 - 1

        float floatVar = 1.0f;  // Be careful, there is an 'f' at the end
        double doubleVar = 1.0; //

        boolean boolVar = true; // true ... false
        char charVar = 'a';     // any character


        /**
         * Operation between vars
         */
        int var3 = 3, var4 = 4;
        int var5;

        var5 = var3 + var4;
        var5 = var3 + var4;
        var5 = var3 * var4;
        var5 = var3 / var4;

        // the next two lines are equivalent
        var5 = var5 + var4;
        var5 += var4;


        /**
         * Using a function
         */
        int var2 = addTwo(var1);
    }

    public static int addTwo(int number) {
        int result = number + 2;
        return result;
    }


    /**
     * Using Objects
     */











}
