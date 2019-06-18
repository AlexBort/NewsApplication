package com.example.newsapplication.view;

import com.example.newsapplication.model.Results;
import com.example.newsapplication.mvp.IBaseView;

import java.util.List;

public interface IStoriesView extends IBaseView {

    void showNewsList(List<Results> list);
}
