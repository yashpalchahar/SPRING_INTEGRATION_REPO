package com.chahar.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            plugin = {"pretty",
                "html:generated-cucumer-html-report1",
                "json:generated-cucumber-json-report2.json",
                "timeline:generated-cucumber-timeline-report3",
                "junit:generated-cucumber-junit-report4.xml"
            },
        glue={"com.chahar.cucumber.conf","com.chahar.cucumber.stepdefs"},
        features = {"classpath:cucumber/bddFeatures","src/test/features"},
        tags = {"@ProcessCustomerCsvFile,@ProcessStockFile"},
        monochrome = false,
        strict = false,
        //method name generation if method missing in stepdefs java class
        snippets = SnippetType.CAMELCASE)
public class CucumberAnnotationConfigurationRunnerTest {
}
