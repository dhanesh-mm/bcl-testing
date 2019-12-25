package com.bcl.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by pmanickam on 12/25/2019 at 11:50 AM
 */
public class SignInDP {

    @DataProvider(name = "SigInParams")
    public static Object[][] SigInParams() {

        return new Object[][] { {"bcltest780+2@gmail.com", "Dhanesh@123"} };

    }

}
