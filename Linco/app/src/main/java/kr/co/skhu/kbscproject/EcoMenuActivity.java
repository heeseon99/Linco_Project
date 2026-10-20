package kr.co.skhu.kbscproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
//환경 관련 정보의 세부 메뉴
//intent를 이용하여 각 세부메뉴에 해당하는 image button 클릭 시 다른 activity로 이동하도록 구현

public class EcoMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco_menu);

        TextView textView1;
        TextView textView2;

        textView1 = (TextView) findViewById(R.id.menuTitle1);
        textView1.setText("환경 관련 정보");

        textView2 = (TextView) findViewById(R.id.menuTitle2);
        textView2.setText("환경과 관련된 다양한 정보를 알아보세요");

        ImageButton Menu2_1 = findViewById(R.id.icon3);
        Menu2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EcoMenuActivity.this, EcoAnnActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Menu2_2 = findViewById(R.id.icon4);
        Menu2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EcoMenuActivity.this, EcoAssActivity.class);
                startActivity(intent);
            }
        });

        ImageButton Menu2_3 = findViewById(R.id.icon5);
        Menu2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EcoMenuActivity.this, EcoPraActivity.class);
                startActivity(intent);
            }
        });
    }
}