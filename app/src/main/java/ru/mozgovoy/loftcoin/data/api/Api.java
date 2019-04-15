package ru.mozgovoy.loftcoin.data.api;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import ru.mozgovoy.loftcoin.data.api.model.RateResponse;

public interface Api {
    String CONVERT = "USD";

    @GET("cryptocurrency/listings/latest")
    @Headers("X-CMC_PRO_API_KEY: b2be9f71-86ab-4b7e-8b15-6e82e51f1b34")
    Observable<RateResponse> rates(@Query("convert") String convert);

}
