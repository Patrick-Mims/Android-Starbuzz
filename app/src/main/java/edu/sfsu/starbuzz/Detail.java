package edu.sfsu.starbuzz;

import static edu.sfsu.starbuzz.Category.createDataModel;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Detail extends Activity {
    public static final String EXTRA_ID = "drinkId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        int id = (Integer) getIntent().getExtras().get(EXTRA_ID);

        TextView name = (TextView) findViewById(R.id.name);
        TextView desc = (TextView) findViewById(R.id.description);

        name.setText(createDataModel().get(id).getName());
        desc.setText(createDataModel().get(id).getDescription());

        /*
        List<ProductModel> pm = populateModel();
        TextView description = (TextView) findViewById(R.id.tvDescription);
        description.setText(pm.get(id).getDescription());
        */
    }
}