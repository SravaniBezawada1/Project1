package Stepdefinitions;
import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {
		
		@Given("check multiplication functionality")
		public void m1()
		{
			System.out.println("Given stat");
		}

		@When("entered")
		public void m2(DataTable d)
		{
			List<List<Integer>> l = d.asLists(Integer.class);
			System.out.println(l.get(0));
		}

		@Then("multiplication performed")
		public void m3()
		{
			System.out.println("then state");
		}
	}

