package com.ferdyrodriguez.package_Name.presentation.internal.di.components;

import java.lang.annotation.Retention;
import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Scope
@Retention(RUNTIME)
public @interface PerActivity {}