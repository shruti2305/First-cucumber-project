package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features="classpath:features",
        glue ="",
        plugin={"pretty",
                "html:target/cucumber-report.html",
                "json:target/cucumber-json-report.json",
        },
        dryRun = false


)
public class RunTest {

}

