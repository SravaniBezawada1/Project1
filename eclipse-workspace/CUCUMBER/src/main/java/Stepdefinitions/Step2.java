package Stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {
	@Given("check Addition functionality")
	public void m1()
	{
		System.out.println("Given stat add");
	}

	@When("^entered (.+) and (.+)$")
	public void m2(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}

	@Then("Addition performed")
	public void m3()
	{
		System.out.println("then state add");
	}

}
