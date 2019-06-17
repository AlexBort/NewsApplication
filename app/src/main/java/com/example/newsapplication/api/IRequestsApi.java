package com.example.newsapplication.api;

import com.example.newsapplication.model.NewsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IRequestsApi {


    @GET("?cursor=cD0yMDE3LTEwLTE3KzE0JTNBNDglM0E1MS4zODgwMzklMkIwMCUzQTAw")
    Call<NewsResponse> getNews();

}
