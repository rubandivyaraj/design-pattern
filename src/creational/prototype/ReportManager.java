package creational.prototype;

public class ReportManager {
    private final Report csvReport;
    private final Report excelReport;

    public ReportManager() {
        this.csvReport = new CSVReport();
        this.excelReport = new ExcelReport();
    }

    public Report createCSVReport() {
        return csvReport.clone();
    }

    public Report createExcelReport() {
        return excelReport.clone();
    }
}
