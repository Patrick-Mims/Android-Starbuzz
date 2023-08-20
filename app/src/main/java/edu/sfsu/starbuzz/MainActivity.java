package edu.sfsu.starbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import edu.sfsu.starbuzz.Models.ProductModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        List<ProductModel> productModel = new ArrayList<>();

        productModel.add(new ProductModel(1234, "A hearty beverage.", "Root Beer"));
        productModel.add(new ProductModel(4567, "A Cool Summer Breeze.", "Coconut Water"));
        productModel.add(new ProductModel(8901, "A Blast of cold air", "Ginger Beer"));
        */

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Log.i("POSITION", Integer.toString(position));

                if(position == 0) {
                    Intent intent = new Intent(MainActivity.this, Category.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = findViewById(R.id.options);
        listView.setOnItemClickListener(itemClickListener);
    }
}