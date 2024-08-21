package StepDefinitions;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinitions"},monochrome=true,plugin = {"pretty","json:target/JSONReports/report.xml",
        "junit:target/JUnitReports/JUnitreport.json"},tags = "@smoketest")
//{"pretty","junit:target/JUnitReports/JUnitreport.json"})
//istenilen türde raporlama verebilir.
public class TestRunner {

}



