package creational.factory;

public class CarFactory {

    // Factory method to create car objects based on type
    // Making this class static because we are calling it in main method without creating object of CarFactory
    public static void buyCar(String type) {
        Car car;
        switch (type.toLowerCase()) {
            case "suv" -> car = new Suv();
            case "sedan" -> car = new Sedan();
            case "hatchback" -> car = new HatchBack();
            default -> {
                System.out.println("Unknown car type: " + type);
                return;
            }
        }
        car.driving();
        car.manufacturing();
    }

}
