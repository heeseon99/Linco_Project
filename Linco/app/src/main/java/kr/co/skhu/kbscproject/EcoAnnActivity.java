/*환경 관련 정보_기념일 정보 _ Activity*/
package kr.co.skhu.kbscproject;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.List;

public class EcoAnnActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listview ;
        AnnAdapter adapter;
        TextView textView1;
        TextView textView2;

        adapter = new AnnAdapter() ;

        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        textView1 = (TextView) findViewById(R.id.menuTitle1);
        textView1.setText("기념일");
        textView2 = (TextView) findViewById(R.id.menuTitle2);
        textView2.setText("환경과 관련된 기념일");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.wetland),
                "세계 습지의 날", "- 2월 2일",
                "- 국제 습지 협약의 내용 및 습지의 가치와\n  중요성을 인식시키기 위하여 정한 날", R.color.lightRed);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.water),
                "세계 물의 날", "- 3월 2일",
                "- 심각해지는 물 부족 문제와 수질 오염을\n  방지하고 물의 소중함을 되새기기 위해서\n" +
                        "  UN이 제정 및 선포한 날", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.earth),
                "지구의 날", "- 4월 22일", "- 환경 오염 문제의 심각성을 알리기 위해\n" +
                        "  자연 보호자들이 제정한 날", R.color.lightYellow) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sea_plant),
                "바다 식목일", "- 5월 10일",
                "- 바다 속 생태계의 중요성과 황폐화의   \n  심각성을 국민에게 알리고 범국민적인\n  관심 속에서 " +
                        "바다 숲이 조성될 수 있도록\n  하기 위해서  지정된 날", R.color.lightGreen) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.environment),
                "세계 환경의 날", "- 6월 5일",
                "- 1972년 6월 스웨덴 스톡홀롬에서 열린 유엔\n  인간 환경 회의에서 국제 사회가 " +
                        "지구 환경\n  보전을 위해 공동 노력을 다짐하며 제정한\n  날", R.color.lightBlue) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.desertification),
                "세계 사막화 방지의 날", "- 6월 17일",
                "- 1994년 6월 17일, 프랑스 파리에서 채택된\n  사막화 방지 협약 채택일을 기념하기 위해\n  지정된 날", R.color.lightPurple) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.energy),
                "대한민국 에너지의 날", "- 8월 22일",
                "- 에너지의 중요성과 화석 연료의 과다한\n  사용으로 인한 지구 온난화 문제 등에 대한\n  " +
                        "인식을 제고시키고 전 국민이 에너지 절약에\n  동참하자는 취지에서 시작", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.sky),
                "푸른 하늘의 날", "- 9월 7일",
                "- 대기오염에 대한 경각심을 제고하는 한편,\n  오염 저감과 청정대기를 위한 노력과 국제적\n  " +
                        "협력을 강화하자는 취지로 지정된 날\n" +
                        "- 우리나라가 제한해 지정된 첫 유엔 공식\n  기념일", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ozone_layer),
                "세계 오존층 보호의 날", "- 9월 16일",
                "- 1994년 UN 총회에서 점차 파괴되어가는\n  오존층 보호를 위해 몬트리올 의정서\n  채택일을 " +
                        "세계 오존층 보호의 날로 지정", R.color.lightYellow) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.mountain),
                "산의 날", "- 10월 18일", "- UN이 지정한 세계 산의 해를 계기로 " +
                        "산림의\n  중요성을 국민에게 알리고 산과 자연을\n  사랑하는 마음을 일깨우기 위해 " +
                        "산림청이\n  제정한 날", R.color.lightGreen) ;
    }
}