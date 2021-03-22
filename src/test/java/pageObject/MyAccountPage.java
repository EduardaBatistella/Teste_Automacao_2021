package pageObject;

import elementMapper.MyAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class MyAccountPage extends MyAccountElementMapper {

    public MyAccountPage(){ PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public boolean isPageMyAccount(){
        return getAuthenticathionNamePage().contains("MY ACCOUNT");
    }

    public String getAuthenticathionNamePage(){
        return myAccount.getText();
    }
}
