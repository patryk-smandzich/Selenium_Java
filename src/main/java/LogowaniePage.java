import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogowaniePage extends PageObject {

    public LogowaniePage(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }

    @FindBy(name = "submit")
    WebElement zaloguj;
    @FindBy(id = "username")
    WebElement identyfikator;
    @FindBy(id = "password")
    WebElement haslo;

    public void clickZaloguj() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(zaloguj));
        this.zaloguj.click();
        test.log(LogStatus.INFO, "Kliknięto Zaloguj");
    }

    public void wpiszIdentyfikator(String name) {
        this.identyfikator.clear();
        this.identyfikator.sendKeys(name);
        test.log(LogStatus.INFO, "Wpisano Identyfikator");
    }

    public void wpiszHaslo(String haslo) {
        this.haslo.clear();
        this.haslo.sendKeys(haslo);
        test.log(LogStatus.INFO, "Wpisano Hasło");
    }

    public void logowanie(String haslo, String identyfikator){
        wpiszIdentyfikator(identyfikator);
        wpiszHaslo(haslo);
        clickZaloguj();
    }

}
