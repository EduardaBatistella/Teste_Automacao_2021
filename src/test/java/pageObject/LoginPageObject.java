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
    public void fillEmail(){
       email.sendKeys("dudabati@gmail.com");
    }

    public void fillPasswd(){
        passwd.sendKeys("140993");
    }

    public void clickBtnSubmitLogin(){
     SubmitLogin.click();
    }
}
