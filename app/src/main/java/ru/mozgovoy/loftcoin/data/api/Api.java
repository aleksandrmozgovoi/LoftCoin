package ru.mozgovoy.loftcoin.data.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import ru.mozgovoy.loftcoin.data.api.model.RateResponse;

public interface Api {
    String CONVERT = "USD,EUR,RUB";

    @GET("cryptocurrency/listings/latest")
    @Headers("X-CMC_PRO_API_KEY: 40b1f843-c962-4d31-9461-c101a04c18be")
    Observable<RateResponse> rates(@Query("convert") String convert);

}
