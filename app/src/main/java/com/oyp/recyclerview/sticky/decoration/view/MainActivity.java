package com.oyp.recyclerview.sticky.decoration.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.oyp.recyclerview.sticky.decoration.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toSticky(View view) {
        startActivity(new Intent(this, StickyRecyclerViewActivity.class));
    }

    public void toPowerfulSticky(View view) {
        startActivity(new Intent(this, PowerfulStickyRecyclerViewActivity.class));
    }

    public void toPowerfulSticky2(View view) {
        startActivity(new Intent(this, BeautifulStickyRecyclerViewActivity.class));
    }
}
