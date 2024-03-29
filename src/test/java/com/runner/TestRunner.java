package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="com.stepdefinition",monochrome=true,plugin= {"html:target","json:target/reports.json"})
public class TestRunner {

}
