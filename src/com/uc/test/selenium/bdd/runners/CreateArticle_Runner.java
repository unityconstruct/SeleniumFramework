package com.uc.test.selenium.bdd.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=  "src/com/uc/test/selenium/bdd/features/CreateArticle.feature"
		,glue= {"com.uc.test.selenium.bdd.definitions"}
		,format= {"pretty","html:test-output", "json:json-output/cucumber.json","junit:junit-xml-output/cucumber.xml"}
		,monochrome = true
		,strict = true //true = fail test suite if ANY test step not defined
		,dryRun = false //true = check feature-definition-runner setup is valid... NO test logic executed
		)

public class CreateArticle_Runner {

	
	
}
