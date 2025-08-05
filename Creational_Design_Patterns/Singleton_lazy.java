package OOPS.Creational_Design_Patterns;

public class Singleton_lazy {

    // static holds single instance of the class.
    private static Singleton_lazy obj1;

    // private constructor prevents from creating object directly outside the class
    private Singleton_lazy(){

    }

    // this public method provides global access to the object of the class.
    // object is static hence we need method to be static in order to access it
    public static Singleton_lazy getInstance(){

        if(obj1==null)
            obj1 = new Singleton_lazy();
        
        return obj1;
    }
}