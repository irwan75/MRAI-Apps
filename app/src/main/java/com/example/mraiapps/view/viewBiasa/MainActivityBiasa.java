package com.example.mraiapps.view.viewBiasa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.mraiapps.R;
import com.example.mraiapps.controller.adapter.*;

public class MainActivityBiasa extends AppCompatActivity {

    private RecyclerView rvEvent;
    private rvAdapterBiasa adapterBiasa;
    Spinner spinBulan, spinTahun;

    String[] Bulan = {"Bulan","Januri","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
    String[] Tahun = {"Tahun","2020","2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_biasa);

        spinBulan = findViewById(R.id.spinBulan);
        spinTahun = findViewById(R.id.spinTahun);
        adapterBiasa = new rvAdapterBiasa(this);

        spinner_tahun_bulan();

        rvEvent = findViewById(R.id.rvEvent);
        if (rvEvent !=null){
            rvEvent.setAdapter(adapterBiasa);
            rvEvent.setHasFixedSize(true);
            rvEvent.setLayoutManager(new GridLayoutManager(this, 2));
        }

    }

    private void spinner_tahun_bulan(){
        ArrayAdapter<String> spinnerBulanArrayAdapter = new ArrayAdapter<String>(this, R.layout.text_view_spinner, Bulan);
        ArrayAdapter<String> spinnerTahunArrayAdapter = new ArrayAdapter<String>(this, R.layout.text_view_spinner, Tahun);
        spinnerBulanArrayAdapter.setDropDownViewResource(R.layout.text_view_spinner);
        spinnerTahunArrayAdapter.setDropDownViewResource(R.layout.text_view_spinner);
        spinBulan.setAdapter(spinnerBulanArrayAdapter);
        spinTahun.setAdapter(spinnerTahunArrayAdapter);
    }
}
