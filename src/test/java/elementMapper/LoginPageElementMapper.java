package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageElementMapper {

    @FindBy(id = "email_create")
    public WebElement email_creat;

    @FindBy(id = "SubmitCreate")
    public WebElement submit_creat;

    @FindBy(id = "page-subheading")
    public WebElement page_subheading;


}
