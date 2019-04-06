package ru.mozgovoy.loftcoin.screens.currencies;

import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;

public interface CurrenciesAdapterListener {
    void onCurrencyClick(CoinEntity coin);
}
