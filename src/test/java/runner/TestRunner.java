package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\workspace\\MyFirstProjectt\\src\\test\\resources\\Features\\registration.feature",
        glue= {"steps"},
        plugin = {"json:target/cucumber.json"})
public class TestRunner {

}
