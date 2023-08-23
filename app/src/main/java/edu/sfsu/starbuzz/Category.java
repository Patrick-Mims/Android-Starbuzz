package edu.sfsu.starbuzz;

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
import edu.sfsu.starbuzz.Queue.ItemQueue;
import edu.sfsu.starbuzz.Stack.ItemStack;

/*
* Purpose
* A Category Activity displays the data for a single category.
* */

public class Category extends AppCompatActivity {
    public ArrayAdapter<ProductModel> listAdapter;

    public static void buildQueue(ItemQueue<ProductModel>model) {
       model = new ItemQueue<>();

       //model.enqueue("");
    }

    public static ItemStack<ProductModel> buildStack() {
        ItemStack<ProductModel> model = new ItemStack<>();

        model.push(new ProductModel(1324, "White Women", "Barbara"));
        model.push(new ProductModel(4354, "White Trans Women", "Sarah"));

        Log.i("STACK => ", model.pop().getName());

        return model;
    }

    public static List<ProductModel> createDataModel() {

        List<ProductModel> model = new ArrayList<>();

        model.add(new ProductModel(100, "Sweet and flavorful", "Blueberry Soda"));
        model.add(new ProductModel(200, "Sweet and Sour", "Strawberry Soda"));
        model.add(new ProductModel(300, "A hearty beverage.", "Ginger Root Beer"));
        model.add(new ProductModel(400, "A Cool Summer Breeze.", "Coconut Water"));
        model.add(new ProductModel(500, "Sweet and blue", "Grape Soda"));
        model.add(new ProductModel(600, "A hearty beverage", "Root Beer"));
        model.add(new ProductModel(700, "A Dry Winter Storm", "Keeping it real coconut water"));
        model.add(new ProductModel(800, "A Blast of cold air", "Sweet Ginger Beer"));
        model.add(new ProductModel(900, "Bold and beautiful", "SourBeauty Soda"));
        model.add(new ProductModel(1000, "A Blast of cold air", "Ginger Beer"));

        return model;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        List<ProductModel> model = createDataModel();

        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, model);

        ListView listView = findViewById(R.id.list_category);
        listView.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                Intent intent = new Intent(Category.this, Detail.class);
                intent.putExtra(Detail.EXTRA_DRINK_ID, (int)id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(itemClickListener);
    }
}