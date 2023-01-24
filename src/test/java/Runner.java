import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


@CucumberOptions(
        features = "src/test/resources",
        glue = {""},
        monochrome = true,
        plugin = {"pretty", "html:build/target/results/cucumber-report.html"})

@Test
public class Runner extends AbstractTestNGCucumberTests {

}
