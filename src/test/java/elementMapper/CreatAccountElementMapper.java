package elementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatAccountElementMapper {


    @FindBy(id = "customer_firstname")
    public WebElement customer_firstname;

    @FindBy(id = "customer_lastname")
    public WebElement customer_lastname;

    @FindBy(id = "passwd")
    public WebElement passwd;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement id_state;

    @FindBy(id = "postcode")
    public WebElement postcode;

    @FindBy(id = "phone")
    public WebElement phone;

    @FindBy(id = "submitAccount")
    public WebElement submitAccount;

}
