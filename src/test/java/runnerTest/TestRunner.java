package runnerTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        // This creates cucumber reports
        plugin = {"pretty", "html:target/site/cucumber-pretty", "json:target/cucumber-html-reports/cucumber.json"},
        //This create auto method name in camelCase
        snippets = cucumber.api.SnippetType.CAMELCASE,
        monochrome = true,
        //Path to your feature file
        features = {"src/test/resources/features"},
        // Specify tags to be executed
        tags = {"@temptimeline-1, @individualtemptimeline"},
        //Specify step definition package name (Note: make sure to have this package on current directory)
        glue = {"stepDefinition"}

)

public class TestRunner {
}
