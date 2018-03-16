package com.example.tomaszek.foodclicker;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

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

    @Rule
    public ActivityTestRule<InneDetailsActivity> inneDetailsActivityRule
            = new ActivityTestRule<>(
            InneDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<NabialDetailsActivity> nabialDetailsActivityRule
            = new ActivityTestRule<>(
            NabialDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<OlejorzechDetailsActivity> olejorzechDetailsActivityTestRule
            = new ActivityTestRule<>(
            OlejorzechDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<RybyDetailsActivity> rybyDetailsActivityTestRule
            = new ActivityTestRule<>(
            RybyDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent


    @Rule
    public ActivityTestRule<OwoceDetailsActivity> owoceDetailsActivityTestRule
            = new ActivityTestRule<>(
            OwoceDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<WarzywaDetailsActivity> warzywaDetailsActivityTestRule
            = new ActivityTestRule<>(
            WarzywaDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<WodaDetailsActivity> wodaDetailsActivityActivityTestRule
            = new ActivityTestRule<>(
            WodaDetailsActivity.class,
            true,     // initialTouchMode
            false);   // launchActivity. False to customize the intent

    @Rule
    public ActivityTestRule<ZbozaDetailsActivity> zbozaDetailsActivityTestRule
            = new ActivityTestRule<>(
            ZbozaDetailsActivity.class,
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
    public void startPiramidActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        piramidActivityRule.launchActivity(intent);

    }

    @Test
    public void startTabelaActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        tabelaActivityRule.launchActivity(intent);

    }

    @Test
    public void startSettingsActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        settingsActivityRule.launchActivity(intent);

    }

    @Test
    public void inneDetailsStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        inneDetailsActivityRule.launchActivity(intent);

    }

    @Test
    public void nabialDetailsActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        nabialDetailsActivityRule.launchActivity(intent);
    }

    @Test
    public void olejorzechDetailsStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        olejorzechDetailsActivityTestRule.launchActivity(intent);
    }

    @Test
    public void owoceDetailsActivityTestRuleStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        owoceDetailsActivityTestRule.launchActivity(intent);
    }

    @Test
    public void rybyDetailsActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        rybyDetailsActivityTestRule.launchActivity(intent);
    }

    @Test
    public void warzywaDetailsActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        warzywaDetailsActivityTestRule.launchActivity(intent);
    }

    @Test
    public void wodaDetailsActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        wodaDetailsActivityActivityTestRule.launchActivity(intent);
    }

    @Test
    public void zbozaDetailsActivityStartWithoutCrash() throws Exception {
        Intent intent = new Intent();
        zbozaDetailsActivityTestRule.launchActivity(intent);
    }
}
