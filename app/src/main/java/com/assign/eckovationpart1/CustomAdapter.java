package com.assign.eckovationpart1;

/**
 * Created by Sidharth on 10/02/16.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private List<Element> elementList;

    private Context mContext;

    public CustomAdapter(Context context, List<Element> elements) {
        this.elementList = elements;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, null);

        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        Element item = elementList.get(i);
        customViewHolder.mTitle.setText(item.title);
        customViewHolder.mProfileImage.setImageDrawable(item.profile);
        customViewHolder.mImageView.setImageDrawable(item.image);
        customViewHolder.mDesc.setText(item.desc);
        customViewHolder.mLikes.setText(item.likes + " likes");
        customViewHolder.mComments.setText("Comments(" + item.comments + ")");
        customViewHolder.mTime.setText(item.time);
        customViewHolder.mViews.setText(item.views);
    }

    @Override
    public int getItemCount() {
        return (null != elementList ? elementList.size() : 0);
    }
}