package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {
    GridView gidBanCo;
    AdapterGridViewCustom adapterGridView;
    ArrayList<clsTextView> listTextView;
    TextView txtCurrentPlayer;
    int totalOVuong=266,numberOfColumn=14,numberOfRow=totalOVuong/numberOfColumn,oDaDanh=0;//266
    int chessBoard[][]=new int[numberOfRow][numberOfColumn];
    int currentRow=-1,currentColumn=-1;
    Stack stack_O_Da_Danh=new Stack();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        addData();
    }

    private void addData()
    {
        for (int i=0;i<totalOVuong;i++)
            listTextView.add(new clsTextView("","#ff0000"));
        adapterGridView.notifyDataSetChanged();
    }

    private void init() {
        gidBanCo=(GridView)findViewById(R.id.gridBanCo);
        listTextView = new ArrayList<>();
        adapterGridView = new AdapterGridViewCustom(this,R.layout.o_caro,listTextView);
        gidBanCo.setAdapter(adapterGridView);
    }
}
