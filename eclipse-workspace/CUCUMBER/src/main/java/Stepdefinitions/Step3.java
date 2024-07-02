package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step3 {
	@Given("check Sub functionality")
	public void m1()
	{
		System.out.println("Given stat Sub");
	}

	@When("Entered {int} and {int}")
	public void m2(int f1,int f2)
	{
		int f=f1-f2;
		System.out.println(f);
	}

	@Then("Sub performed")
	public void m3()
	{
		System.out.println("then state Sub");
	}

}
