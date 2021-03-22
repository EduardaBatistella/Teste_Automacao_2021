package pageObject;

import elementMapper.HomePageElementMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class HomePageObject extends HomePageElementMapper {

    public HomePageObject(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void clickBtnLogin(){
        login.click();
    }

}

