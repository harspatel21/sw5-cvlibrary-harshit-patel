package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Harshit Patel
 */
public class TestData {
    @DataProvider(name = "dataSet")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                //|jobTitle|location|distance|salaryMin|salaryMax|salaryType|jobType|result|
                {"Tester", "Harrow", "up to 5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Manager", "Stevenage", "up to 15 miles", "500", "1000", "Per day", "Part Time", "Part Time Manager jobs in Stevenage"},
                {"Electrician", "Luton", "up to 15 miles", "5000", "6000", "Per month", "Permanent", "Permanent Electrician jobs in Luton"},
                {"Driver", "Edgware", "up to 10 miles", "60000", "700000", "Per annum", "Part Time", "Part Time Driver jobs in Edgware"},
                {"Customer Assistant", "StAlbans", "up to 2 miles", "200", "2000", "Per week", "Contract", "Contract Customer Assistant jobs in StAlbans"},
                {"Team Manager", "Welyn Garden City", "up to 50 miles", "900000", "9000000", "Per annum", "Part Time", "Part Time Team Manager jobs in Welyn Garden City"},
                {"Team Manager", "Petersborough", "up to 50 miles", "900000", "9000000", "Per annum", "Contract", "Contract Team Manager jobs in Petersborough"},

        };
        return data;
    }


}
