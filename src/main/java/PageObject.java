import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    protected WebDriver driver;
    ExtentTest test;

    public PageObject(WebDriver driver, ExtentTest test) {
        this.driver = driver;
        this.test = test;
        PageFactory.initElements(driver, this);
    }

}
