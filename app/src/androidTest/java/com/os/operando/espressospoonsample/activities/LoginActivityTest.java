package com.os.operando.espressospoonsample.activities;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.os.operando.espressospoonsample.R;
import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginActivityTest {

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void login_noLogin() {
        onView(withId(R.id.email)).perform(typeText("aaaa@aaa.com"), closeSoftKeyboard());
        onView(withId(R.id.pass)).perform(typeText("aaaa"), closeSoftKeyboard());
        onView(withId(R.id.login_button)).perform(click());
        Spoon.screenshot(mActivityRule.getActivity(), "test2");
    }

    @Test
    public void login_Login() {
        onView(withId(R.id.email)).perform(typeText("test@test.com"), closeSoftKeyboard());
        onView(withId(R.id.pass)).perform(typeText("test"), closeSoftKeyboard());
        onView(withId(R.id.login_button)).perform(click());
        Spoon.screenshot(mActivityRule.getActivity(), "test2");
    }
}

