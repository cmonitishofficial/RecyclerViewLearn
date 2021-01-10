package com.example.recyclerviewbynirala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewbynirala.Adapters.RecipeAdapter;
import com.example.recyclerviewbynirala.Models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.food,"Burger"));
        list.add(new RecipeModel(R.drawable.food1,"Burger"));
        list.add(new RecipeModel(R.drawable.food2,"Burger"));
        list.add(new RecipeModel(R.drawable.food3,"Burger"));
        list.add(new RecipeModel(R.drawable.food4,"Burger"));
        list.add(new RecipeModel(R.drawable.food5,"Burger"));
        list.add(new RecipeModel(R.drawable.food6,"Burger"));
        list.add(new RecipeModel(R.drawable.food7,"Burger"));
        list.add(new RecipeModel(R.drawable.food8,"Burger"));
//        list.add(new RecipeModel(R.drawable.food9,"Burger"));

        RecipeAdapter adapter = new RecipeAdapter(list,this);
        recyclerView.setAdapter(adapter);
    }
}