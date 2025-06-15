// File: TightCouplingExample.java (tên file nên là TightCouplingExample.java)

import java.util.logging.Logger;

class Printer {
    private static final Logger logger = Logger.getLogger(Printer.class.getName());

    void print(String message) {
        if (logger.isLoggable(java.util.logging.Level.INFO)) {
            logger.info(String.format("%s", message));
        }
    }
}

class Report {
    private final Printer printer;

    Report(Printer printer) {
        this.printer = printer;
    }

    void generate(String reportMessage) {
        printer.print(reportMessage);
    }
}

class TightCouplingExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Report report = new Report(printer);

        // Truyền giá trị khác nhau để tránh cảnh báo "giá trị luôn cố định"
        report.generate("Generating report for June 2025...");
        report.generate("Generating report for July 2025...");
    }
}
