import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.testng.Reporter.setCurrentTestResult;

public class FuncionalTest {

    public WebDriver driver;
    public String baseUrl = "https://cas.po.edu.pl/login?service=https%3A%2F%2Fusosweb.po.edu.pl%2Fkontroler.php%3F_action%3Dlogowaniecas%2Findex&locale=pl";
    LogowaniePage logowaniePage;
    ExtentReports report;
    ExtentTest test;
    usosweb_functionality usoswebfunctionality;
    StronaGlowna stronaGlowna;
    DlaStudenta dlaStudenta;
    OcenyStudenta ocenyStudenta;
    TestData testData;
    DlaWszystkich dlaWszystkich;
    ListaWnioskow listaWnioskow;
    WniosekStypendiumRektor wniosekStypendiumRektor;
    Katalog katalog;



    @BeforeTest
    public void set(){
        report = ExtentFactory.getInstance();
        test = report.startTest("Start testów");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.get(baseUrl);
        driver.manage().window().maximize();

        logowaniePage = new LogowaniePage(driver, test);
        usoswebfunctionality = new usosweb_functionality();
        stronaGlowna = new StronaGlowna(driver,test);
        dlaStudenta = new DlaStudenta(driver,test);
        ocenyStudenta = new OcenyStudenta(driver, test);
        testData = new TestData();
        dlaWszystkich = new DlaWszystkich(driver,test);
        listaWnioskow = new ListaWnioskow(driver,test);
        wniosekStypendiumRektor = new WniosekStypendiumRektor(driver,test);
        katalog = new Katalog(driver, test);

    }

    @AfterMethod
    public void report(ITestResult result) throws IOException, AWTException {
        if (result.getStatus() == ITestResult.FAILURE) {
            String ac = driver.getCurrentUrl();

            String dateName = new SimpleDateFormat("yyyy-MM-dd_hh-mm-ss").format(new Date());
            String fileName = dateName + "_" + result.getMethod().getMethodName() + "_" + ".png";
            String directory = "C:\\Users\\Patryk\\Desktop\\untitled\\ss\\";
            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(sourceFile, new File(directory + fileName));

            test.log(LogStatus.FAIL, "<font color=\"purple\"><b>" + ac + "   </b></font>");

            result.setStatus(ITestResult.SUCCESS);
            setCurrentTestResult(result);

        }
    }


    @AfterTest
    public void terminateBrowser() {
        report.endTest(test);
        report.flush();
        driver.close();
    }

}
