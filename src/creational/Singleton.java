package creational;

/*
* How to implement creational.Singleton design pattern in Java?
* creational.Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
* Here is a simple implementation of the creational.Singleton pattern in Java:
* */
public class Singleton {

    private static Singleton instance;

    private Singleton(){
       // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (instance == null) {
                System.out.println("Creating new instance");
                instance = new Singleton();
            }
            return instance;
        }
    }

    public void showMessage(){
        System.out.println("Hello World from Singleton method!");
    }

}
