package com.example.kazi.weather_androidtest.mvp;

/**
 * Created by kazi on 14/08/2017.
 */

public interface MVPPresenter<V extends MVPView> {
    void attachView(V mvpview);
    void detachView();
}
