package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse\\suresh\\CucumberExample\\src\\main\\java\\featurePackage\\Google.feature"
,glue= "stepfile")
public class GoogleRunner {

	

	}


