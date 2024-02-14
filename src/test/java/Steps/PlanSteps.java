package Steps;

import Utility.SeleniumUtility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PlanPage;


public class PlanSteps extends SeleniumUtility {
    @And("Clock on plan page")
    public void ClickOnPlanButton(){
        ClickOnCreateAccountButtonIs(PlanPage.CLICK_ON_PLAN_PAGE);
    }

    @Then("Validate 4 row of data is present")
    public void ValidateFourRowOfDate() {

        //ROW ONE
        boolean ValidateMotorBike = isElementDisplayed(PlanPage.VALIDATE_MOTOR_BIKE);
        Assert.assertTrue(ValidateMotorBike);
        boolean ValidateMotoCycle = isElementDisplayed(PlanPage.MOTOR_CYCLE);
        Assert.assertTrue(ValidateMotoCycle);
        boolean ValidateBasePrice = isElementDisplayed(PlanPage.BASE_PRICE);
        Assert.assertTrue(ValidateBasePrice);
        boolean ValidateDateOFCreated = isElementDisplayed(PlanPage.CREATED_DATE);
        Assert.assertTrue(ValidateDateOFCreated);
        boolean ValidateOfExpiration = isElementDisplayed(PlanPage.EXPIRED_DATE);
        Assert.assertTrue(ValidateOfExpiration);

        boolean ValidateBoat = isElementDisplayed(PlanPage.VALIDATE_BOAT);
        Assert.assertTrue(ValidateBoat);
        boolean ValidateBoatOBJ = isElementDisplayed(PlanPage.BOAT);
        Assert.assertTrue(ValidateBoatOBJ);
        boolean ValidateBoutBasePrice = isElementDisplayed(PlanPage.BOAT_BASE_PRICE);
        Assert.assertTrue(ValidateBoutBasePrice);
        boolean ValidateBoatCreatedDte = isElementDisplayed(PlanPage.BOAT_CREATED_DATE);
        Assert.assertTrue(ValidateBoatCreatedDte);
        boolean ValidateBoatExpiredDate = isElementDisplayed(PlanPage.BOAT_EXPIRED_DATE);
        Assert.assertTrue(ValidateBoatExpiredDate);


        boolean ValidateHouse = isElementDisplayed(PlanPage.VALIDATE_HOUSE);
        Assert.assertTrue(ValidateHouse);
        boolean ValidateRenters = isElementDisplayed(PlanPage.VALIDATE_RENTERS);
        Assert.assertTrue(ValidateRenters);
        boolean HousePrice = isElementDisplayed(PlanPage.HOUSE_BASE_PRICE);
        Assert.assertTrue(HousePrice);
        boolean HouseCreatedDate = isElementDisplayed(PlanPage.HOUSE_CREATED_DATE);
        Assert.assertTrue(HouseCreatedDate);
        boolean HouseExpiredDate = isElementDisplayed(PlanPage.HOUSE_EXPIRED_DATE);
        Assert.assertTrue(HouseExpiredDate);

        boolean ValidateVehicle = isElementDisplayed(PlanPage.VALIDATE_VEHICLE);
        Assert.assertTrue(ValidateVehicle);
        boolean ValidateAuto = isElementDisplayed(PlanPage.VALIDATE_AUTO);
        Assert.assertTrue(ValidateAuto);
        boolean VehicleBasePrice = isElementDisplayed(PlanPage.VEHICLE_BASE_PRICE);
        Assert.assertTrue(VehicleBasePrice);
        boolean VehicleCreatedDate = isElementDisplayed(PlanPage.VEHICLE_CREATED_DATE);
        Assert.assertTrue(VehicleCreatedDate);
        boolean VehicleExpiredDate = isElementDisplayed(PlanPage.VEHICLE_EXPIRED_DATE);
        Assert.assertTrue(VehicleExpiredDate);
    }

    @Then("Create Date is Today date in EST Time zone")
        public void ValidateCreatedDate(){
        boolean ValidateCreatedDate = isElementDisplayed(PlanPage.CREATED_DATE);
        Assert.assertTrue(ValidateCreatedDate);

        }

         @And("The Date Expire is a day after EST Time Zone")
        public void ValidatedExpiredDate(){
        boolean ValidateExpiredDte = isElementDisplayed(PlanPage.EXPIRED_DATE);
        Assert.assertTrue(ValidateExpiredDte);
    }

}
