package testScripts;

import action.Base_Class;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.Home_Page;
import pageObject.Signup_Login_Page;

public class Tc1_SignUp  extends Base_Class {


    Home_Page hp = new Home_Page();
    Signup_Login_Page slp = new Signup_Login_Page();

    @BeforeTest
    public void pRun_Browser(){
    pSetBrowser();
    navigateToURL(pRead_Properties_Files("url"));

    }
    @Test
    public void pTc1_SignUp_WorkFlow(){



    }
    @AfterTest
    public void pStop_Browser(){
        tearDown();
    }

}
