package com.chahar.cucumber.stepdefs;

import com.chahar.cucumber.dto.CartDto;
import com.chahar.cucumber.dto.InfoDto;
import com.chahar.cucumber.dto.StockFeedDto;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class ProcessStockStepDef {

    @Given("^stock csv file is provided with given contents$")
    public void stock_csv_file_is_provided_with_given_contents(final String body){
        System.out.println("Received docString contents: \n" + body);
    }
    @Given("^warehouse code \"(.*)\" and update type \"(.*)\" is given$")
    public void warehouse_code_X_and_update_type_Y_is_given(final String warehouse,final String updationType){
        System.out.println("Received Warehouse code : "+ warehouse + ", updation type: "+ updationType);
    }

    @Given("^record detail is given as below$")
    public void record_detail_is_given_as_below(final StockFeedDto dto){
        System.out.println("Received stock dto: " + dto);
    }

    @Given("^records detail list are given as belows$")
    public void records_detail_list_are_given_as_belows(final List<StockFeedDto> list){
        System.out.println("Received stock list: " + list);
    }

    @Given("^information is given as below$")
    public void information_is_given_as_below(final InfoDto dto){
        System.out.println("Received InfoDto: " + dto);
    }

    @When("^perform action on cart with given detail$")
    public void perform_action_on_cart_with_given_detail(final CartDto dto){
        System.out.println("Received cart dto: " + dto);
    }

    @Then("^verify result with given \"(\\d+)\" user id$")
    public void verify_result_with_given_X_user_id(final Integer id){
        System.out.println("Received Id: " + id);
    }

}
