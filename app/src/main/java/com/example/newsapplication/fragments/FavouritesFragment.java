package com.example.newsapplication.fragments;

import com.example.newsapplication.R;
import com.example.newsapplication.mvp.BaseFragment;
import com.example.newsapplication.presenters.FavouritesPresenter;
import com.example.newsapplication.view.IFavouritesView;

public class FavouritesFragment extends BaseFragment<FavouritesPresenter> implements IFavouritesView {

    @Override
    protected FavouritesPresenter createPresenter() {
        return new FavouritesPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_favourites;
    }
}
