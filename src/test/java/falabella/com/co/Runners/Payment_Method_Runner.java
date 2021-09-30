package falabella.com.co.Runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = {"falabella.com.co.Step_Definitions"},
        features = {"src/test/resources/Features/Payment_Method_Validation.feature"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true
)

public class Payment_Method_Runner {
}
