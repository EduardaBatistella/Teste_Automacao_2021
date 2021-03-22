package testes;

import org.junit.Assert;
import org.junit.Test;
import pageObject.CreatAccountPage;
import pageObject.HomePageObject;
import pageObject.LoginPageObject;
import utils.Browser;
import utils.Utils;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTests {

    @Test
    public void testOpeningBrowserAndLoandingPage() {
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos com sucesso a URL");
    }

    @Test
    public void testlogin() {
        //Iniciar as páginas
        HomePageObject home = new HomePageObject();
        LoginPageObject login = new LoginPageObject();
        CreatAccountPage creat = new CreatAccountPage();

        //Clicar em Login
        home.clickBtnLogin();
        System.out.println("Clicou em Sing In e direcionou para a página de login");
        assertTrue(Browser.getCurrentDriver().getCurrentUrl().contains(Utils.getBaseUrl().concat("index.php?controller=authentication&back=my-account")));

        //Iniciar o Cadastro
        login.prencherEmail();
        System.out.println("Prencheu o email");
        login.submit_creat();
        System.out.println("Clicou em Creat");
        creat.customer_firstname();
        System.out.println("Prencheu Nome");
        creat.customer_lastname();
        System.out.println("Preencheu Sobrenome");
        creat.passwd();
        System.out.println("prencheu senha");
        creat.address1();
        System.out.println("Preencheu Endereço");
        creat.city();
        System.out.println("Preecheu Cidade");
        creat.id_state();
        System.out.println("Preencheu Estado");
        creat.postcode();
        System.out.println("Prencheu Estado");
        creat.phone();
        System.out.println("Preencheu Telefone");
        creat.submitAccount();
        System.out.println("Criou a conta");

    }
}


