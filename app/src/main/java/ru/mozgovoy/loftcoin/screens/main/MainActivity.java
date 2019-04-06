package ru.mozgovoy.loftcoin.screens.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;
import ru.mozgovoy.loftcoin.R;
import ru.mozgovoy.loftcoin.screens.converter.ConverterFragment;
import ru.mozgovoy.loftcoin.screens.rate.RateFragment;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bottom_navigation)
    BottomNavigationView bottomNavigation;

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationListener);
        bottomNavigation.setOnNavigationItemReselectedListener(menuItem -> {

        });
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navigationListener = menuItem -> {
        switch (menuItem.getItemId()) {
            case R.id.menu_item_accounts:

                return true;

            case R.id.menu_item_rate:
                showRateFragment();
                return true;

            case R.id.menu_item_converter:
                showConverterFragment();
                return true;
        }

        return false;
    };

    private void showRateFragment() {
        RateFragment fragment = new RateFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }

    private void showConverterFragment() {
        ConverterFragment fragment = new ConverterFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }
}
