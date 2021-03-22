package pageObject;

import elementMapper.CreatAccountElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class CreatAccountPage extends CreatAccountElementMapper {

    public CreatAccountPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    public void customer_firstname() {  customer_firstname.sendKeys("Eduarda");
    }

    public void customer_lastname() {customer_lastname.sendKeys("Batistella");
    }

    public void passwd() {passwd.sendKeys("Teste1234");
    }

    public void address1() {address1.sendKeys("Test");
    }

    public void city() {city.sendKeys("Caxias do Sul");
    }

    public void id_state() {  id_state.sendKeys("Alabama");
    }

    public void postcode() {  postcode.sendKeys("12345");
    }

    public void phone() { phone.sendKeys("99999999");
    }

    public void submitAccount() {  submitAccount.click();
    }
}
