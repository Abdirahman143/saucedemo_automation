package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement infoTitle;
    @FindBy(id = "first-name")
    private WebElement firstName;
    @FindBy(id = "last-name")
    private WebElement lastName;
    @FindBy(id = "postal-code")
    private WebElement zipCode;
    @FindBy(id = "continue")
    private WebElement continueBtn;

    private WebDriver driver;
    public InformationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle(){
        return  infoTitle.getText();
    }


    public void enterFirstName(String first_name) {
        firstName.sendKeys(first_name);
    }

    public void enterLastName(String last_name) {
        lastName.sendKeys(last_name);
    }

    public void enterPostalCode(String postalCode) {
        zipCode.sendKeys(postalCode);
    }

    public OverviewPage continueToShop() {
        continueBtn.click();
        return new OverviewPage(driver);
    }
}
