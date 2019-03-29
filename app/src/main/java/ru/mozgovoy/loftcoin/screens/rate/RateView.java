package ru.mozgovoy.loftcoin.screens.rate;

import java.util.List;

import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;

public interface RateView {

    void setCoins(List<CoinEntity> coins);

    void setRefreshing(Boolean refreshing);

    void showCurrencyDialog();
}
