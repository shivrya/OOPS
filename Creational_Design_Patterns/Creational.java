package OOPS.Creational_Design_Patterns;

public class Creational {

    // static holds single instance of the class.
    private static Creational obj1;

    // private constructor prevents from creating object directly outside the class
    private Creational(){

    }

    // this public method provides global access to the object of the class.
    // object is static hence we need method to be static in order to access it
    public static Creational getInstance(){

        if(obj1==null)
            obj1 = new Creational();
        
        return obj1;
    }

}
