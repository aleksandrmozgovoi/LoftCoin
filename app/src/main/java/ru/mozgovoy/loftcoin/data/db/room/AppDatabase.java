package ru.mozgovoy.loftcoin.data.db.room;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import ru.mozgovoy.loftcoin.data.db.model.CoinEntity;
import ru.mozgovoy.loftcoin.data.db.model.Wallet;

@Database(entities = {CoinEntity.class, Wallet.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CoinDao coinDao();

    public abstract WalletDao walletDao();
}
