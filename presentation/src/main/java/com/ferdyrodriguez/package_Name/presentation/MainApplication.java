package com.ferdyrodriguez.package_Name.presentation;

import android.app.Application;

import com.ferdyrodriguez.package_Name.presentation.internal.di.components.ApplicationComponent;
import com.ferdyrodriguez.package_Name.presentation.internal.di.modules.ApplicationModule;

/**
 * Created by ferdyrod on 6/12/17.
 */

public class MainApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }

    private void initializeInjector() {
        applicationComponent = DaggerApplicationComponent.builer()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent(){
        return this.applicationComponent;
    }

}
