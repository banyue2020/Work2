package com.example.work2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ItemActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        textView = findViewById(R.id.itemtextView2);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ItemActivity.this,resulteActivity.class);
                test.launch(intent);


            }
        });
    }

        public ActivityResultLauncher test;
        {
            test = registerForActivityResult(
                    new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {

                        @Override
                        public void onActivityResult(ActivityResult result) {
                            if (result.getResultCode() == 888) {
                                Log.d("fwj", "onActivityResultLauncher...");
                                textView.setText(result.getData().getStringExtra("data"));
                            }
                        }
                    });
        }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d("fwj", "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("fwj", "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("fwj", "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("fwj", "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("fwj", "onResume: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("fwj", "onRestart: ");
    }
}