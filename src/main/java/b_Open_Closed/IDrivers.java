package b_Open_Closed;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface IDrivers {

    public AppiumDriver createDriver() throws MalformedURLException;

}
