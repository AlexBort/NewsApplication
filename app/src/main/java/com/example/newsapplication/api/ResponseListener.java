package com.example.newsapplication.api;

import com.example.newsapplication.model.NewsResponse;

public interface ResponseListener {

    void successResponse(NewsResponse response);

    void failureResponse();

}
