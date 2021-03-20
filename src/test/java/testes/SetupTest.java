package testes;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pageObject.HomePageObject;
import pageObject.LoginPageObject;
import pageObject.SearchPage;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests{

    @Test
    public void testOpeningBrowserAndLoandingPage(){
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos com sucesso a URL");
    }

    @Test
    public void testlogin(){
        //Iniciar as páginas
        HomePageObject home = new HomePageObject();
        LoginPageObject login = new LoginPageObject();

        home.clickBtnLogin();
        System.out.println("Clicou em Sing In e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        login.fillEmail();
        System.out.println("Prencheu o email");
        login.fillPasswd();
        System.out.println("Prencheu a senha");
        login.clickBtnSubmitLogin();
        System.out.println("Clicou em Sing In");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=my-account")));
        System.out.println("Valiou URL da minha conta");
        assertTrue(Browser.getCurrentDriver().findElement(By.className("page-heading")).getText().contains("MY ACCOUNT"));
        System.out.println("Valiou minha conta no site");

    }
    @Test
    public void testSearch(){

        String quest = "DRESS";
        String questReslQtd = "7";

        //Inciar as páginas
        HomePageObject home = new HomePageObject();
        SearchPage Search = new SearchPage();

        //Fazer a Pesquisa
        home.doSearch(quest);
        Assert.assertTrue(Search.isSearchPage());
        Assert.assertEquals(Search.getTextligther().replace("\"", ""),quest);
        assertThat(Search.getTextHeading_counter(), CoreMatchers.containsString(questReslQtd));
    }

    @Test
    public void testAtividadeModuloImplentação(){

        String quest = "T-SHIRTS";
        String questReslQtd = "1";
        String AddToCart = "Add to Cart";

        HomePageObject home = new HomePageObject();
        SearchPage Search = new SearchPage();
        System.out.println("Iniciou as páginas");

        home.doSearch(quest);
        Assert.assertTrue(Search.isSearchPage());
        Assert.assertEquals(Search.getTextligther().replace("\"", ""),quest);
        assertThat(Search.getTextHeading_counter(), CoreMatchers.containsString(questReslQtd));
        System.out.println("Fez a Pesquisa");

        Search.clickleft_block();
        System.out.println("Clicou no Produto");

        Search.clickBtnAddtoCart();
        System.out.println("Adicionou ao Carrinho");

    }

}

