package com.chahar.cucumber.stepdefs;

import com.chahar.cucumber.dto.StockFeedDto;
import com.chahar.cucumber.helper.DataHelper;
import cucumber.api.java.en.Given;

public class ProcessStockStepDef {

    @Given("^stock csv file is provided with given contents$")
    public void stock_csv_file_is_provided_with_given_contents(final String body){
        System.out.println("Received docString contents: \n" + body);

        //DataHelper.put("fileContents", body);
    }
    @Given("^warehouse code \"(.*)\" and update type \"(.*)\" is given$")
    public void warehouse_code_X_and_update_type_Y_is_given(final String warehouse,final String updationType){
        System.out.println("Received Warehouse code : "+ warehouse + ", updation type: "+ updationType);

        //System.out.println(DataHelper.get("fileContents"));
    }

   /* @Given("^records details are given as below$")
    public void records_details_are_given_as_below(final StockFeedDto dto){
        System.out.println("Received stock dto: " + dto);
    }*/

    /*@Given("^I have (\\d+) cukes in my belly with \"(.*)\" comment$")
    public void I_have_X_cukes_in_my_belly_with_Y_comment(int cukes, String comment) throws Throwable {
        System.out.println("cukes: "+cukes);
        System.out.println("comment: "+comment);
    }

    @Given("^with impex contents$")
    public void with_impex_contents(String body){
        System.out.println("docString body: "+ body);
    }
    @Given("^stock csv have following records data1$")
    public void stock_csv_have_following_records_data1(String body){
        System.out.println("stock_csv_have_following_records_data1: ====> \n" + body);
    }
    @And("^stock csv have following records data2$")
   public void stock_csv_have_following_records_data2(DataTable dataTable){
       System.out.println("stock_csv_have_following_records_data2: ====> " + dataTable.asList());
   }
   @And("^stock csv have following records data3$")
   public void stock_csv_have_following_records_data3(final List<String> lineContents){
       final String multiLineBodyContents = StringUtils.join("\\n",lineContents);

       System.out.println("stock_csv_have_following_records_data3: "+multiLineBodyContents);
   }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(Integer int1) {
        System.out.println("integer parameter data: " + int1);
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() {
        System.out.println("belly has been growed");
    }*/
}
