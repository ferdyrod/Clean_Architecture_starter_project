package com.ferdyrodriguez.package_Name.presentation.internal.di.components;


import android.app.Activity;

import com.ferdyrodriguez.package_Name.presentation.internal.di.modules.ActivityModule;

import dagger.Component;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();
}
