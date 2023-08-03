package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//resources//features",
                glue="com.stepdefinition",
                plugin="html.target",
                 monochrome=true,
                 dryRun=false,
                 tags={"@sanity,@smoke"})

public class testrunner {

}
