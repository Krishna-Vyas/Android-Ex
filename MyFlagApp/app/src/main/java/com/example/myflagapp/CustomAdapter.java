package com.example.myflagapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jinal on 1/10/2018.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    Map<String,Integer> image;
    //Set<Map.Entry<String,Integer>> value;
    Object country[], id[];

    CustomAdapter(Context c, HashMap<String,Integer> image)
    {
        this.c=c;
        this.image=image;
        //value = image.entrySet();
        country= image.keySet().toArray();
        id= image.values().toArray();
    }
    @Override
    public int getCount() {
        return image.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View v;
        LayoutInflater in;
        in = LayoutInflater.from(c);
        v= in.inflate(R.layout.layout,null);

        ImageButton button = (ImageButton)v.findViewById(R.id.flagButton);
        TextView tv= (TextView)v.findViewById(R.id.flagTv);
        //entry = itr.next();
        //button.setImageResource((Integer) entry.getValue());
        button.setImageResource((Integer) id[position]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(c);
                //String country=String.valueOf(value.getValue());
                builder.setMessage("Country:  " +country[position].toString())
                        .setIcon((Integer) id[position])
                        .setCancelable(false)
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Toast.makeText(c,"You clicked yes",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                //  Action for 'NO' Button
                                dialog.cancel();
                            }
                        });

                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Country");
                alert.show();
            }
        });
        tv.setText("FLAG "+position);
        return v;
    }
}
