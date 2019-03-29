package com.chahar.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue={"com.chahar.cucumber"},
        features = "classpath:cucumber/bddFeatures")
public class CucumberConfigurationRunnerTest {
}
