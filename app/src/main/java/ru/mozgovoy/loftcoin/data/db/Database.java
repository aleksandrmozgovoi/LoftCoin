package ru.mozgovoy.loftcoin.data.db;

import java.util.List;

import io.reactivex.Flowable;
import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;
import ru.mozgovoy.loftcoin.data.db.model.Wallet;
import ru.mozgovoy.loftcoin.data.db.model.WalletModel;

public interface Database {
    void saveCoins(List<CoinEntity> coins);

    Flowable<List<CoinEntity>> getCoins();

    CoinEntity getCoin(String symbol);

    void saveWallet(Wallet wallet);

    Flowable<List<WalletModel>> getWallets();
}
