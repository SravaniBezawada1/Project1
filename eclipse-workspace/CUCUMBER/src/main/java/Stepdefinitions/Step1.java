package Stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step1 {

	@Given("check multiplication functionality")
	public void m1() {
		System.out.println("Given stat mul");
	}

	@When("entered")
	public void m2(DataTable d) {
		List<List<Integer>> l = d.asLists(Integer.class);

		for (int i = 0; i < l.size(); i++) {
			List<Integer> l1 = l.get(i);
			Integer integer = l1.get(i);
			int m = 1;
			for (int j = 0; j < l1.size(); j++) {
				m = m * l1.get(j);
			}
			System.out.println(m);

		}

	}

	@Then("multiplication performed")
	public void m3() {
		System.out.println("then state mul" + "\n" + "----------------------");
	}

}
