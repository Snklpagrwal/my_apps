package com.snklp.yp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

public class MainActivity extends AppCompatActivity {
    private SearchView searchView;
    private Button button;
    private static int SPLASH_TIME_OUT =4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.category);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        // Get search view and modify it to our needs
        searchView = (SearchView) findViewById(R.id.search_view);
        searchView.setBackgroundColor(Color.LTGRAY);
        searchView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                searchView.onActionViewExpanded();
            }
        });
        int searchPlateId = searchView.getContext().getResources().getIdentifier("android:id/search_badge", null, null);
        View searchPlate = searchView.findViewById(searchPlateId);
        //View searchPlate = searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchPlate.setBackgroundResource(R.drawable.bg_white_rounded);

    }

    public void openActivity2() {
        Intent intent =new Intent(this, Activity_Category.class);
        startActivity(intent);

    }
}
