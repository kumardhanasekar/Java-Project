package org.stepdefinition;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
glue = "org.stepdefinition",
dryRun = false,
snippets = SnippetType.UNDERSCORE,
plugin = {"html:report",
		"junit:junitreport.xml",
		"json:jsonreport.json"})
public class TestRunnerClass {

}
