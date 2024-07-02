import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src\\main\\java\\Features\\feature1.feature",glue="Stepdefinitions")
public class TestRunner extends AbstractTestNGCucumberTests{
	
	

}
