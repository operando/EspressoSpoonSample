package com.os.operando.espressospoonsample.activities;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.os.operando.espressospoonsample.R;
import com.squareup.spoon.Spoon;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test() {
        Spoon.screenshot(mActivityRule.getActivity(), "test");
        onView(withId(R.id.button)).perform(click());
        Spoon.screenshot(mActivityRule.getActivity(), "test2");
    }
}
