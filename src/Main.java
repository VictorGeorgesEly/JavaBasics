import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    /**
     * You can find here all the basics of java
     */
    public static void b_a_ba() {
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
        // Finished filling vars


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
        var2 = multiplyTwoNumber(5, 10);

        displayDeltaAndX1X2(-3, -4, 5);
    }




    /**
     * Function examples
     */
    public static int addTwo(int number) {  // input(s)
        // Begin work
        int result = number + 2;

        // End work

        return result;  // output
    }

    public static int multiplyTwoNumber(int number1, int number2) { // input(s)
        // Begin work
        System.out.println("Multiplying " + number1 + " and " + number2);

        int result = number1 * number2;
        // End work


        return result;  // output
    }

    public static void displayDeltaAndX1X2(int a, int b, int c) { // input(s)
        // Begin work
        double delta = Math.pow(b, 2) - ( 4 * a * c );

        System.out.println("delta = " + delta);

        if (delta > 0) {
            double x1 = (- b - Math.sqrt(delta) ) / (2 * a);
            double x2 = (- b + Math.sqrt(delta) ) / (2 * a);
            System.out.println("X1 = " + x1 + " X2 = " + x2);
        } else if (delta == 0) {
            double x1 = (- b) / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("There is no real solution");
        }

        // End work

        // There is no return statement, this is a void function !

    }





    /**
     * Using objects
     */
    public static void usingObjects() {
        // Person = The class "Person"
        // amalric = The name of the object of type "Person"
        // new Person(XX, XX, XX) = The constructor of the object (Must be used to instanciate an object)
        Person amalric = new Person("Amalric", 20, true);

        int ageInTenYears = amalric.getAgeInTenYears();
        String gender = amalric.whatGender();

    }


    /**
     * Using Tables
     */
    public static void usingTables() {
        int listSize = 5;
        int intTable[] = new int[listSize];

        for (int it = 0; it < listSize; it++) {
            intTable[it] = it;
        }

        for (int it = 0; it < listSize; it++) {
            System.out.print(intTable[it] + " ");
        }
    }

    /**
     * Using List
     */
    public static void usingList() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person());
        Person somebody = personList.get(0);

    }


    /**
     * Using Maps
     */
    public static void usingMap() {
        Map<String, Person> userList = new HashMap<>();
        userList.put("Bob", new Person("Bob", 42, true));
        userList.put("Alice", new Person("Alice", 76, false));

        Person bob = userList.get("Bob");
        Person alice = userList.get("Alice");
    }



    private Map<String, List<Person>> listToMap(List<Person> list){
        //List<Person> list = new ArrayList<>();
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : list){
            map.computeIfAbsent(person.getName(), k -> new ArrayList<>());
            map.get(person.getName()).add(person);
        }
        return map;
    }











}
