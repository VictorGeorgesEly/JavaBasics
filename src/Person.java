/**
 * (commentaires)
 *
 * @author Amalric Lombard de Buffières <amalric.debuffieres@icloud.com>
 * @version 1.0.0
 */
public class Person {
    /**
     * Attributes
     */
    private String name;
    private int age;
    private boolean isAMale;

    /**
     * Default Constructor
     */
    public Person() {
    }

    /**
     * My custom constructor
     */
    public Person(String name, int age, boolean isAMale) {
        this.name = name;
        this.age = age;
        this.isAMale = isAMale;
    }

    /**
     * Getters and Setter
     */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public boolean isAMale() {
        return isAMale;
    }
    public void setAMale(boolean AMale) {
        isAMale = AMale;
    }


    /**
     * @return The age of the user 10 years later
     */
    public int getAgeInTenYears() {
        int ageInTenYears = this.age + 10;
        return ageInTenYears;
    }

    /**
     * @return The gender of the Person as a String
     */
    public String whatGender() {
        if (isAMale) {
            return "Male";
        } else {
            return "Female";
        }
    }
}
