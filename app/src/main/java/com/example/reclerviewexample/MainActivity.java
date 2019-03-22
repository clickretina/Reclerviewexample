package com.example.reclerviewexample;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.MyModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.rv);
        ArrayList<MyModel> arrayList=new ArrayList<MyModel>();

        MyModel myModel=new MyModel("php",R.drawable.php);

        MyModel myModel1=new MyModel("Android",R.drawable.php);

        MyModel myModel2=new MyModel("python",R.drawable.php);

        MyModel myModel3=new MyModel("java",R.drawable.php);
        MyModel myModel4=new MyModel("machine learning",R.drawable.php);
        MyModel myModel5=new MyModel("java script",R.drawable.php);
        MyModel myModel6=new MyModel("Anular",R.drawable.php);
        MyModel myModel7=new MyModel("java",R.drawable.php);
        MyModel myModel8=new MyModel("machine learning",R.drawable.php);
        MyModel myModel9=new MyModel("java script",R.drawable.php);
        MyModel myMode20=new MyModel("Anular",R.drawable.php);

        arrayList.add(myModel);
        arrayList.add(myModel1);
        arrayList.add(myModel2);
        arrayList.add(myModel3);
        arrayList.add(myModel4);
        arrayList.add(myModel5);
        arrayList.add(myModel6);

        arrayList.add(myModel7);
        arrayList.add(myModel8);
        arrayList.add(myModel9);
        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),arrayList);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(myAdapter);














    }
}
