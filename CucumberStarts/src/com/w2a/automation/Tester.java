package com.w2a.automation;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tester {

	
	@Given("I am a Manual tester")
	public void I_am_a_Manual_tester() {
		
	System.out.println("@Given---I_am_a_Manual_tester");	
		
	}
	
	@When( "I apply for a job")
	public void I_apply_for_a_job() {
		
		System.out.println("@When----I_apply_for_a_job");
	}
	@Then (" I got a less paid job")
	public void  I_got_a_less_paid_job() {
		System.out.println("@Then---I_got_a_less_paid_job");
	}
	
	@And("I am not satisfied with my salary")
	public void I_am_not_satisfied_with_my_salary() {
		System.out.println("@And_I_am_not_satisfied_with_my_salary");
	}
	@But("My parents are still satisfied")
	public void My_parents_are_still_satisfied() {
		System.out.println("@But----My_parents_are_still_satisfied");
	}
}

