package ru.mozgovoy.loftcoin;

import android.app.Application;

import ru.mozgovoy.loftcoin.data.api.Api;
import ru.mozgovoy.loftcoin.data.api.ApiInitializer;
import ru.mozgovoy.loftcoin.data.prefs.Prefs;
import ru.mozgovoy.loftcoin.data.prefs.PrefsImpl;
import timber.log.Timber;

public class App extends Application {

    private Prefs prefs;
    private Api api;

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        prefs = new PrefsImpl(this);
        api = new ApiInitializer().init();
    }

    public Prefs getPrefs() {
        return prefs;
    }

    public Api getApi() {
        return api;
    }
}