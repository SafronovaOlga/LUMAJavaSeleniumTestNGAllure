package com.lumatest.tests;import com.lumatest.base.BaseTest;import com.lumatest.data.TestData;import io.qameta.allure.*;import org.testng.Assert;import org.testng.annotations.Test;public class NavigationTest extends BaseTest{    //    @Test(//            description = "TC-01 Open Base URL",//            groups = {"Smoke", "Regression"},//            testName = "NAVIGATION | Open Base URL"//    )//    @Story("Navigation")//    @Severity(SeverityLevel.BLOCKER)//    @Description("To verify that the base URL and title of the application are correct and as expected.")//    @Link(TestData.BASE_URL)//    public void testOpenBaseURL() {//        Allure.step("Set up expected results.");//        final String expectedURL = TestData.BASE_URL + "/";//        final String expectedTitle = TestData.BASE_URL_TITLE;////        Allure.step("Open base URL.");//        getDriver().get(TestData.BASE_URL);////        Allure.step("Collect actual URL and actual title.");//        final String actualURL = getDriver().getCurrentUrl();//        final String actualTitle = getDriver().getTitle();////        Allure.step("Verify that the actual URL is as expected.");//        Assert.assertEquals(actualURL, expectedURL);//        Allure.step("Verify that the actual title is as expected.");//        Assert.assertEquals(actualTitle, expectedTitle);//    }    //    @Test//    public void testNavigationMenu(){//        //nav//span[text()="What's New"]//        Allure.step("Setup expected result");//        final String expectedURL = TestData.BASE_URL + "/";//        //        final String expectedURL = "https://magento.softwaretestingboard.com/";//        final String expectedTitle = TestData.BASE_URL_TITLE;//        //        final String expectedTitle = "Home Page";////        Allure.step("Open base URL");//        getDriver().get( TestData.BASE_URL);////        Allure.step("Collect actual result");//        final String actualURL = getDriver().getCurrentUrl();//        final String actualTitle = getDriver().getTitle();////        Allure.step("Verify actualURL, expected URL");//        Assert.assertEquals(actualURL, expectedURL);////        Allure.step("Verify actualTitle, expectedTitle");//        Assert.assertEquals(actualTitle, expectedTitle);//    }}