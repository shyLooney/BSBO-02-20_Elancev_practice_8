package ru.mirea.elancev.yandexdriver;

import android.app.Application;

import com.yandex.mapkit.MapKitFactory;

public class App extends Application {
    private final String MAPKIT_API_KEY = "2da11fcc-d733-486d-aa96-95580ba9521a";
    @Override
    public void onCreate() {
        super.onCreate();

        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
