package com.catalyst.interviews.berlinclock;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BerlinClockBDDSteps {

    private BerlinClock berlinClock = new BerlinClock();
    private String time;
    private boolean debug=false;	// Variable used to activate or deactivate debugging I/O statements.
    
    @Given("^the time is (.*)$")
    public void theTimeIs(String time) throws Throwable {
        this.time = time;
    }

    @Then("^the clock should look like:$")
    public void theClockShouldLookLike(String expectedBerlinClockOutput) throws Throwable {
    	if(debug) {
    		System.out.println("expectedBerlinClockOutput:\n"+expectedBerlinClockOutput);
    	}
        assertThat(berlinClock.convertTime(time), is(expectedBerlinClockOutput));
    }
}
