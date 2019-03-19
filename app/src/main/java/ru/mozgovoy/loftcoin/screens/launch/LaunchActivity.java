package ru.mozgovoy.loftcoin.screens.launch;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import ru.mozgovoy.loftcoin.App;
import ru.mozgovoy.loftcoin.data.prefs.Prefs;
import ru.mozgovoy.loftcoin.screens.start.StartActivity;
import ru.mozgovoy.loftcoin.screens.welcome.WelcomeActivity;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Prefs prefs = ((App) getApplication()).getPrefs();

        if (prefs.isFirstLaunch()) {
            WelcomeActivity.start(this);
        } else {
            StartActivity.start(this);
        }

        finish();
    }
}