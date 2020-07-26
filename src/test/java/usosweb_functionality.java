import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.ArrayList;

public class usosweb_functionality extends FuncionalTest {

    @Test(priority = 0)
    public void start() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY </b></font>");

        String expectedTitle = "Wprowadź swój identyfikator sieciowy i hasło";
        WebElement actualData = driver.findElement(By.xpath("//h2[contains(text(),'swój identyfikator sieciowy i has')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona startowa otwarta </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona startowa nie otwarta </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 1, dataProvider = "logowanie_dane", dataProviderClass = TestData.class)
    public void Logowanie(String haslo, String identyfikator) throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST LOGOWANIA </b></font>");
        logowaniePage.logowanie(identyfikator, haslo);

        String expectedTitle = "Patryk Smandzich";
        WebElement actualData = driver.findElement(By.xpath("//b[contains(text(),'Patryk Smandzich')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Zalogowano</b> </font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Nie zalogowano. </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 2)
    public void dlaStudenta() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY DLA STUDENTA </b></font>");

        stronaGlowna.clickDlaStudenta();

        String expectedTitle = "Oceny końcowe";
        WebElement actualData = driver.findElement(By.xpath("//a[contains(text(),'Oceny ko')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona dla studenta działa </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona dla studenta nie działa </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 3)
    public void ocenyKoncowe() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST SPRAWDZENIA OCEN </b></font>");

        dlaStudenta.clickOcenyKoncowe();

        ArrayList podglad = ocenyStudenta.podglad();
        String[][] data = testData.oceny_test();

        for (int i = 0; i < data.length; i++) {

            Object testData = data[i][0];
            Object interfejs = podglad.get(i);

            if (testData.equals(interfejs)) {
                test.log(LogStatus.PASS, "<font color=\"green\"><b>[" + testData + "] = [" + interfejs + "]</b></font>");
            } else {
                test.log(LogStatus.FAIL, "<font color=\"red\"><b>Powinno być [" + testData + "]     a jest [" + interfejs + " ]</b></font>");
                test.log(LogStatus.FAIL, "<font color=\"red\"><b> Miejsce: " + data[i][1] + "   </b></font>");
            }
            Assert.assertEquals(testData, interfejs);
        }
    }

    @Test(priority = 4)
    public void dlaWszystkich() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY DLA WSZYTSKICH </b></font>");

        stronaGlowna.clickDlaWszystkich();

        String expectedTitle = "Wnioski";
        WebElement actualData = driver.findElement(By.xpath("//a[contains(text(),'Wnioski')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona dla wszystkich działa </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona dla wszytskich nie działa </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 5)
    public void wnioski() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY WNIOSKI </b></font>");

        dlaWszystkich.clickWnioski();

        String expectedTitle = "Lista wniosków";
        WebElement actualData = driver.findElement(By.xpath("//h1[contains(text(),'Lista wniosków')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona dla wszystkich działa </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona dla wszytskich nie działa </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 6)
    public void wniosekOStypendiumRektora() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY WNIOSKI </b></font>");

        listaWnioskow.clickWniosekOStypendiumRektora();

        String expectedTitle = "Wniosek o stypendium rektora dla studentów 2019/20l";
        WebElement actualData = driver.findElement(By.xpath("//h1[contains(text(),'Wniosek o stypendium rektora dla studentów 2019')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona dla wszystkich działa </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona dla wszytskich nie działa </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 7)
    public void wypelnienieWniosku1() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST WYPŁNIENIA 1WSZEJ STRONY WNIOSKU </b></font>");

        wniosekStypendiumRektor.wypelnijWniosek();

        String expectedTitle = "Ekran: 1";
        WebElement actualData = driver.findElement(By.xpath("//h2[contains(text(),'Ekran: 1')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Wypełniono 1wszą stronę </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Nie wypełniono 1wszej strony  </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 8)
    public void wypelnienieWniosku2() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST WYPŁNIENIA 2GIEJ STRONY WNIOSKU </b></font>");

        wniosekStypendiumRektor.clickDalej();

        String expectedTitle = "Ekran: 2";
        WebElement actualData = driver.findElement(By.xpath("//h2[contains(text(),'Ekran: 2')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Wypełniono 2gą stronę </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Nie wypełniono 2giej strony  </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 9)
    public void wypelnienieWniosku3() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST WYPŁNIENIA 3CIEJ STRONY WNIOSKU </b></font>");

        wniosekStypendiumRektor.clickDalej();

        String expectedTitle = "Ekran: 3";
        WebElement actualData = driver.findElement(By.xpath("//h2[contains(text(),'Ekran: 3')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Wypełniono 3cią stronę </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Nie wypełniono 3ciej strony  </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 9)
    public void wypelnienieWniosku4() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST WYPŁNIENIA 4TEJ STRONY WNIOSKU </b></font>");

        wniosekStypendiumRektor.clickDalej();
        wniosekStypendiumRektor.clickSrednia();

        String expectedTitle = "Ekran: 4";
        WebElement actualData = driver.findElement(By.xpath("//h2[contains(text(),'Ekran: 4')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Wypełniono 4ta stronę </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Nie wypełniono 4tej strony  </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 10)
    public void wniosekGotowy() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OSTANIEGO ETAPU WYPEŁNIANIA WNIOSKU</b></font>");

        wniosekStypendiumRektor.clickDalej();

        String expectedTitle = "Wniosek jest gotowy do zatwierdzenia.";
        WebElement actualData = driver.findElement(By.xpath("//span[@name='info_ekran_koncowy']"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", "").substring(0,37))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Wniosek gotowy </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Wniosek nie gotowy </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", "").substring(0,37), expectedTitle);
    }

    @Test(priority = 11)
    public void dlaWszystkich2() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY DLA WSZYTSKICH </b></font>");

        stronaGlowna.clickDlaWszystkich();

        String expectedTitle = "Wnioski";
        WebElement actualData = driver.findElement(By.xpath("//a[contains(text(),'Wnioski')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona dla wszystkich działa </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona dla wszytskich nie działa </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 12)
    public void wnioski2() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST OTWARCIA STRONY WNIOSKI </b></font>");

        dlaWszystkich.clickWnioski();

        String expectedTitle = "Lista wniosków";
        WebElement actualData = driver.findElement(By.xpath("//h1[contains(text(),'Lista wniosków')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona dla wszystkich działa </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona dla wszytskich nie działa </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }


    @Test(priority = 13)
    public void wniosekSzczegoly() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST SPRAWDENIA DANYCH WNIOSKU </b></font>");

        listaWnioskow.clickSzczegly();

        String expectedTitle = "Academia Cordoba";
        WebElement actualData = driver.findElement(By.xpath("//td[contains(text(),'Academia Cordoba')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Wniosek zapisany prawidłowo </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Wniosek nie zapisany prawidłowo </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 14)
    public void katalog() throws InterruptedException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST SPRAWDENIA DANYCH WNIOSKU </b></font>");

        stronaGlowna.clickKatalog();

        String expectedTitle = "Jednostki";
        WebElement actualData = driver.findElement(By.xpath("//a[contains(text(),'Jednostki')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona Katalog otwarła się </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona Katalog nie otwarła się </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 15)
    public void katalogSzukaj() throws InterruptedException, AWTException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST WYSZUKIWANIA W KATALOG </b></font>");

        katalog.wpiszJednostki();
        katalog.clickPO();

        String expectedTitle = "Politechnika Opolska - opłaty w EURO";
        WebElement actualData = driver.findElement(By.xpath("//h1[@class='uwb-inline-heading']"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona Katalog otwarła się </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona Katalog nie otwarła się </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }

    @Test(priority = 16)
    public void wyloguj() throws InterruptedException, AWTException {

        test.log(LogStatus.INFO, "<font color=\"blue\"><b>" + "  TEST WYLOGUJ </b></font>");

        stronaGlowna.clickWyloguj();

        String expectedTitle = "Udane wylogowanie";
        WebElement actualData = driver.findElement(By.xpath("//h2[contains(text(),'Udane wylogowanie')]"));

        if (expectedTitle.equals(actualData.getText().replace("\n", "").replace("\r", ""))) {
            test.log(LogStatus.PASS, "<font color=\"green\"><b> Strona Katalog otwarła się </b></font>");
        } else {
            test.log(LogStatus.FAIL, "<font color=\"red\"><b> Strona Katalog nie otwarła się </b> </font> ");
        }
        Assert.assertEquals(actualData.getText().replace("\n", "").replace("\r", ""), expectedTitle);
    }






}
