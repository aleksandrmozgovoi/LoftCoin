package ru.mozgovoy.loftcoin.screens.wallets;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;
import ru.mozgovoy.loftcoin.data.db.model.Transaction;
import ru.mozgovoy.loftcoin.data.db.model.Wallet;

abstract class WalletsViewModel extends AndroidViewModel {

    public WalletsViewModel(@NonNull Application application) {
        super(application);
    }

    public abstract LiveData<Object> selectCurrency();

    public abstract LiveData<Boolean> walletsVisible();

    public abstract LiveData<Boolean> newWalletVisible();

    public abstract LiveData<List<Wallet>> wallets();

    public abstract LiveData<List<Transaction>> transactions();

    abstract void getWallets();

    abstract void onNewWalletClick();

    abstract void onCurrencySelected(CoinEntity coinEntity);

    abstract void onWalletChanged(int position);
}