package com.solvd;

import com.solvd.web.facebook.HomePage;
import com.solvd.web.facebook.components.ErrorPage;
import com.solvd.web.facebook.components.LoginPage;
import com.zebrunner.carina.core.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageFacebookTest extends AbstractTest {

    @Test(description = "Verify login with invalid credentials")
    public void verifyValidLoginFacebookTest() {
        SoftAssert sa = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage page = new HomePage(driver);
        page.open();

        LoginPage loginPage = page.getLoginPage();
        Assert.assertTrue(loginPage.getEmail().isElementPresent(1), "Email input is not present");
        sa.assertEquals(loginPage.getEmailInputPlaceholder(), "Correo electrónico o número de teléfono",
                "Facebook login has an incorrect placeholder");
        loginPage.typeEmailValue("123@123.com");
        Assert.assertTrue(loginPage.getPass().isElementPresent(1), "Password input is not present");
        sa.assertEquals(loginPage.getPassInputPlaceholder(), "Contraseña",
                "Facebook login has an incorrect placeholder");
        loginPage.typePassValue("123");
        Assert.assertTrue(loginPage.getLoginButton().isElementPresent(1), "Login button is not present");

        ErrorPage errorPage = loginPage.clickLoginButton();
        Assert.assertTrue(errorPage.getWrongMessage().isElementPresent(1), "Wrong message is not present");

        sa.assertAll();

    }
}
