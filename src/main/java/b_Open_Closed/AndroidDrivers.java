package b_Open_Closed;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidDrivers implements IDrivers{

    public  AppiumDriver driver;
    public static final String server = "http://0.0.0.0:4723/wd/hub";
    @Override
    public AppiumDriver createDriver() throws MalformedURLException {
        UiAutomator2Options androidOptions = new UiAutomator2Options();
        androidOptions.setCapability(MobileCapabilityType.PLATFORM_VERSION ,"12.0");
        androidOptions.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        androidOptions.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
        androidOptions.setApp("./android.apk");
        URL url = new URL(server);
        androidOptions.setApp(url);
        driver = new AndroidDriver(url,androidOptions);
        return driver;


    }
}
