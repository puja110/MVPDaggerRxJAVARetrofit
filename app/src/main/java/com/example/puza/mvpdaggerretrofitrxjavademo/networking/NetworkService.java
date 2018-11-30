package com.example.puza.mvpdaggerretrofitrxjavademo.networking;

import com.example.puza.mvpdaggerretrofitrxjavademo.models.CityListResponse;

import retrofit2.http.GET;
import rx.Observable;

public interface NetworkService {

    @GET("v1/city")
    Observable<CityListResponse> getCityList();

}
