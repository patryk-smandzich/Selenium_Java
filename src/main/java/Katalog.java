import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Katalog extends PageObject {
    public Katalog(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }


    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[3]/div[1]/main[1]/div[1]/div[1]/div[1]/span[1]/table[1]/tbody[1]/tr[1]/td[4]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[2]")
    WebElement jednostki;
    @FindBy(xpath = "//div/div/div/table/tbody/tr/td")
    WebElement po;

    public void wpiszJednostki() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(jednostki));
        this.jednostki.sendKeys("PO");
        test.log(LogStatus.INFO, "Wpisano Data końcowa");
    }

    public void clickPO() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(po));
        this.po.click();
        test.log(LogStatus.INFO, "Kliknięto w 00 PO");
    }

//    public void clickPo() throws AWTException, InterruptedException {
//        Thread.sleep(3000);
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_DOWN);
//        robot.keyRelease(KeyEvent.VK_DOWN);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        Thread.sleep(2000);
//    }




}
