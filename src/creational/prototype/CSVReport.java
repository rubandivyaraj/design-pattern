package creational.prototype;

public class CSVReport implements Report {

    public CSVReport() {
    }

    @Override
    public Report clone() {
        return new CSVReport();
    }

    @Override
    public void export(String format) {
        System.out.println("Exporting CSV report in " + format + " format.");
    }
}
