package com.example.mvppattern;

//Model Implementation Class

import android.text.TextUtils;

public class LoginModelImpl implements LoginModel{
    private LoginPresenter presenter;

    public LoginModelImpl(LoginPresenter presenter){
        this.presenter=presenter;

    }
    @Override
    public void validateUser(String username, String password) {
        if (TextUtils.isEmpty(username)||TextUtils.isEmpty(password)){
            presenter.onError("Username or Password Empty!!");
        }else {
            presenter.onSuccess();
        }

    }
}
