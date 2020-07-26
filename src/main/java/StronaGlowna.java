import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.cert.X509Certificate;

public class StronaGlowna extends PageObject {

    public StronaGlowna(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }

    @FindBy(xpath = "//a[contains(text(),'DLA STUDENTÓW')]")
    WebElement dlaStudena;
    @FindBy(xpath = "//a[contains(text(),'DLA WSZYSTKICH')]")
    WebElement dlaWszytskich;
    @FindBy(xpath = "//a[contains(text(),'KATALOG')]")
    WebElement katalog;
    @FindBy(xpath = "//a[contains(text(),'wyloguj si')]")
    WebElement wyloguj;


    public void clickDlaStudenta() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dlaStudena));
        this.dlaStudena.click();
        test.log(LogStatus.INFO, "Kliknięto dla studenta");
    }

    public void clickDlaWszystkich() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dlaWszytskich));
        this.dlaWszytskich.click();
        test.log(LogStatus.INFO, "Kliknięto dla wszystkich");
    }

    public void clickKatalog() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(katalog));
        this.katalog.click();
        test.log(LogStatus.INFO, "Kliknięto Katalog");
    }

    public void clickWyloguj() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(wyloguj));
        this.wyloguj.click();
        test.log(LogStatus.INFO, "Kliknięto wyloguj się");
    }



}
