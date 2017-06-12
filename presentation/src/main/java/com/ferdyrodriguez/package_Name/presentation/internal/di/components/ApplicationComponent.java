package com.ferdyrodriguez.package_Name.presentation.internal.di.components;

import android.content.Context;

import com.ferdyrodriguez.package_Name.domain.executor.PostExecutionThread;
import com.ferdyrodriguez.package_Name.domain.executor.ThreadExecutor;
import com.ferdyrodriguez.package_Name.domain.repository.Repository;
import com.ferdyrodriguez.package_Name.presentation.internal.di.modules.ApplicationModule;
import com.ferdyrodriguez.package_Name.presentation.view.activity.BaseActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    void inject(BaseActivity baseActivity);

    Context context();
    ThreadExecutor threadExecutor();
    PostExecutionThread postExecutionThread();
    Repository repository();
}
