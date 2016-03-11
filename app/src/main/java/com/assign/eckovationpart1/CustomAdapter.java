package com.assign.eckovationpart1;

/**
 * Created by Sidharth on 10/02/16.
 */

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Toast;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {
    private List<Element> elementList;

    private Context mContext;
    private boolean click1 = true;

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
    public void onBindViewHolder(final CustomViewHolder customViewHolder, int i) {
        Element item = elementList.get(i);
        customViewHolder.element = item;
        customViewHolder.mTitle.setText(item.title);
        customViewHolder.mProfileImage.setImageDrawable(item.profile);
        customViewHolder.mImageView.setImageDrawable(item.image);
        customViewHolder.mDesc.setText(item.desc);
        customViewHolder.mLikes.setText(item.likes + " likes");
        customViewHolder.mComments.setText("Comments(" + item.comments + ")");
        customViewHolder.mTime.setText(item.time);
        customViewHolder.mViews.setText(item.views);

        customViewHolder.mLikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Like Button Pressed", Toast.LENGTH_LONG).show();
            }
        });

        customViewHolder.mShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Here is the share content body";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                mContext.startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });

        customViewHolder.mComments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(mContext);
                dialog.setCanceledOnTouchOutside(false);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.dialog);
                dialog.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });

        customViewHolder.mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (click1)
                {
                    customViewHolder.mDesc.setText("Image Clicked");
                    click1=false;
                }
                else
                {
                    customViewHolder.mDesc.setText(customViewHolder.element.desc);
                    click1=true;
                }

            }
        });
    }
    @Override
    public int getItemCount() {
        return (null != elementList ? elementList.size() : 0);
    }
}