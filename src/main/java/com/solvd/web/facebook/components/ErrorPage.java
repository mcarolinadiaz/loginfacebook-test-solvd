package com.solvd.web.facebook.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ErrorPage extends AbstractUIObject {
    @FindBy(xpath = "//div[@class='_9ay7']")
    private ExtendedWebElement wrongMessage;
    public ErrorPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getWrongMessage() {
        return wrongMessage;
    }
}
