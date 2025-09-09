package creational.prototype;

public class ExcelReport implements Report {

    public ExcelReport() {
    }

    @Override
    public Report clone() {
        return new ExcelReport();
    }

    @Override
    public void export(String format) {
        System.out.println("Exporting Excel report in " + format + " format.");
    }
}
