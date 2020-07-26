import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class OcenyStudenta extends  PageObject {

    public OcenyStudenta(WebDriver driver, ExtentTest test) {
        super(driver, test);
    }

    @FindBy(xpath = "//tbody[@id='tab2']//tr[1]//td[3]//div[1]//span[1]")
    WebElement bazyDanychWElektroenergetyceWyklad;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[2]//td[3]//div[1]//span[1]")
    WebElement metodyKomputeroweBadanUrzadzenWyklad;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[2]//td[3]//div[2]//span[1]")
    WebElement metodyKomputeroweBadanUrzadzenLab;
    @FindBy(xpath = "//tbody[@id='tab2']//div[3]//span[1]")
    WebElement metodyKomputeroweBadanUrzadzenProjekt;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[3]//td[3]//div[1]//span[1]")
    WebElement podstawySterowniaWElektroenergetyceWyklad;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[3]//td[3]//div[2]//span[1]")
    WebElement podstawySterowniaWElektroenergetyceLab;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[4]//td[3]//div[1]//span[1]")
    WebElement pracaPrzejsciowaProjekt;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[5]//td[3]//div[1]//span[1]")
    WebElement etykaNowychTechnologiiWyklad;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[6]//td[3]//div[1]//span[1]")
    WebElement multimedialneTechnikiPrezentacjiWyklad;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[6]//td[3]//div[2]//span[1]")
    WebElement multimedialneTechnikiPrezentacjiProjekt;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[7]//td[3]//div[1]//span[1]")
    WebElement akwizycjaITransmisjaDanychWyklad;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[7]//td[3]//div[2]//span[1]")
    WebElement akwizycjaITransmisjaDanychProjekt;
    @FindBy(xpath = "//tbody[@id='tab2']//tr[8]//td[3]//div[1]//span[1]")
    WebElement podstawyElektroenergetykiWyklad;

    public String getbazyDanychWElektroenergetyceWyklad() {
        return bazyDanychWElektroenergetyceWyklad.getText();
    }

    public String getmetodyKomputeroweBadanUrzadzenWyklad(){
        return metodyKomputeroweBadanUrzadzenWyklad.getText();
    }

    public String getmetodyKomputeroweBadanUrzadzenLab(){
        return metodyKomputeroweBadanUrzadzenLab.getText();
    }

    public String getmetodyKomputeroweBadanUrzadzenProjekt(){
        return metodyKomputeroweBadanUrzadzenProjekt.getText();
    }

    public String getpodstawySterowniaWElektroenergetyceWyklad(){
        return podstawySterowniaWElektroenergetyceWyklad.getText();
    }

    public String getpodstawySterowniaWElektroenergetyceLab(){
        return podstawySterowniaWElektroenergetyceLab.getText();
    }

    public String getpracaPrzejsciowaProjekt(){
        return pracaPrzejsciowaProjekt.getText();
    }

    public String getetykaNowychTechnologiiWyklad(){
        return etykaNowychTechnologiiWyklad.getText();
    }

    public String getmultimedialneTechnikiPrezentacjiWyklad(){
        return multimedialneTechnikiPrezentacjiWyklad.getText();
    }

    public String getmultimedialneTechnikiPrezentacjiProjekt(){
        return multimedialneTechnikiPrezentacjiProjekt.getText();
    }

    public String getakwizycjaITransmisjaDanychWyklad(){
        return akwizycjaITransmisjaDanychWyklad.getText();
    }

    public String getakwizycjaITransmisjaDanychProjekt(){
        return akwizycjaITransmisjaDanychProjekt.getText();
    }

    public String getpodstawyElektroenergetykiWyklad(){
        return podstawyElektroenergetykiWyklad.getText();
    }

    public ArrayList podglad(){
        ArrayList podglad = new ArrayList();
        podglad.add(getbazyDanychWElektroenergetyceWyklad());
        podglad.add(getmetodyKomputeroweBadanUrzadzenWyklad());
        podglad.add(getmetodyKomputeroweBadanUrzadzenLab());
        podglad.add(getmetodyKomputeroweBadanUrzadzenProjekt());
        podglad.add(getpodstawySterowniaWElektroenergetyceWyklad());
        podglad.add(getpodstawySterowniaWElektroenergetyceLab());
        podglad.add(getpracaPrzejsciowaProjekt());
        podglad.add(getetykaNowychTechnologiiWyklad());
        podglad.add(getmultimedialneTechnikiPrezentacjiWyklad());
        podglad.add(getmultimedialneTechnikiPrezentacjiProjekt());
        podglad.add(getakwizycjaITransmisjaDanychWyklad());
        podglad.add(getakwizycjaITransmisjaDanychProjekt());
        podglad.add(getpodstawyElektroenergetykiWyklad());
        return podglad;
    }

}
