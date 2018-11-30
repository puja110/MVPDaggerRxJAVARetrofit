package com.example.puza.mvpdaggerretrofitrxjavademo.home;

import com.example.puza.mvpdaggerretrofitrxjavademo.models.CityListResponse;

public interface HomeView {
    void showWait();

    void removeWait();

    void onFailure(String appErrorMessage);

    void getCityListSuccess(CityListResponse cityListResponse);

}
