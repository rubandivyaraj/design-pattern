package creational.factory;

public class Sedan implements Car {

    @Override
    public void manufacturing() {
        System.out.println("Manufacturing a Sedan car");
    }

    @Override
    public void driving() {
        System.out.println("Driving a Sedan car");
    }
}
