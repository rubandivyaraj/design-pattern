package creational.factory;

public class Suv implements Car{

    @Override
    public void manufacturing() {
        System.out.println("Manufacturing a SUV car");
    }

    @Override
    public void driving() {
        System.out.println("Driving a SUV car");
    }
}
