package com.bcl.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * DataProvider class for SignUp page
 */
public class SignUpDP {

    @DataProvider(name = "SignUpParams")
    public static Object[][] SignUpParams() {

        return new Object[][] { {"test@gmail.com", "Dhanesh@123", "Dhanesh@123", "12322"} };

    }

}
