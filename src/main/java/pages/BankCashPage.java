package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankCashPage extends TestBase {

	WebDriver driver;

	public BankCashPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/a/span[1]") //// *[@id="side-menu"]/li[10]/a/span[1]
	WebElement BankCash;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[1]/a")
	WebElement NewAccount;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement AccountTitle;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement Description;
	@FindBy(how = How.XPATH, using = "//*[@id=\"balance\"]")
	WebElement InitialBalance;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account_number\"]")
	WebElement AccountNumber;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_person\"]")
	WebElement ContactPerson;
	@FindBy(how = How.XPATH, using = "//*[@id=\"contact_phone\"]")
	WebElement Phone;
	@FindBy(how = How.XPATH, using = "//*[@id=\"ib_url\"]")
	WebElement InternetBankingURL;
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/form/button") ////*[@id="page-wrapper"]/div[3]/div[1]/div/div/div[2]/form/button
	WebElement Submit;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[10]/ul/li[2]/a")
	WebElement ListAccounts;

	// Methods to interact with the elements
	public void clickOnBankCash() {
		BankCash.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnNewAccount() {
		NewAccount.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	String insertedAccountTitle;

	public void enterAccountTitle(String accountTitle) {
		insertedAccountTitle = accountTitle + randomNumGenerator(999);
		AccountTitle.sendKeys(insertedAccountTitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterDescription(String description) {
		Description.sendKeys(description);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterInitialBalance(String initialBalance) {
		InitialBalance.sendKeys(initialBalance);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterAccountNumber(String accountNumber) {
		AccountNumber.sendKeys(accountNumber + randomNumGenerator(999));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterContactPerson(String contactPerson) {
		ContactPerson.sendKeys(contactPerson);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterPhone(String phone) {
		Phone.sendKeys(phone + randomNumGenerator(999));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void enterInternetBankingURL(String internetBankingUrl) {
		InternetBankingURL.sendKeys(internetBankingUrl);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSubmit() {
		Submit.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnListAccount() {
		ListAccounts.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

//	//tbody/tr[2]/td[1]
	String before_xpath = "//tbody/tr[";
	String after_xpath = "]/td[1]";

	public void validateaccountcreated() {
		for (int i = 1; i <= 313; i++) {
			String actualName = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(actualName);
			if (actualName.contains(insertedAccountTitle)) {
				System.out.println("Inserted name exist");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			break;
		}

	}
}