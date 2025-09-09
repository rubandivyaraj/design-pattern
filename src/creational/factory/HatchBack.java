package creational.factory;

public class HatchBack implements Car {
    @Override
    public void manufacturing() {
        System.out.println("Manufacturing a HatchBack car");
    }

    @Override
    public void driving() {
        System.out.println("Driving a HatchBack car");
    }
}
