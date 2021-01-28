package com.example.mvppattern;

//Presenter Interface

public interface LoginPresenter {

    void onHandleLogin(String username, String password);

    void onSuccess();

    void onError(String message);

    void onFailure();

}
