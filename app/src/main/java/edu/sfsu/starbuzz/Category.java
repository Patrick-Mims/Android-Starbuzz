package edu.sfsu.starbuzz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import edu.sfsu.starbuzz.Models.ProductModel;

public class Category extends AppCompatActivity {

    public static List<ProductModel> populateModel() {
        List<ProductModel> pm = new ArrayList<>();

        pm.add(new ProductModel(100, "Sweet and flavorful", "Blueberry Soda"));
        pm.add(new ProductModel(100, "Sweet and Sour", "Strawberry Soda"));
        pm.add(new ProductModel(200, "A hearty beverage.", "Root Beer"));
        pm.add(new ProductModel(300, "A Cool Summer Breeze.", "Coconut Water"));
        pm.add(new ProductModel(400, "A Blast of cold air", "Ginger Beer"));
        pm.add(new ProductModel(500, "Sweet and blue", "Grape Soda"));
        pm.add(new ProductModel(600, "A hearty beverage.", "Root Beer"));
        pm.add(new ProductModel(700, "A Cool Summer Breeze.", "Coconut Water"));
        pm.add(new ProductModel(800, "A Blast of cold air", "Ginger Beer"));
        pm.add(new ProductModel(900, "Bold and beautiful", "Beauty Soda"));

        return pm;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        List<ProductModel> productModel = populateModel();

        ArrayAdapter<ProductModel> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productModel);

        Log.i("LIST => ", productModel.get(0).getName());

        ListView listView = findViewById(R.id.category_list);
        listView.setAdapter(listAdapter);

        /* * * */

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Category.this, Detail.class);
                //intent.putExtra(Detail.EXTRA_DRINKID, (int)l);
                //startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}