package com.example.circleanimation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;

public class MainActivity extends AppCompatActivity {

    CircleMenu crcl;
    ConstraintLayout cl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crcl = findViewById(R.id.crcl);
        cl = findViewById(R.id.cl);

        crcl.setMainMenu(Color.parseColor("#000000"),R.drawable.menu,R.drawable.cancel)
                .addSubMenu(Color.parseColor("#ff4032"),R.drawable.person)
                .addSubMenu(Color.parseColor("#2f2f2f"),R.drawable.notification)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {
                    @Override
                    public void onMenuSelected(int index) {
                        switch (index){
                            case 0:
                                Intent intent = new Intent(MainActivity.this,signin.class);
                                startActivity(intent);
                                break;
                            case 1:
                                Intent inte = new Intent(MainActivity.this,noti.class);
                                startActivity(inte);
                                break;

                        }
                    }
                });
    }
}