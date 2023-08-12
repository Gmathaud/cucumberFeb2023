package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//		features="src\test\resources\features",
		features="classpath:features",
		glue="steps",
		tags= "@BankCashScenario1",
		monochrome=true,
		dryRun=false,
		plugin= {
				"pretty",
				"html:target/reports/cucumber.html",
				"html:target/reports/cucumber.json",
		}
		)
public class LoginRunner {

}
