package com.example.reclerviewexample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.MyModel;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>
{
    Context applicationContext;
    ArrayList<MyModel> arrayList;

    public MyAdapter(Context applicationContext, ArrayList<MyModel> arrayList) {
        this.applicationContext=applicationContext;
        this.arrayList=arrayList;

    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view=inflater.inflate(R.layout.row, viewGroup, false);
        MyHolder myHolder=new MyHolder(view);



        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder viewHolder, int position) {
      MyModel myModel= arrayList.get(position);
      viewHolder.textView.setText(myModel.getMaintitle());
     viewHolder.imageView.setImageResource(myModel.getImages());


    }
    class MyHolder extends RecyclerView.ViewHolder


    {
        public TextView textView;
         public ImageView imageView;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
           textView=itemView.findViewById(R.id.textview);
           imageView=itemView.findViewById(R.id.imageview);
        }
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}