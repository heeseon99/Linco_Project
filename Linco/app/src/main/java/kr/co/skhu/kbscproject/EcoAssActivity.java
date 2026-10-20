/*환경 관련 정보 _ 환경 단체 _ activity*/
package kr.co.skhu.kbscproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import kr.co.skhu.kbscproject.AssAdapter;

public class EcoAssActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listview ;
        AssAdapter adapter;
        TextView textView1;
        TextView textView2;

        adapter = new AssAdapter() ;
        textView1 = (TextView) findViewById(R.id.menuTitle1);
        textView1.setText("환경단체");

        textView2 = (TextView) findViewById(R.id.menuTitle2);
        textView2.setText("환경운동 관련 단체");

        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.avaaz
                ),
                "Avaaz", "- https://secure.avaaz.org/page/kr/",
                "- 2007년에 만들어진 비정부 기구로      \n  멸종 위기 동물, 지구 온난화, 인권 등\n  " +
                        "여러 문제에 대한 서명 운동을 하는 단체", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.greenpeace),
                "Greenpeace", "- https://www.greenpeace.org/korea/",
                "- 1971년에 창립된 국제 환경 단체로    \n  북극 보호, 불법 어업 근절 등의 환경 캠페인\n  수행", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.greenass),
                "녹색 연합", "- https://www.greenkorea.org/introduce/greenkorea/",
                "- 1991년 창립된 단체로 백두대간과     \n  DMZ 보전, 야생동물 서식지 보호 등의\n  환경 운동을 진행", R.color.lightYellow) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.wwf),
                "WWF(세계 자연 기금)", "- https://www.wwfkorea.or.kr/",
                "- 1961년 설립된 세계 최대 비영리       \n  자연보전기관으로 멸종 동물 보호,\n  Earth Hour 캠페인 등 진행", R.color.lightGreen) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.ecoass),
                "환경운동연합", "- http://kfem.or.kr/",
                "- 1993년 창립된 단체로 1993년 4월 2일\n  전국에 있던 8개의 환경 단체가 연합하여\n  생긴 단체", R.color.lightBlue) ;
    }
}