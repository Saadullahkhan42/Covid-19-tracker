package com.example.covid_19tracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Countrydetails extends AppCompatActivity {

    private int positionCountry;
    TextView tvCountry, tvCases, tvTodayCases, tvRecovered, tvCritical, tvActive, tvTodayDeaths, tvTotalDeaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countrydetails);

        Intent intent = getIntent();
        positionCountry = intent.getIntExtra("position",0);

        getSupportActionBar().setTitle("Country details of "+ AffectedCountries.countryList.get(positionCountry).getCountry());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvCountry = findViewById(R.id.tvCountry);
        tvCases = findViewById(R.id.tvCases);
        tvTodayCases = findViewById(R.id.tvTodaycases);
        tvRecovered = findViewById(R.id.tvRecover);
        tvCritical = findViewById(R.id.tvCritical);
        tvActive = findViewById(R.id.tvActive);
        tvTodayDeaths = findViewById(R.id.tvTodaydeaths);
        tvTotalDeaths = findViewById(R.id.tvTotaldeaths);

        tvCountry.setText(AffectedCountries.countryList.get(positionCountry).getCountry());
        tvCases.setText(AffectedCountries.countryList.get(positionCountry).getCases());
        tvTodayCases.setText(AffectedCountries.countryList.get(positionCountry).getTodayCases());
        tvRecovered.setText(AffectedCountries.countryList.get(positionCountry).getRecovered());
        tvCritical.setText(AffectedCountries.countryList.get(positionCountry).getCritical());
        tvActive.setText(AffectedCountries.countryList.get(positionCountry).getActive());
        tvTodayDeaths.setText(AffectedCountries.countryList.get(positionCountry).getTodayDeaths());
        tvTotalDeaths.setText(AffectedCountries.countryList.get(positionCountry).getDeaths());
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home);
        finish();
        return super.onOptionsItemSelected(item);
    }
}