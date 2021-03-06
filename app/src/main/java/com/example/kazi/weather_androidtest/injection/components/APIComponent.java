package com.example.kazi.weather_androidtest.injection.components;


import com.example.kazi.weather_androidtest.injection.netmodule.APIModule;
import com.example.kazi.weather_androidtest.services.WeatherInteractor_Impl;

import dagger.Component;

/**
 * Created by kazi on 14/08/2017.
 */
@PerActivity
@Component(dependencies = NetComponent.class, modules = APIModule.class)
public interface APIComponent {
    void inject(WeatherInteractor_Impl movieList_interactor);
}
