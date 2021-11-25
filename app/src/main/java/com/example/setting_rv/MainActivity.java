package com.example.setting_rv;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    List<settingItem>settingItemList;
    settingAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter= new settingAdapter(settingItemList);
        createSettingList();
       adapter.setOnImageClickListner(new settingAdapter.onItemClickListner() {
           @Override
           public void onItemClickListner(int position, settingItem item) {
               Toast.makeText(MainActivity.this,"click on image",Toast.LENGTH_LONG).show();
           }
       });
    }
    private void createSettingList() {
       settingItemList=new ArrayList<>();
        for(int i=0;i<1000;i++){
        settingItemList.add(new settingItem("wifi and settings","see wifi setting",R.drawable.wifi));
    }}
}