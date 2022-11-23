package com.example.baiktra2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res_detail);

        Bundle bundle = getIntent().getExtras();

        Medicine tree = (Medicine) bundle.get("object_user");
        TextView name = findViewById(R.id.tvName);
        name.setText(tree.getName());

        TextView scienceName = findViewById(R.id.tvScienceName);
        scienceName.setText(tree.getScienceName());

        TextView nature = findViewById(R.id.tvNature);
        nature.setText(tree.getNature());

        TextView leafColor = findViewById(R.id.tvLeafColor);
        leafColor.setText(tree.getUses());
    }
}