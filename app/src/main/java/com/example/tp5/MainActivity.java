package com.example.tp5;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import kotlin.jvm.internal.MagicApiIntrinsics;

public class MainActivity extends AppCompatActivity {

    private ListView categoryListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            categoryListView = findViewById(R.id.categoryList);

            // Exemple de catégories
            final String[] categories = {"Sandwichs", "Pizzas", "Desserts", "Boissons"};

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categories);
            categoryListView.setAdapter(adapter);

            categoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    String selectedCategory = categories[i];

                    // Démarrer l'activité correspondante en fonction de la catégorie sélectionnée
                    if (selectedCategory.equals("Sandwichs")) {
                        Intent intent = new Intent(MainActivity.this, sandwishs.class);
                        startActivity(intent);
                    } else if (selectedCategory.equals("Pizzas")) {
                        Intent intent = new Intent(MainActivity.this, pizzas.class);
                        startActivity(intent);
                    } else if (selectedCategory.equals("Desserts")) {
                        // Ajoutez ici le code pour l'activité des desserts
                    } else if (selectedCategory.equals("Boissons")) {
                        // Ajoutez ici le code pour l'activité des boissons
                    }
                }
            });
        }
    }
