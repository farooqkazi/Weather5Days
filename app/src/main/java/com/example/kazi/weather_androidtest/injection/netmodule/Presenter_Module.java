package com.example.kazi.weather_androidtest.injection.netmodule;

import com.example.kazi.weather_androidtest.services.WeatherInteractor_Impl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by kazi on 14/08/2017.
 */

@Module
public class Presenter_Module {

    @Provides
    public WeatherInteractor_Impl getInteractor(){
        return new WeatherInteractor_Impl();
    }
}
