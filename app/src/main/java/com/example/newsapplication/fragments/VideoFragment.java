package com.example.newsapplication.fragments;

import com.example.newsapplication.R;
import com.example.newsapplication.mvp.BaseFragment;
import com.example.newsapplication.presenters.VideoPresenter;
import com.example.newsapplication.view.IVideoView;

public class VideoFragment extends BaseFragment<VideoPresenter> implements IVideoView {



    @Override
    protected VideoPresenter createPresenter() {
        return new VideoPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_video;
    }
}
