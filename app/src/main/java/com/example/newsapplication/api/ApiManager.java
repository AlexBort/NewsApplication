package com.example.newsapplication.api;

import com.example.newsapplication.model.NewsResponse;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiManager {

    private IRequestsApi requestsApi;

    public IRequestsApi getRequestsApi() {
        return requestsApi;
    }

    public ApiManager() {
        requestsApi = createRetrofitBuilder().create(IRequestsApi.class);
    }


    private final String BASE_URL = "http://allcom.lampawork.com/api/v1.0/products/";

    private Retrofit createRetrofitBuilder() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                /*.readTimeout(5, TimeUnit.MINUTES)*/
                .build();

        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }


    public void getNews(final ResponseListener listener) {

        Call<NewsResponse> call = requestsApi.getNews();
        call.enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                listener.successResponse(response.body());
            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {
                t.getMessage();
                listener.failureResponse();
            }
        });
    }

}
