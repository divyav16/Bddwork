package Runner;

import StepDefinitions.Register;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.runtime.StepDefinition;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Minesh\\IdeaProjects\\SimpleBddFramework\\src\\test\\resources\\Features",
        glue = {"StepDefinitions"}




)

public class TestRunner {
}
