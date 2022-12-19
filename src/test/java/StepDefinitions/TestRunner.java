package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resourses/Features",
        glue={"StepDefinitions"},
        monochrome = true,
        plugin={"pretty", "html:target/HtmlReports/reports.html"},
        tags=""
        )

public class TestRunner {
}
