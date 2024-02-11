package pageObject;

import org.openqa.selenium.By;

public class Home_Page {

    public By pHome_Logo(){
        return By.xpath("//img[@alt='Website for automation practice']");
    }

    public By pLogin_Button(){
        return By.xpath("//div[@class='shop-menu pull-right']/ul/li/a[contains(text(),' Signup / Login')]");
    }

    public By pUser_Logged(){
        return By.xpath("//a[text()= ' Logged in as ']");
    }

    public By pDeleted_Button(){
        return By.xpath("//a[text()= ' Delete Account']");
    }

    public By pDeleted_Account_Banner(){
        return By.xpath("//h2[@data-qa= 'account-deleted']");
    }

}
