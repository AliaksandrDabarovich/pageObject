package com.epam.pageobject.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ComposeEmailPage extends AbstractPage {
    @FindBy (xpath = "//div[@class='container--ItIg4 size_s--2eBQT size_s--3_M-_']//input[@class='container--H9L5q size_s--3_M-_']")
    WebElement toField;
    @FindBy (xpath = "//div[@class='container--3QXHv']//input[@class='container--H9L5q size_s--3_M-_']")
    WebElement subjectField;
    @FindBy (xpath = "//div[contains (@class, 'cke_editable cke_editable_inline cke_contents_true cke_show_borders')]/div[1]")
    WebElement bodyField;
    @FindBy (xpath = "//span[@class='button2 button2_base button2_hover-support js-shortcut']")
    WebElement saveButton;
    @FindBy (xpath = "//button[@title='Закрыть' and @class='container--2lPGK type_base--rkphf color_base--hO-yz']")
    WebElement closeButton;

    public ComposeEmailPage(WebDriver driver) {
        super(driver);
    }

    public EmailPage composeEmail() {
        waitForVisibility(toField);
        toField.sendKeys("aliaksandr.yarkiy@mail.ru");
        subjectField.sendKeys("WebDriver");
        bodyField.sendKeys("Text for test");
        saveButton.click();
        closeButton.click();
        return new EmailPage(driver);
    }


}
