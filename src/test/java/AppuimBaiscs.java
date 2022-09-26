import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import java.net.MalformedURLException;
import java.net.URL;

public class AppuimBaiscs {

    @Test()
    public void test() throws MalformedURLException {

//        DesiredCapabilities cap= new DesiredCapabilities();
//        File appDir = new File("src/test/resources");
//        File app = new File(appDir, "ApiDemos-debug.apk");
//        System.out.println(app.getAbsolutePath());


        UiAutomator2Options options = new UiAutomator2Options()
                .setDeviceName("Pixel_2_XL_API_30")
                .setApp("/Users/munaabuyounes/IdeaProjects/Learning-mobile/src/test/resources/ApiDemos-debug.apk")
                ;

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);


        driver.findElement(AppiumBy.accessibilityId("Views")).click();
        String str = "WebView";
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + str +"\").instance(0))"));
//        String str2= "Grid";
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + str2 +"\").instance(0))"));


        boolean canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture",
                ImmutableMap.builder()
                        .put("elementId", element.getId())
                        .put("direction", "up")
                        .put("percent", 3.0)
                        .build()
        );


//        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_XL_API_30");
//        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");

//        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");//new step

//        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
//
//        try {
//
//            AndroidDriver driver = new AndroidDriver(new URL("http:/127.0.0.1:4723/wd/hub"), cap);
//
//            driver.findElement(MobileBy.ByAccessibilityId(""));
//
//            driver.quit();
//        } catch (MalformedURLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
