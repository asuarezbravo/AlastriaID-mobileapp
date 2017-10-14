package io.alastria.alastriaid.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import io.alastria.alastriaid.R;
import io.alastria.alastriaid.model.Service;
import io.alastria.alastriaid.profile.ProfileActivity;
import io.alastria.alastriaid.util.Utils;


public class HorizontalServiceListViewFragment extends Fragment {

    ArrayList<Service> mListServices;
    RecyclerView mRecyclerView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_horizontal_service_list_view, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.cardView);
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager myLayoutManager = new LinearLayoutManager(getActivity());
        myLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        if (mListServices.size() > 0 & mRecyclerView != null) {
            mRecyclerView.setAdapter(new MyAdapter(mListServices));
        }
        mRecyclerView.setLayoutManager(myLayoutManager);

        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    public void setListServices(ArrayList<Service> services){
        mListServices = services;
    }

    public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
        private ArrayList<Service> mList;

        public MyAdapter(ArrayList<Service> data) {
            mList = data;
        }

        @Override
        public MyViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
            // create a new view
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.service_list_items, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(final MyViewHolder holder, int position) {

            holder.mTitleTextView.setText(mList.get(position).getName());
            holder.mCoverImageView.setImageResource(mList.get(position).getImageResourceId());
            holder.mCoverImageView.setTag(mList.get(position).getImageResourceId());
        }

        @Override
        public int getItemCount() {
            return mList.size();
        }
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView mTitleTextView;
        private ImageView mCoverImageView;

        public MyViewHolder(View v) {
            super(v);
            mTitleTextView = (TextView) v.findViewById(R.id.titleTextView);
            mCoverImageView = (ImageView) v.findViewById(R.id.coverImageView);
        }
    }
}