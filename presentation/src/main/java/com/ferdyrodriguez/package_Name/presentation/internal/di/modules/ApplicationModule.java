package com.ferdyrodriguez.package_Name.presentation.internal.di.modules;

import android.content.Context;

import com.ferdyrodriguez.package_Name.data.executor.JobExecutor;
import com.ferdyrodriguez.package_Name.domain.executor.PostExecutionThread;
import com.ferdyrodriguez.package_Name.domain.executor.ThreadExecutor;
import com.ferdyrodriguez.package_Name.presentation.MainApplication;
import com.ferdyrodriguez.package_Name.presentation.executor.UIThread;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    private final MainApplication application;

    public ApplicationModule(MainApplication application) {
        this.application = application;
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return this.application;
    }

    @Provides
    @Singleton
    ThreadExecutor provideThreadExecutor(JobExecutor jobExecutor) {
        return jobExecutor;
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }
}