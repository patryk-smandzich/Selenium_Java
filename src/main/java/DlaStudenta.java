import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DlaStudenta extends PageObject {

    public DlaStudenta(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }

    @FindBy(xpath = "//a[contains(text(),'Oceny ko')]")
    WebElement ocenyKoncowe;

    public void clickOcenyKoncowe() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ocenyKoncowe));
        this.ocenyKoncowe.click();
        test.log(LogStatus.INFO, "Kliknięto Oceny końcowe");
    }

}
