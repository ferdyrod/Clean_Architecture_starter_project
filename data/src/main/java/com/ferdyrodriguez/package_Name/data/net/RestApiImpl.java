package com.ferdyrodriguez.package_Name.data.net;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ferdyrod on 6/12/17.
 */

public class RestApiImpl implements RestApi {

    public static <T> T createRetrofitService(final Class<T> clazz) {
        final Retrofit retrofit =
                new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_API_URL)
                .build();

        return retrofit.create(clazz);
    }
}