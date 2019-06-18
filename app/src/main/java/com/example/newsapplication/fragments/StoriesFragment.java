package com.example.newsapplication.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.newsapplication.R;
import com.example.newsapplication.adapters.RecyclerAdapter;
import com.example.newsapplication.model.Results;
import com.example.newsapplication.mvp.BaseFragment;
import com.example.newsapplication.presenters.StoriesPresenter;
import com.example.newsapplication.view.IStoriesView;

import java.util.List;

public class StoriesFragment extends BaseFragment<StoriesPresenter> implements IStoriesView {


    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;

    @Override
    protected StoriesPresenter createPresenter() {
        return new StoriesPresenter();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_stories;
    }

    private void configureRecycler() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        adapter = new RecyclerAdapter();
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.recycler);
        configureRecycler();
    }


    @Override
    public void showNewsList(List<Results> list) {
//        adapter.getData().clear();
        adapter.setData(list);
    }
}



