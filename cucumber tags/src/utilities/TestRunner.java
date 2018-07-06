package utilities;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(

          features = "tags"

          ,glue={"step_definition"}

          ,tags= {"@SmokeTest"}

          //,tags= {"@RegressionTest"}

          

          //,tags= {"@End2End"}

          //,tags= {"@FunctionalTest"}

          //,tags= {"@SmokeTest,@RegressionTest"} //or tagged

          //,tags= {"@SmokeTest","@RegressionTest"} //and tagged

//        ,tags= {"@SmokeTest","~@RegressionTest"} //ignoring regressionTest

        //  ,tags= {"~@SmokeTest","~@RegressionTest","~@End2End"} //without tag scenario how many? 

          )

 
public class TestRunner {

}







