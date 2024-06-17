package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\eclipse\\suresh\\CucumberExample\\src\\main\\java\\featurePackage\\login.Feature",
glue={"stepfile","hookBeforeAfter"}
,dryRun=false,monochrome=true,tags= {"@Hooks"})
public class Runnerclass {

}
