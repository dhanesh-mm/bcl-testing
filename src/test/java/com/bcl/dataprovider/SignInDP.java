package com.bcl.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * DataProvider class for SignIn page
 */
public class SignInDP {

    @DataProvider(name = "SigInParams")
    public static Object[][] SigInParams() {

        return new Object[][] { {"bcltest780+2@gmail.com", "Dhanesh@123"} };

    }

}
