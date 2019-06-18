package com.example.newsapplication.mvp;

interface IBasePresenter<V extends IBaseView> {
    void onBindView(V view);

    void onUnbindView();

}
