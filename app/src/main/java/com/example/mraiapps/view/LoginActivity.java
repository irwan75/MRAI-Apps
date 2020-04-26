package com.example.mraiapps.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.example.mraiapps.R;
import com.example.mraiapps.view.viewBiasa.MainActivityBiasa;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnLogin:
                startActivity(new Intent(LoginActivity.this, MainActivityBiasa.class));
                break;
        }
    }

//    public void select(String kondisi) {
//        //koneksi ke file read_all.php, jika menggunakan localhost gunakan ip sesuai dengan ip kamu
//        AndroidNetworking.get("http://192.168.100.13/crud_fan/read_all.php")
//                .setPriority(Priority.LOW)
//                .build()
//                .getAsJSONArray(new JSONArrayRequestListener() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        Log.d("Android", "onResponse: " + response); //untuk log pada onresponse
//                        // do anything with response
//                        {
//                            //mengambil data dari JSON array pada read_all.php
//                            try {
//                                for (int i = 0; i < response.length(); i++) {
//                                    JSONObject data = response.getJSONObject(i);
//                                    //adding the product to product list
//                                    dataMahasiswa.add(new DataMahasiswa(
//                                            data.getInt("id_mahasiswa"), //"name:/String" diisi sesuai dengan yang di JSON pada read_all.php
//                                            data.getString("nama_mahasiswa"), //"name:/String" diisi sesuai dengan yang di JSON pada read_all.php
//                                            data.getString("nim_mahasiswa"), //"name:/String" diisi sesuai dengan yang di JSON pada read_all.php
//                                            data.getString("kelas_mahasiswa") //"name:/String" diisi sesuai dengan yang di JSON pada read_all.php
//                                    ));
//                                }
//                                //men inisialisasi adapter RecyclerView yang sudah kita buat sebelumnya
//                                ListMahasiswaAdapter adapter = new ListMahasiswaAdapter(ReadAllActivity.this, dataMahasiswa);
//                                recyclerView.setAdapter(adapter); //menset adapter yang akan digunakan pada recyclerView
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void onError(ANError error) {
//                        Log.d("Android", "onError: " + error); //untuk log pada onerror
//                        // handle error
//                    }
//                });
//    }

}
