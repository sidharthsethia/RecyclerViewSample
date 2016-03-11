package com.assign.eckovationpart1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pkmmte.view.CircularImageView;

/**
 * Created by Sidharth on 10/02/16.
 */
public class CustomViewHolder extends RecyclerView.ViewHolder {
    protected TextView mTitle,mTime,mViews,mComments,mLikes,mDesc,mShare;
    protected CircularImageView mProfileImage;
    protected ImageView mImageView;
    protected Element element;
    public CustomViewHolder(View view) {
        super(view);

        this.mTime = (TextView) view.findViewById(R.id.time);
        this.mDesc = (TextView) view.findViewById(R.id.desc);
        this.mTitle = (TextView) view.findViewById(R.id.title);
        this.mViews = (TextView) view.findViewById(R.id.views);
        this.mComments = (TextView) view.findViewById(R.id.comments);
        this.mLikes = (TextView) view.findViewById(R.id.likes);
        this.mProfileImage = (CircularImageView) view.findViewById(R.id.profile_image);
        this.mImageView = (ImageView) view.findViewById(R.id.image);
        this.mShare = (TextView) view.findViewById(R.id.share);
    }
}