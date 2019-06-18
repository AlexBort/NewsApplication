package com.example.newsapplication.presenters;

import com.example.newsapplication.api.ApiManager;
import com.example.newsapplication.api.ResponseListener;
import com.example.newsapplication.model.NewsResponse;
import com.example.newsapplication.model.Results;
import com.example.newsapplication.mvp.BasePresenter;
import com.example.newsapplication.view.IStoriesView;

import java.util.List;

public class StoriesPresenter extends BasePresenter<IStoriesView> {

    private ApiManager apiManager = new ApiManager();

    @Override
    public void onBindView(IStoriesView view) {
        super.onBindView(view);
        sendRequestNews(view);
    }


    private void sendRequestNews(final IStoriesView view) {

        apiManager.getNews(new ResponseListener() {
            @Override
            public void successResponse(NewsResponse response) {
                List<Results> list = response.getResults();
                view.showNewsList(list);
                // name
                // image
                //
            }

            @Override
            public void failureResponse() {

            }
        });
    }

}
