package b_Open_Closed;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

public class IOSDrivers implements IDrivers{

    public  AppiumDriver driver;
    public static final String server = "http://0.0.0.0:4723/wd/hub";
    @Override
    public AppiumDriver createDriver() throws MalformedURLException {

        XCUITestOptions iOSOptions = new XCUITestOptions();
        iOSOptions.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        iOSOptions.setCapability(MobileCapabilityType.AUTOMATION_NAME,"XCUITest");
        iOSOptions.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12");
        iOSOptions.setBundleId("com.example.mobileapp");
        iOSOptions.setApp("./iOSApp.app");
        URL url = new URL(server);
        iOSOptions.setApp(url);
        driver = new IOSDriver(url,iOSOptions);
        return driver;


    }
}
