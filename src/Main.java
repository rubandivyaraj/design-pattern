import creational.Singleton;
import creational.builder.Meal;
import creational.factory.CarFactory;
import creational.prototype.Report;
import creational.prototype.ReportManager;

public class Main {
    public static void main(String[] args) {

        /* Check the singleton pattern. It won't create a new instance the second time.*/
        System.out.println("\n***** Singleton Pattern ***** ");
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.showMessage();

        /* Check the factory pattern. It will create different types of cars based on the input. */
        System.out.println("\n***** Factory Pattern ***** ");
        CarFactory carFactory = new CarFactory();
        CarFactory.buyCar("SUV");
        CarFactory.buyCar("Sedan");
        CarFactory.buyCar("HatchBack");
        CarFactory.buyCar("abcd");

        /* Check the builder pattern. It will create a complex object step by step. */
        System.out.println("\n***** Builder Pattern *****");
        Meal meal = new Meal.MealBuilder()
                .setMainCourse("Steak")
                .setSideDish("Fries")
                .setDrink("Coke")
                .build();
        System.out.println(meal.toString());

        System.out.println("\n***** Prototype Pattern *****");
        ReportManager reportManager = new ReportManager();
        Report csvReport = reportManager.createCSVReport();
        Report excelReport = reportManager.createExcelReport();

        csvReport.export("CSV");
        excelReport.export("EXCEL");

    }

}