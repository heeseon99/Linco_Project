package kr.co.skhu.kbscproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
//main Activity
//splash 화면 제외 App의 가장 첫 화면으로 메뉴 2개 존재
//인텐트를 이용해 각 image button 클릭 시 다른 activity로 넘어가게 함

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton Menu1 = findViewById(R.id.icon1);
        Menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WasteSortingActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Menu2 = findViewById(R.id.icon2);
        Menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, EcoMenuActivity.class);
                startActivity(intent);
            }
        });

    }
}