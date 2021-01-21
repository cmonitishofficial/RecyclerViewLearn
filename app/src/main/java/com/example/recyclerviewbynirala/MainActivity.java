    package com.example.recyclerviewbynirala;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.recyclerviewbynirala.Adapters.RecipeAdapter;
import com.example.recyclerviewbynirala.Classes.RecyclerItemClickListener;
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
//        VERTICAL RECYCLER VIEW AND LIST.
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        recyclerView.setLayoutManager(layoutManager);

//        HORIZONTAL RECYCLER VIEW AND LIST
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recyclerView.setLayoutManager(layoutManager);

//        Grid Layout manager
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this,ScrollingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Second Item clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Third Item clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this, "Fourth Item clicked.", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }
}