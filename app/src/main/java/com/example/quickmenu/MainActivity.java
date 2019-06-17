package com.example.quickmenu;

import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goChelner(View view){
        Intent intent = new Intent(this, Chelner.class);
        intent.putExtra(EXTRA_MESSAGE, "chelner");
        startActivity(intent);
    }
    public void goAplicatie(View view){
        Intent intent = new Intent(this, Aplicatie.class);
        intent.putExtra(EXTRA_MESSAGE, "aplicatie");
        startActivity(intent);
    }
    public void goAdminPage(View view){
        Intent intent = new Intent(this, AdminPage.class);
        intent.putExtra(EXTRA_MESSAGE, "adminpage");
        startActivity(intent);
    }

}
