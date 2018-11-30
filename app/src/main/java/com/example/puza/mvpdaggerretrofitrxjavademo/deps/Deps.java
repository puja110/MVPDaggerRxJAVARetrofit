package com.example.puza.mvpdaggerretrofitrxjavademo.deps;

import com.example.puza.mvpdaggerretrofitrxjavademo.home.HomeActivity;
import com.example.puza.mvpdaggerretrofitrxjavademo.networking.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworkModule.class,})
public interface Deps {
    void inject(HomeActivity homeActivity);
}
