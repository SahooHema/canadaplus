//package stepDefinition;
//
//import com.qa.base.Base;
//import com.qa.pages.HomePage;
//import com.qa.pages.LoginPage;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.When;
//
//public class Login extends Base{
//
//	LoginPage lp;
//	HomePage hp = new HomePage();
//
//	@Given("User open browser")
//	public void user_open_browser() {
//	 Base.initialization();
//	}
//
////	@When("User entered id and password")
////	public void user_entered_id_and_password() throws Exception {
////		lp = new LoginPage();
////	hp=	lp.Textbox("9752023235","Caparo@9100");
////	   
////	}
//	
//	@When("User entered {string} and {string}")
//	public void user_entered_and(String string, String string2) throws Exception {
//		lp = new LoginPage();
//		hp=	lp.Textbox(string,string2);
//	}
//}
