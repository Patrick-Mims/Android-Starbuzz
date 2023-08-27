package edu.sfsu.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import java.util.List;

import edu.sfsu.starbuzz.Services.DataService;
import edu.sfsu.starbuzz.Threads.ThreadIO;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    public void updateMainTextView(View view) {
        /*
        TextView tvMain = findViewById(R.id.tvMain);
        TextView tv = (TextView) view;
        tvMain.setText(tv.getText());
        */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // maybe use an api to populate this
        final ListView listView = findViewById(R.id.options);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view,
                                    int position,
                                    long id) {

                Intent intent = new Intent(MainActivity.this, Category.class);
                intent.putExtra(Category.INTENT_CATEGORY_ID, (int)id); // Pass extra data to the Category Activity

                try {
                    startActivity(intent);
                } catch(ActivityNotFoundException e) {
                    Log.i("ERROR", "ACTIVITY_NOT_FOUND_EXCEPTION");
                }

                updateMainTextView(view);
            }
        };

        listView.setOnItemClickListener(itemClickListener);

        /*
        threadIO.run();
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://www.google.com";
        */
        //Retrofit retrofit = new Retrofit.Builder();
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, DataService.class);
        intent.putExtra(DataService.EXTRA_MESSAGE, getResources().getString(R.string.response));
        startService(intent);
    }
}