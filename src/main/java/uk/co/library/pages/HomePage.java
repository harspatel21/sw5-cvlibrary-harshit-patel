package uk.co.library.pages;
// **** Created By Harshit Patel ****

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(id = "keywords")
    WebElement jobTitle1;

    @CacheLookup
    @FindBy(id = "location")
    WebElement location1;

    @CacheLookup
    @FindBy(id = "distance")
    WebElement distanceDropDown1;

    @CacheLookup
    @FindBy(id = "toggle-hp-search")
    WebElement moreSearchOptionsLink1;

    @CacheLookup
    @FindBy(id = "salarymin")
    WebElement salaryMin1;

    @CacheLookup
    @FindBy(id = "salarymax")
    WebElement salaryMax1;

    @CacheLookup
    @FindBy(id = "salarytype")
    WebElement salaryTypeDropDown1;

    @CacheLookup
    @FindBy(id = "tempperm")
    WebElement jobTypeDropDown1;

    @CacheLookup
    @FindBy(id = "hp-search-btn")
    WebElement findJobsBtn1;

    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllBtn;
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    public void enterJobTitle(String jobTitle) {
        Reporter.log("Entering job title: " + jobTitle1.toString());
        sendTextToElement(jobTitle1, jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Entering Location: " + location1.toString());
        sendTextToElement(location1, location);
    }

    public void selectDistance(String distance) {
        Reporter.log("Selecting Distance from Dropdown menu: " + location1.toString());
        selectByVisibleTextFromDropDown(distanceDropDown1, distance);
    }

    public void clickOnMoreSearchOptionLink() {
        Reporter.log("Click on More Search link: " + moreSearchOptionsLink1);
        clickOnElement(moreSearchOptionsLink1);
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Entering Minimum Salary: " + salaryMin1.toString());
        sendTextToElement(salaryMin1, minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Entering Maximum Salary: " + salaryMax1.toString());
        sendTextToElement(salaryMax1, maxSalary);
    }

    public void selectSalaryType(String salaryType) {
        Reporter.log("Selecting Salary Type from Dropdown menu: " + salaryTypeDropDown1.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown1, salaryType);
    }

    public void selectJobType(String jobType) {
        Reporter.log("Selecting Job Type from Dropdown menu: " + jobTypeDropDown1.toString());
        selectByVisibleTextFromDropDown(jobTypeDropDown1, jobType);
    }

    public void clickOnFindJobsButton() {
        Reporter.log("Click on Find Job Button: " + findJobsBtn1);
        clickOnElement(findJobsBtn1);
    }

    public void acceptIFrameAlert() throws InterruptedException {
        Thread.sleep(2000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllBtn);
        CustomListeners.test.log(Status.PASS,"Accepting all cookies : " + acceptAllBtn.toString());
    }
}
