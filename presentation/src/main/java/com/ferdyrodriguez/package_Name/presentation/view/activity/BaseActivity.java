package com.ferdyrodriguez.package_Name.presentation.view.activity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ferdyrodriguez.package_Name.presentation.MainApplication;
import com.ferdyrodriguez.package_Name.presentation.internal.di.components.ApplicationComponent;
import com.ferdyrodriguez.package_Name.presentation.internal.di.modules.ActivityModule;
import com.ferdyrodriguez.package_Name.presentation.navigation.Navigator;

import javax.inject.Inject;

public class BaseActivity extends AppCompatActivity {

    @Inject
    Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getApplicationComponent().inject(this);
    }

    protected void addFragment(int containerViewId, Fragment fragment) {
        final FragmentTransaction fragmentTransaction = this.getFragmentManager().beginTransaction();
        fragmentTransaction.add(containerViewId, fragment);
        fragmentTransaction.commit();
    }

    protected ApplicationComponent getApplicationComponent() {
        return ((MainApplication) getApplication()).getApplicationComponent();
    }


    protected ActivityModule getActivityModule() { return new ActivityModule(this); }


}
