package com.os.operando.espressospoonsample.activities;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LoginSuccessActivityTest {

    @Rule
    public ActivityTestRule<LoginSuccessActivity> mActivityRule = new ActivityTestRule<>(LoginSuccessActivity.class, true, false);

    @Test
    public void loginSuccess() {
        mActivityRule.launchActivity(LoginSuccessActivity.createIntent(InstrumentationRegistry.getTargetContext(), "ios@apple.com"));
        Spoon.screenshot(mActivityRule.getActivity(), "loginSuccess");
    }
}
