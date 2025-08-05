package OOPS.Creational_Design_Patterns;

public class Singleton_early {

    // static holds single instance of the class.
    private static final Singleton_early obj1 = new Singleton_early();

    // private constructor prevents from creating object directly outside the class
    private Singleton_early(){

    }

    // this public method provides global access to the object of the class.
    public Singleton_early getInstance(){
        return obj1;
    }
}