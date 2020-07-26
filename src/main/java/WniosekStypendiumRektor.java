import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WniosekStypendiumRektor extends PageObject {
    public WniosekStypendiumRektor(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }

    @FindBy(xpath = "//td[@id='przyciskDodajWiersz']//img")
    WebElement dodaj;
    @FindBy(xpath = "//input[@id='searcher']")
    WebElement szukaj;
    @FindBy(xpath = "//label[contains(text(),'Academia Cordoba')]")
    WebElement academiaCordoba;
    @FindBy(id = "_pw_programy_dodatkowe[0][opis]")
    WebElement kierunek;
    @FindBy(xpath = "//label[contains(text(),'Pierwszy stopie')]")
    WebElement pierwszyStopien;
    @FindBy(xpath = "//label[contains(text(),'czone')]")
    WebElement ukonczone;
    @FindBy(name = "_pw_programy_dodatkowe[0][daty][od]")
    WebElement dataPoczatkowa;
    @FindBy(name = "_pw_programy_dodatkowe[0][daty][do]")
    WebElement dataKoncowa;
    @FindBy(xpath = "//label[contains(text(),'zgodne ze stanem')]")
    WebElement potwierdzenie;
    @FindBy(name = "\\USOSweb\\Wnioski\\Akcje\\Wypelnienia\\Dalej")
    WebElement dalej;
    @FindBy(xpath = "//body//label[1]")
    WebElement srednia;



    public void clickDodaj() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dodaj));
        this.dodaj.click();
        test.log(LogStatus.INFO, "Kliknięto dodaj");
    }

    public void wpiszSzukaj() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(szukaj));
        this.szukaj.sendKeys("Academia Cordoba");
        test.log(LogStatus.INFO, "Wpisano Academia Cordoba w polu Wyszukaj");
    }

    public void clickAcademiaCordoba() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(academiaCordoba));
        this.academiaCordoba.click();
        test.log(LogStatus.INFO, "Kliknięto Academia Cordoba");
    }

    public void wpiszKierunek() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(kierunek));
        this.kierunek.sendKeys("IT");
        test.log(LogStatus.INFO, "Wpisano Kierunek IT");
    }

    public void clickPierwszyStopien() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(pierwszyStopien));
        this.pierwszyStopien.click();
        test.log(LogStatus.INFO, "Kliknięto Pierwszy Stopień");
    }

    public void clickUkonczone() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ukonczone));
        this.ukonczone.click();
        test.log(LogStatus.INFO, "Kliknięto ukończone");
    }

    public void wpiszDataPoczatkowa() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dataPoczatkowa));
        this.dataPoczatkowa.sendKeys("2020-03-01");
        test.log(LogStatus.INFO, "Wpisano Data poczatkowa");
    }

    public void wpiszDataKoncowa() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dataKoncowa));
        this.dataKoncowa.sendKeys("2020-03-16");
        test.log(LogStatus.INFO, "Wpisano Data końcowa");
    }

    public void clickPotwierdzenie() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(potwierdzenie));
        this.potwierdzenie.click();
        test.log(LogStatus.INFO, "Kliknięto potwierdzenie");
    }

    public void clickDalej() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dalej));
        this.dalej.click();
        test.log(LogStatus.INFO, "Kliknięto dalej");
    }

    public void clickSrednia() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(srednia));
        this.srednia.click();
        test.log(LogStatus.INFO, "Kliknięto w średnia");
    }



    public void wypelnijWniosek() throws InterruptedException {
        clickDodaj();
        Thread.sleep(2000);
        wpiszSzukaj();
        clickAcademiaCordoba();
        wpiszKierunek();
        clickPierwszyStopien();
        clickUkonczone();
        wpiszDataPoczatkowa();
        wpiszDataKoncowa();
        clickPotwierdzenie();
        clickDalej();
    }

}
