import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        /**
         *  Creating a var
         */
        int var1 = 1;
        int var2 = 2;


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
         * Conditions
         */
        // Filling the var with random value
        var1 = new Random().nextInt(100);
        var2 = new Random().nextInt(100);
        var3 = new Random().nextInt(100);
        var4 = new Random().nextInt(100);

        if (var1 == var2) {
            System.out.println("var1 and var2 have the same values");
        } else {
            System.out.println("var1 and var2 have different values");
        }

        if (var1 == var2) {}    // equality
        if (var1 != var2) {}    // difference
        if (var1 < var2) {}     // smaller than
        if (var1 > var2) {}     // bigger than
        if (var1 <= var2) {}    // smaller of equal
        if (var1 >= var2) {}    // bigger of equal

        if (var1 < var2 && var3 == var4) {
            System.out.println("var1 smaller than var2 and var3 equal to var4");
        }
        if (var1 != var2 || var3 >= var4) {
            System.out.println("var1 different than var2 or var3 bigger of equal to var4");
        }


        /**
         * Using a function
         */
        var2 = addTwo(var1);
    }

    public static int addTwo(int number) {  // input(s)
        // Begin work
        int result = number + 2;

        // End work

        return result;  // output
    }




    /**
     * Using Objects
     */











}
