package edu.sfsu.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void updateMainTextView(View view) {
        TextView tvMain = findViewById(R.id.tvMain);
        TextView tv = (TextView) view;
        tvMain.setText(tv.getText());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = findViewById(R.id.options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position == 0) {
                    Log.i("POSI", Integer.toString(position));
                    //Intent intent = new Intent(edu.sfsu.starbuzz.MainActivity.this, edu.sfsu.starbuzz.Category.class);
                    Intent productIntent = new Intent(MainActivity.this, Category.class);
                    try {
                        startActivity(productIntent);
                    } catch(ActivityNotFoundException e) {
                        Log.i("ERROR", "ACTIVITY_NOT_FOUND_EXCEPTION");
                    }
                } else {
                    updateMainTextView(view);
                }
            }
        };

        listView.setOnItemClickListener(itemClickListener);
    }
}