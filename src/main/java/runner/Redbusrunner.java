package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\eclipse\\suresh\\CucumberExample\\src\\main\\java\\featurePackage\\Redbus.feature",
glue="stepfile")

public class Redbusrunner {
	

}
