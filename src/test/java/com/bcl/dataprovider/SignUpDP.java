package com.bcl.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by pmanickam on 12/25/2019 at 12:51 PM
 */
public class SignUpDP {

    @DataProvider(name = "SignUpParams")
    public static Object[][] SignUpParams() {

        return new Object[][] { {"test@gmail.com", "Dhanesh@123", "Dhanesh@123", "12322"} };

    }

}
