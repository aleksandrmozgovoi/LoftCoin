package ru.mozgovoy.loftcoin.screens.currencies;

import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;

public interface CurrenciesBottomSheetListener {
    void onCurrencySelected(CoinEntity coin);
}
