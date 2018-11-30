package com.example.puza.mvpdaggerretrofitrxjavademo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.puza.mvpdaggerretrofitrxjavademo.deps.DaggerDeps;
import com.example.puza.mvpdaggerretrofitrxjavademo.deps.Deps;
import com.example.puza.mvpdaggerretrofitrxjavademo.networking.NetworkModule;

import java.io.File;

public class BaseApp extends AppCompatActivity{
    Deps deps;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        File cacheFile = new File(getCacheDir(), "responses");
        deps = DaggerDeps.builder().networkModule(new NetworkModule(cacheFile)).build();

    }

    public Deps getDeps() {
        return deps;
    }
}