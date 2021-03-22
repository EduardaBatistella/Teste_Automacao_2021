package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountElementMapper {

    @FindBy(className = "account")
    public WebElement name_account;

    @FindBy(className = "page-heading")
    public WebElement myAccount;

}
