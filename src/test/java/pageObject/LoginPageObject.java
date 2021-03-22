package pageObject;

import elementMapper.LoginPageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;
import utils.Utils;

public class LoginPageObject extends LoginPageElementMapper {

    public LoginPageObject(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void prencherEmail() {
    email_creat.sendKeys("batistellaeduarda@gmail.com");
    }

    public void submit_creat() {
        submit_creat.click();
    }
}

