package com.solvd.web.facebook;

import com.solvd.web.facebook.components.LoginPage;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//div[@class = '_8esn']//form")
    private LoginPage loginPage;
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void open() {
        openURL(Configuration.getRequired("home_url"));
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }


}
