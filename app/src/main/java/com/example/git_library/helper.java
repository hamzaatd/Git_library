package com.example.git_library;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class helper {
    Context context;

    helper(Context context){

       this.context=context;

    }


    public  void show(){

        Toast.makeText(context, "hello world", Toast.LENGTH_SHORT).show();



    }





}
