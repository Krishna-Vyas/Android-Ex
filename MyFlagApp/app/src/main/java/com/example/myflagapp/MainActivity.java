package com.example.myflagapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> images;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=(ListView)findViewById(R.id.imageLV);

        HashMap<String,Integer> list= new HashMap<String, Integer>();

        //images =  new ArrayList<Integer>();
        list.put("Argentina",R.mipmap.argentina);
        list.put("Australia",R.mipmap.australia);
        list.put("Brazil",R.mipmap.brazil);
        list.put("China",R.mipmap.china);
        list.put("European-Union",R.mipmap.europeanunion);
        list.put("Germany",R.mipmap.germany);
        list.put("Greece",R.mipmap.greece);
        list.put("India",R.mipmap.india);
        list.put("Israel",R.mipmap.israel);
        list.put("Malaysia",R.mipmap.malaysia);
        list.put("Mexico",R.mipmap.mexico);
        list.put("Philippines",R.mipmap.philippines);
        list.put("Portugal",R.mipmap.portugal);
        list.put("Singapore",R.mipmap.singapore);
        list.put("Spain",R.mipmap.spain);
        list.put("Sweden",R.mipmap.sweden);
        list.put("Taiwan",R.mipmap.taiwan);
        list.put("Turkey",R.mipmap.turkey);
        list.put("United-Kingdom",R.mipmap.unitedkingdom);
        list.put("United-States",R.mipmap.unitedstates);
        list.put("Zimbabwe",R.mipmap.zimbabwe);

        CustomAdapter adapter = new CustomAdapter(this,list);

        lv.setAdapter(adapter);
        //lv.setOnItemClickListener(this);
    }
}
