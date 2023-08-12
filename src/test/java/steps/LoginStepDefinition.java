package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.BankCashPage;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	BankCashPage bankCashPage;

	@Before
	public void setup() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}

	@Given("User is on the techfios login page")
	public void user_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=dashboard/");
		takeScreenshot(driver);
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		loginPage.enterUserName(username);

	}

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String loginData, String field) {
		switch (field) {
		case "username":
			loginPage.enterUserName(loginData);
			break;
		case "password":
			loginPage.enterPassword(loginData);
			break;
		default:
			System.out.println("Unable to find Field: " + field);
			Assert.fail();
		}
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		loginPage.enterPassword(password);

	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();

	}

	@Then("User clicks on {string}")
	public void user_clicks_on(String element) {
		bankCashPage = PageFactory.initElements(driver, BankCashPage.class);
		switch (element) {
		case "login":
			loginPage.clickSignInButton();
			break;
		case "bankCash":
			bankCashPage.clickOnBankCash();
			break;
		case "newAccount":
			bankCashPage.clickOnNewAccount();
			break;
		case "submit":
			bankCashPage.clickOnSubmit();
		default:
			System.out.println("Unable to find Field: " + element);
			
		}
	}

	@Then("User should land on dashboard page")
	public void user_should_land_on_dashboard_page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);
		takeScreenshot(driver);
	}
	
	@When("User enters {string} from mysql database")   //from My SQL Database
	public void user_enters_from_mysql_database(String loginData) {
		if(loginData.equalsIgnoreCase("username")) {
			
		}else if(loginData.equalsIgnoreCase("password")) {
			
		}else {
			
		}
	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_Page() {
		String expectedTitle = "Dashboard- iBilling";
		String actualTitle = loginPage.getPageTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String accountElement, String accountField) {
		switch (accountField) {
		case "accountTitle":
			bankCashPage.enterAccountTitle(accountElement);
			break;
		case "description":
			bankCashPage.enterDescription(accountElement);
			break;
		case "initialBalance":
			bankCashPage.enterInitialBalance(accountElement);
			break;
		case "accountNumber":
			bankCashPage.enterAccountNumber(accountElement);
			break;
		case "contactPerson":
			bankCashPage.enterContactPerson(accountElement);
			break;
		case "Phone":
			bankCashPage.enterPhone(accountElement);
			break;
		case "internetBankingURL":
			bankCashPage.enterInternetBankingURL(accountElement);
			break;

		default:
			System.out.println("Unable to find Field: " + accountField);
			
		}

	}

//	@Then("User clicks on submit {string}")
//	public void user_clicks_on_submit(String submit) {
//		
//	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		//bankCashPage.validateaccountcreated();
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
