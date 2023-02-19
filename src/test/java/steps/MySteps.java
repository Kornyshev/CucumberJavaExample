package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.extern.slf4j.Slf4j;
import models.Calculation;
import models.Numbers;
import org.junit.jupiter.api.Assertions;

@Slf4j
public class MySteps {

    private static int FIRST;
    private static int SECOND;
    private static int RESULT;

    @Given("{int} was set up as first number")
    public void intWasSetUpAsFirstNumber(int firstNumber) {
        log.info("Method: 'intWasSetUpAsFirstNumber(int firstNumber)'");
        FIRST = firstNumber;
    }

    @Given("{int} was set up as second number")
    public void intWasSetUpAsSecondNumber(int secondNumber) {
        log.info("Method: 'intWasSetUpAsSecondNumber(int secondNumber)'");
        SECOND = secondNumber;
    }

    @Given("calculation object:")
    public void calculationObjectExperiment(Calculation calculation) {
        log.info("Method: 'calculationObjectExperiment()'");
        FIRST = calculation.getFirstNumber();
        SECOND = calculation.getSecondNumber();
    }

    @Given("first number via Enum {}")
    public void firstNumberViaEnum(Numbers number) {
        log.info("Method: 'firstNumberViaEnum()'");
        FIRST = number.getIntValue();
    }

    @Given("second number via Enum {}")
    public void secondNumberViaEnum(Numbers number) {
        log.info("Method: 'secondNumberViaEnum()'");
        SECOND = number.getIntValue();
    }

    @When("user multiplies first and second numbers")
    public void userMultipliesFirstAndSecondNumbers() {
        log.info("Method: 'userMultipliesFirstAndSecondNumbers()'");
        RESULT = FIRST * SECOND;
    }

    @Then("verify that the result is equal to {int}")
    public void verifyResult(int expectedResult) {
        log.info("Method: 'verifyResult(int expectedResult)'");
        Assertions.assertEquals(expectedResult, RESULT);
    }

}
