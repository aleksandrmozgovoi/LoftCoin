package ru.mozgovoy.loftcoin.data.db.room;

import java.util.List;

import io.reactivex.Flowable;
import ru.mozgovoy.loftcoin.data.db.Database;
import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;
import ru.mozgovoy.loftcoin.data.db.model.Transaction;
import ru.mozgovoy.loftcoin.data.db.model.TransactionModel;
import ru.mozgovoy.loftcoin.data.db.model.Wallet;
import ru.mozgovoy.loftcoin.data.db.model.WalletModel;

public class DatabaseImplRoom implements Database {

    private AppDatabase appDatabase;

    public DatabaseImplRoom(AppDatabase appDatabase) {
        this.appDatabase = appDatabase;
    }

    @Override
    public void saveCoins(List<CoinEntity> coins) {
        appDatabase.coinDao().saveCoins(coins);
    }

    @Override
    public Flowable<List<CoinEntity>> getCoins() {
        return appDatabase.coinDao().getCoins();
    }

    @Override
    public CoinEntity getCoin(String symbol) {
        return appDatabase.coinDao().getCoin(symbol);
    }

    @Override
    public void saveWallet(Wallet wallet) {
        appDatabase.walletDao().saveWallet(wallet);
    }

    @Override
    public Flowable<List<WalletModel>> getWallets() {
        return appDatabase.walletDao().getWallets();
    }

    @Override
    public void saveTransaction(List<Transaction> transactions) {
        appDatabase.walletDao().saveTransactions(transactions);
    }

    @Override
    public Flowable<List<TransactionModel>> getTransactions(String walletId) {
        return appDatabase.walletDao().getTransaction(walletId);
    }

}