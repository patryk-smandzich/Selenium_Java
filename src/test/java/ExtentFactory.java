import com.relevantcodes.extentreports.ExtentReports;

import java.io.File;


public class ExtentFactory {
    public static ExtentReports getInstance() {
        ExtentReports extent;

        extent = new ExtentReports("raport.html");
        extent.addSystemInfo("Selenium Version", "2.52");
        return extent;
    }
}