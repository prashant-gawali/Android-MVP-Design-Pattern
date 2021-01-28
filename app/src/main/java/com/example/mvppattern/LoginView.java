package com.example.mvppattern;

//View Interface

public interface LoginView {
    void onSuccess();
    void onFailure();
    void onError(String errorMessage);
}
