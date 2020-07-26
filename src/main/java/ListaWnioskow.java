import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.cert.X509Certificate;

public class ListaWnioskow extends PageObject {

    public ListaWnioskow(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }


    @FindBy(xpath = "//td[@id='Aplikowanie46Kolumna4']//a[@class='tylkoJedenKlik'][contains(text(),'zacznij wype')]")
    WebElement wniosekOStypendiumRektora;
    @FindBy(xpath = "//a[contains(text(),'szczegó')]")
    WebElement szczegoly;

    public void clickWniosekOStypendiumRektora() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(wniosekOStypendiumRektora));
        this.wniosekOStypendiumRektora.click();
        test.log(LogStatus.INFO, "Kliknięto w wniosek O Stypendium Rektora");
    }


    public void clickSzczegly() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(szczegoly));
        this.szczegoly.click();
        test.log(LogStatus.INFO, "Kliknięto w szczególy wniosku");
    }


}
