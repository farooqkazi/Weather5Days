package com.example.kazi.weather_androidtest.injection.netmodule;


import com.example.kazi.weather_androidtest.injection.components.PerActivity;
import com.example.kazi.weather_androidtest.services.RequestInterface;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by kazi on 14/08/2017.
 */
@Module
public class APIModule {
    @PerActivity
    @Provides
    RequestInterface provideMovieAPI(Retrofit retrofit) {
        return retrofit.create(RequestInterface.class);
    }
}
