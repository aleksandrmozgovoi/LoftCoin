package ru.mozgovoy.loftcoin.data.prefs;

import ru.mozgovoy.loftcoin.utils.Fiat;

public interface Prefs {
    boolean isFirstLaunch();

    void setFirstLaunch(boolean firstLaunch);

    void setFiatCurrency(Fiat fiat);

    Fiat getFiatCurrency();
}
