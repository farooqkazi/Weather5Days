package com.example.kazi.weather_androidtest.injection.components;

import com.example.kazi.weather_androidtest.WeatherList;
import com.example.kazi.weather_androidtest.injection.netmodule.Presenter_Module;

import dagger.Component;

/**
 * Created by kazi on 14/08/2017.
 */

@PerActivity
@Component(dependencies = {Presenter_Module.class})
public interface IPresenterComponent {

    void inject(WeatherList weatherList);

}
