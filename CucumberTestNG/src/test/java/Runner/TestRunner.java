package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"C://Users//ankit//Documents//javabasic//CucumberTestNG//src//test//resources//Login//login.feature"},
glue= {"Stepdefinition"}, plugin= {"html:Result/TestNG.html"})

public class TestRunner extends AbstractTestNGCucumberTests{

}
