package uk.co.library.pages;
// **** Created By Harshit Patel ****

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//div/h1[@class = 'search-header__title']")
    WebElement resultText;

    public void verifyTheResults(String expected){
        CustomListeners.test.log(Status.PASS,"Verifying Test Results "+resultText.toString());
        verifyThatTextIsDisplayed(resultText,expected);
    }
}
