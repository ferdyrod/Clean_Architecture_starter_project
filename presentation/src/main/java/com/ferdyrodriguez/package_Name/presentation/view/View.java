package com.ferdyrodriguez.package_Name.presentation.view;


import android.content.Context;

public interface View {
    void showLoading();
    void hideLoading();
    void showLError(String message);
    Context context();
}
