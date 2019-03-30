package com.chahar.cucumber.stepdefs;

import com.chahar.cucumber.dto.CustomerDto;
import com.chahar.cucumber.helper.DataHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import javax.xml.crypto.Data;
import java.util.List;

public class SpringIntegrationStepDef {

    @Given("^customer csv file is provided with below contents$")
    public void customer_csv_file_is_provided_with_below_contents(final String body){
        System.out.println("Received docString contents: \n" + body);
        DataHelper.put("fileContents",body);
    }

    @Given("^file name follows naming convention and it's name is given \"(.*)\" as prefix and \"(\\d+)\" as suffix$")
    public void file_name_follows_naming_convention_and_its_name_is_given_X_as_prefix_and_Y_as_suffix(final String filePrefix , final Integer fileSuffix){
        System.out.println("Received prefix: "+ filePrefix + " , suffix: "+ fileSuffix);
        DataHelper.put("fileName",filePrefix+"_"+fileSuffix+".csv");
    }

    @Given("^place file in directory pointed by \"(.*)\" key$")
    public void place_file_in_directory_pointed_by_X_key(final String monitorDirKey){
        System.out.println("Received spring monitored directory key: " + monitorDirKey);


    }

    @Then("^verify following records are imported successfully$")
    public void verify_following_records_are_imported_successfully(final List<CustomerDto> customers){
        System.out.println("Received customer list: " + customers);
    }

}
