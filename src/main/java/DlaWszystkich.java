import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DlaWszystkich extends PageObject {
    public DlaWszystkich(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }

    @FindBy(xpath = "//a[contains(text(),'Wnioski')]")
    WebElement wnioski;

    public void clickWnioski() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(wnioski));
        this.wnioski.click();
        test.log(LogStatus.INFO, "Kliknięto w wniski");
    }


}
