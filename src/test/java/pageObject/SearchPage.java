package pageObject;

import elementMapper.SearchPageElementMapper;
import org.openqa.selenium.support.PageFactory;
import utils.Browser;

public class SearchPage extends SearchPageElementMapper {
    public SearchPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);

    }

    public String getTextnavigation_page(){
        return navigation_page.getText();
    }

    public String getTextligther(){
        return lighter.getText();
    }

    public String getTextHeading_counter(){
        return heading_counter.getText();
    }

    public boolean isSearchPage(){
        return getTextnavigation_page().equals("Search");
    }

    public void clickleft_block(){ left_block.click(); }

    public void clickBtnAddtoCart(){ add_to_cart.click(); }

    public String getTextAdd_to_Cart(){ return add_to_cart.getText();}

}
