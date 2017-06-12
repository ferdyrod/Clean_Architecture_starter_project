package com.ferdyrodriguez.package_Name.presentation.executor;

import com.ferdyrodriguez.package_Name.domain.executor.PostExecutionThread;

import javax.inject.Inject;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * Created by ferdyrod on 6/12/17.
 */

public class UIThread implements PostExecutionThread{

    @Inject public UIThread() {}

    @Override public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
