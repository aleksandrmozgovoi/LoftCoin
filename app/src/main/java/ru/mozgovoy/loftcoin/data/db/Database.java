package ru.mozgovoy.loftcoin.data.db;

import java.util.List;

import io.reactivex.Flowable;
import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;
import ru.mozgovoy.loftcoin.data.db.model.Transaction;
import ru.mozgovoy.loftcoin.data.db.model.Wallet;

public interface Database {
    void saveCoins(List<CoinEntity> coins);

    Flowable<List<CoinEntity>> getCoins();

    CoinEntity getCoin(String symbol);

    void saveWallet(Wallet wallet);

    Flowable<List<Wallet>> getWallets();

    void saveTransaction(List<Transaction> transactions);

    Flowable<List<Transaction>> getTransactions(String walletId);

    void open();

    void close();
}
