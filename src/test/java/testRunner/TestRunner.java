package testRunner;

//This is my test runner class

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features=".//Features//",
        //features = "E:/MyIntellij/Java/BDD_Cucumber/Features/Tagging.feature",
        features = "E:/MyIntellij/Java/BDD_Cucumber/Features/Hooks.feature",
        glue="stepDefinitions",
        plugin= { "pretty","html:test-output", "json: json_output/cucumber.json" },
        monochrome=true,
        dryRun = false,
        strict = false
        //tags= {"@sanity"},
        //tags = { "@SanityTest"},   // only execute tests under SanityTest
        //tags = { "@SanityTest, @RegressionTest"}  // execute tests under SanityTest or RegressionTest
        //tags = { "@E2ETest", "@RegressionTest"}  // execute tests under E2ETest and RegressionTest
        //tags = { "~@E2ETest", "~@RegressionTest"}  // this will ignore tests under E2ETest and RegressionTest
)
public class TestRunner {

}
