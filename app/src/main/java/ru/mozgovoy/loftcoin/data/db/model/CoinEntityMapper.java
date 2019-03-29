package ru.mozgovoy.loftcoin.data.db.model;

import java.util.List;

import ru.mozgovoy.loftcoin.data.api.model.Coin;

public interface CoinEntityMapper {
    List<CoinEntity> map(List<Coin> coins);
}
