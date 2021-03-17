package com.hfad.ad3lesson3.data.remote;
import com.hfad.ad3lesson3.BuildConfig;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {

    private RetrofitBuilder(){}

    private static AndroidApi instance;

    public static AndroidApi getInstance() {
        if (instance == null) {
            instance = createApi();
        }
        return instance;
    }

    private static AndroidApi createApi() {
        return new Retrofit
                .Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AndroidApi.class);
    }
}