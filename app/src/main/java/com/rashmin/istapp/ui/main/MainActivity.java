package com.rashmin.istapp.ui.main;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.DialogInterface;
import android.os.Bundle;

import com.rashmin.istapp.R;
import com.rashmin.istapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);


    }

    @Override
    public void onBackPressed() {



        AlertDialog.Builder mbuilder = new AlertDialog.Builder(this);

        mbuilder.setTitle("Exit");
        mbuilder.setMessage("Are you sure?");
        mbuilder.setCancelable(true);

        mbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        mbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });


        AlertDialog alertDialog = mbuilder.create();
        alertDialog.show();
    }
}
