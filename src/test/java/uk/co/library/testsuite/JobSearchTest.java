package uk.co.library.testsuite;
// **** Created By Harshit Patel ****

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import resources.testdata.TestData;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.BaseTest;

@Listeners(CustomListeners.class)
public class JobSearchTest extends BaseTest {
    HomePage homePage;
    ResultPage resultPage;


    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        resultPage = new ResultPage();
    }
    @Test(groups = {"sanity", "smoke", "regression"}, dataProvider = "dataSet", dataProviderClass = TestData.class)

    public void verifyJobSearchResultUsingDifferentDataSet(String enterjobTitle, String enterlocation,
                                                           String distance, String salaryMin, String salaryMax,
                                                           String salaryType, String jobType, String result) throws InterruptedException {
        homePage.acceptIFrameAlert();
        homePage.enterJobTitle(enterjobTitle);
        homePage.enterLocation(enterlocation);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
        resultPage.verifyTheResults(result);
    }
}
