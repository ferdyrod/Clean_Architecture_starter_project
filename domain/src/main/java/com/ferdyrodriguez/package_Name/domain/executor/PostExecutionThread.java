package com.ferdyrodriguez.package_Name.domain.executor;

import io.reactivex.Scheduler;

/**
 * Created by ferdyrod on 6/12/17.
 */

public interface PostExecutionThread {
    Scheduler getScheduler();
}