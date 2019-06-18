package com.example.newsapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.newsapplication.api.ApiManager;
import com.example.newsapplication.api.ResponseListener;
import com.example.newsapplication.model.NewsResponse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ApiManager apiManager = new ApiManager();
//        apiManager.getNews(new ResponseListener() {
//            @Override
//            public void successResponse(NewsResponse response) {
//                response.toString();
//            }
//
//            @Override
//            public void failureResponse() {
//
//            }
//        });

    }
}
