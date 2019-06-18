package com.example.newsapplication.fragments;

import com.example.newsapplication.R;
import com.example.newsapplication.mvp.BaseFragment;
import com.example.newsapplication.presenters.StoriesPresenter;
import com.example.newsapplication.view.IStoriesView;

public class StoriesFragment extends BaseFragment<StoriesPresenter> implements IStoriesView {

    @Override
    protected StoriesPresenter createPresenter() {
        return new StoriesPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_stories;
    }
}



