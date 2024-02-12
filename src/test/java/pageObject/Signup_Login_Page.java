package pageObject;

import org.openqa.selenium.By;

import java.util.Random;

public class Signup_Login_Page {


    public By pSingUp_Banner(){
        return By.xpath("//div[@class='signup-form']/h2");
    }

    public By pSignUp_Button(){
        return By.xpath("//button[@data-qa='signup-button']");
    }

    public By pForm_Banner(){
        return By.xpath("//div[@class='login-form']/h2/b");
    }

    public By pRandom_Radio_Button(){
        By pOption1 = By.xpath("//input[@id='id_gender1']");
        By pOption2 = By.xpath("//input[@id='id_gender2']");
        Random random = new Random();
        // Generate a random number between 1 and 2 (inclusive)
        int randomNumber = random.nextInt(2) + 1;
        if(randomNumber == 1){
            return pOption1;
        }else{
            return pOption2;
        }
    }

    public By pName_input(){
        return By.xpath("//input[@id='name']");
    }

    public By pEmail_input(){
        return By.xpath("//input[@id='email']");
    }

    public By pPassword_input(){
        return By.xpath("//input[@id='password']");
    }

    public By pCalendar_Days(){
        return By.xpath("//select[@id='days']");
    }

    public By pCalendar_Months(){
        return By.xpath("//select[@id='months']");
    }

    public By pCalendar_Years(){
        return By.xpath("//select[@id='years']");
    }

    public By pNews_Letters_Option(){
        return By.xpath("//input[@id='newsletter']");
    }

    public By pEnroll_News(){
        return By.xpath("//input[@id='optin']");
    }
    public By pFirst_Name(){
        return By.xpath("//input[@id='first_name']");
    }
    public By pLast_Name(){
        return By.xpath("//input[@id='last_name']");
    }
    public By pCompany(){
        return By.xpath("//input[@id='company']");
    }
    public By pAddress1(){
        return By.xpath("//input[@id='address1']");
    }
    public By pAddress2(){
        return By.xpath("//input[@id='address2']");
    }
    public By pCountry(){
        return By.xpath("//select[@id='country']");
    }
    public By pState(){
        return By.xpath("//input[@id='state']");
    }
    public By pCity(){
        return By.xpath("//input[@id='city']");
    }
    public By pZipCode(){
        return By.xpath("//input[@id='zipcode']");
    }
    public By pMobile_Number(){
        return By.xpath("//input[@id='mobile_number']");
    }
    public By pCreate_Account_Button(){
        return By.xpath("//button[@data-qa='create-account']");
    }

    public By pAccount_Created_Banner(){
        return By.xpath("//h2[@data-qa='account-created']");
    }

    public By pContinue_Button(){
        return By.xpath("//a[@data-qa='continue-button']");
    }

}
