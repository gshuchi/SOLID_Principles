package b_Open_Closed;

import java.net.MalformedURLException;

public class Drivers {

    public static String platform = "Android";
    public static void main(String[] args) throws MalformedURLException {

        if (platform.equalsIgnoreCase("android")){
            AndroidDrivers android = new AndroidDrivers();
            android.createDriver();
        } else if (platform.equalsIgnoreCase("iOS")){
            IOSDrivers iOS = new IOSDrivers();
            iOS.createDriver();

        }
    }
}