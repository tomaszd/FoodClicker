package com.example.tomaszek.foodclicker;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class FoodClickerTests {


    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule
            = new ActivityTestRule<>(
            MainActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<PiramidActivity> piramidActivityRule
            = new ActivityTestRule<>(
            PiramidActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent


    @Rule
    public ActivityTestRule<TabelaActivity> tabelaActivityRule
            = new ActivityTestRule<>(
            TabelaActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent



    @Rule
    public ActivityTestRule<SettingsActivity> settingsActivityRule
            = new ActivityTestRule<>(
            SettingsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent
    
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        assertEquals("com.example.tomaszek.foodclicker", appContext.getPackageName());

    }

    @Test
    public void startMainActivity() throws Exception {
        Intent intent = new Intent();
        mainActivityRule.launchActivity(intent);

    }

    @Test
    public void startPiramidActivityFromMainActivity() throws Exception {
        Intent intent = new Intent();
        piramidActivityRule.launchActivity(intent);

    }

    @Test
    public void startTabelaActivityFromMainActivity() throws Exception {
        Intent intent = new Intent();
        tabelaActivityRule.launchActivity(intent);

    }

    @Test
    public void startSettingsActivityFromMainActivity() throws Exception {
        Intent intent = new Intent();
        settingsActivityRule.launchActivity(intent);

    }





}
