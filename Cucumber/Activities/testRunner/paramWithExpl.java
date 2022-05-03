package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",     // path of the features
        glue = {"stepDefinitions"} ,  // packageName
        tags = "@activity5",
        plugin = {"pretty"},
        monochrome = true
)

public class paramWithExpl {
}
