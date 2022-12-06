package com.example.customspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String[] countries = {"", "Brazil", "Britain", "Denmark", "Greece", "Israel", "Italy", "Niger"};
    String[] cities = {"", "Brasília", "London", "Copenhagen", "Athens", "Jerusalem", "Rome", "Niamey"};
    String[] population = {"", "214M", "67.33M", "5.857M", "10.66M", "9.364M", "59.07M", "25.13M"};
    int[] images = {0, R.drawable.brazil, R.drawable.britain, R.drawable.denmark, R.drawable.greece, R.drawable.israel, R.drawable.italy, R.drawable.niger};
    TextView tvCountry, tvCity, tvPopulation;
    Spinner spin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvCountry = findViewById(R.id.tv1);
        tvCity = findViewById(R.id.tv2);
        tvPopulation = findViewById(R.id.tv3);
        spin = findViewById(R.id.spinner);

        spin.setOnItemSelectedListener(this);

        CustomAdapter customadp = new CustomAdapter(getApplicationContext(), countries, cities, images);

        spin.setAdapter(customadp);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
    {
        tvCountry.setText(countries[i]);
        tvCity.setText(cities[i]);
        tvPopulation.setText(population[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView)
    {

    }
}