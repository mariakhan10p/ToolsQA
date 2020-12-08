package com.tenpearls.demoproject.practiceform;

import com.codeborne.selenide.Condition;
import com.tenpearls.demoproject.utils.ConfigUtil;
import org.openqa.selenium.By;

import java.util.Properties;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    private By xpathForm = By.xpath("//*/h5[contains(.,\"Forms\")]");
    private By xpathPracticeForm = By.xpath("//*[@id=\"item-0\"]/span[contains(.,\"Practice Form\")]");
    private By idFirstName = By.id("firstName");
    private By idLastName = By.id("lastName");
    private String idGender = "//*[@id=\"genterWrapper\"]/div[2]/div[contains(.,\"GENDER\")]/label";
    private By idMoblieNumber = By.id("userNumber");
    private By idSubmit = By.id("submit");
    private By idSubmissionModalTitle = By.id("example-modal-sizes-title-lg");
    private By idMale = By.id("gender-radio-1");
    private Properties config;
    private ConfigUtil readConfig = new ConfigUtil();

    public void openHome(){
        config = readConfig.getConfig("config");
        open(config.getProperty("URL"));
    }

    public void clickForm(){
        $(xpathForm).scrollTo().click();
    }

    public void clickPracticeForm(){
        $(xpathPracticeForm).click();
    }

    public void enterRequiredStudentData(Student student){
        $(idFirstName).sendKeys(student.getFirstName());
        $(idLastName).sendKeys(student.getLastName());
        $(By.xpath(idGender.replace("GENDER",student.getGender()))).click();
        $(idMoblieNumber).sendKeys(student.getMobileNumber());
    }

    public void clickSubmitButton(){
        $(idSubmit).scrollTo().click();
    }

    public void assertSubmissionModal(){
        $(idSubmissionModalTitle).should(Condition.visible).shouldHave(Condition.text("Thanks for submitting the form"));
    }

    public void assertRequiredFields(){
        $(idFirstName).shouldHave(Condition.attribute("required"));
        $(idLastName).shouldHave(Condition.attribute("required"));
        $(idMale).shouldHave(Condition.attribute("required"));
        $(idMoblieNumber).shouldHave(Condition.attribute("required"));
    }
}
