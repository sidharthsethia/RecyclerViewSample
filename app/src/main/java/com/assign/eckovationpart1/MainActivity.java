package com.assign.eckovationpart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected RecyclerView mRecyclerView;
    private CustomAdapter adapter;
    ArrayList<Element> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        list = new ArrayList<>();

        assignList();

        adapter = new CustomAdapter(MainActivity.this,list);
        mRecyclerView.setAdapter(adapter);


    }

    private void assignList() {
        Element obj = new Element();
        obj.comments = getString(R.string.comments);
        obj.likes = getString(R.string.likes);
        obj.time = getString(R.string.time);
        obj.title = getString(R.string.title);
        obj.desc = getString(R.string.desc);
        obj.profile = getResources().getDrawable(R.mipmap.sid);
        obj.image = getResources().getDrawable(R.mipmap.image);
        obj.views = getString(R.string.views);

        Element obj2 = new Element();
        obj2.comments = getString(R.string.comments);
        obj2.likes = getString(R.string.likes);
        obj2.time = getString(R.string.time);
        obj2.title = getString(R.string.title2);
        obj2.desc = getString(R.string.desc);
        obj2.profile = getResources().getDrawable(R.mipmap.user2);
        obj2.image = getResources().getDrawable(R.mipmap.image2);
        obj2.views = getString(R.string.views);

        Element obj3 = new Element();
        obj3.comments = getString(R.string.comments);
        obj3.likes = getString(R.string.likes);
        obj3.time = getString(R.string.time);
        obj3.title = getString(R.string.title3);
        obj3.desc = getString(R.string.desc);
        obj3.profile = getResources().getDrawable(R.mipmap.user3);
        obj3.image = getResources().getDrawable(R.mipmap.image3);
        obj3.views = getString(R.string.views);

        Element obj4 = new Element();
        obj4.comments = getString(R.string.comments);
        obj4.likes = getString(R.string.likes);
        obj4.time = getString(R.string.time);
        obj4.title = getString(R.string.title4);
        obj4.desc = getString(R.string.desc);
        obj4.profile = getResources().getDrawable(R.mipmap.user3);
        obj4.image = getResources().getDrawable(R.mipmap.image3);
        obj4.views = getString(R.string.views);

        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        list.add(obj);
        list.add(obj2);
        list.add(obj3);

        list.add(obj4);
    }
}
