package ru.mozgovoy.loftcoin.screens.rate;

import java.util.List;

import ru.mozgovoy.loftcoin.data.api.model.Coin;

public interface RateView {

    void setCoins(List<Coin> coins);

    void setRefreshing(Boolean refreshing);

    void showCurrencyDialog();
}
