package com.assign.eckovationpart1;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

/**
 * Created by Sidharth on 11/03/16.
 */
public class AppiumTesting {
    AppiumDriver driver;
    @Before
    public void setUp()throws  Exception
    {
        //service.start();
        //reader.readFile();
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability("device", "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Appium Tester");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
        cap.setCapability(CapabilityType.VERSION, "4.4");
        cap.setCapability(CapabilityType.PLATFORM, "OS X 10.10");
        cap.setCapability(MobileCapabilityType.APP, "/Users/Sidharth/Downloads/eckovation.apk");
        cap.setCapability("app-package", "com.assign.eckovationpart1");
        cap.setCapability("app-activity", "com.assign.eckovationpart1.MainActivity");
        driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

    }

    @Test
    public void testcase1()throws  Exception
    {
        List<AndroidElement> likeButtonList = driver.findElementsById("com.assign.eckovationpart1:id/likes");
        for (int i=0;i<likeButtonList.size();i++){
            likeButtonList.get(i).click();
        }
    }


    @Test
    public void testcase2()throws  Exception
    {
        driver.scrollTo("Sidharth Sethia");
        driver.scrollTo("Jennifer Lawrence");
    }

    @Test
    public void testcase3()throws  Exception
    {
        List<AndroidElement> commentButtonList = driver.findElementsById("com.assign.eckovationpart1:id/comments");
        for (int i=0;i<commentButtonList.size();i++){
            commentButtonList.get(i).click();
            driver.findElementByClassName("android.widget.EditText").sendKeys("Some Text");
            driver.findElementByClassName("android.widget.Button").click();
        }
    }

    @Test
    public void testcase4()throws  Exception
    {
        List<AndroidElement> shareButtonList = driver.findElementsById("com.assign.eckovationpart1:id/share");
        for (int i=0;i<shareButtonList.size();i++){
            shareButtonList.get(i).click();
            driver.findElement(By.name("Email")).click();
        }
    }

    @Test
    public void testcase5()throws  Exception
    {
        List<AndroidElement> imageList = driver.findElementsById("com.assign.eckovationpart1:id/image");
        for (int i=0;i<imageList.size();i++){
            imageList.get(i).click();
            Assert.assertEquals(driver.findElementById("com.assign.eckovationpart1:id/desc").getText(), "Image Clicked");
        }
    }




    @After
    public void testCaseTearDown()
    {
        driver.quit();
    }
}
