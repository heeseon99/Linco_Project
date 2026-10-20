/*분리수거 정보 _ Activity*/
package kr.co.skhu.kbscproject;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class WasteSortingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listview ;
        WSAdapter adapter;
        TextView textView1;
        TextView textView2;

        adapter = new WSAdapter() ;

        textView1 = (TextView) findViewById(R.id.menuTitle1);
        textView1.setText("분리수거 방법");
        textView2 = (TextView) findViewById(R.id.menuTitle2);
        textView2.setText("환경을 보호하는 분리수거 방법");

        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.paper),
                "종이류", "- 신문지, 책자, 노트, 종이컵, 골판지 상자류\n" +
                        "- 비닐코팅된 종이, 비닐포장지는 제외\n",
                "- 스프링, 테이프, 철판 등을 제거 후 물기에 \n" +
                        "  젖지 않게 묶어서 배출", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pack),
                "종이팩", "", "- 내용물을 비우고 가급적 물에 헹군 뒤 \n" +
                        "  종이류와 혼합되지 않게 배출", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.bottle),
                "병류", "- 음료수병, 드링크류, 기타 병류\n" +
                        "- 내열식기, 거울, 도자기류 제외",
                "- 병뚜껑을 제거한 후 내용물을 비우고 배출\n" +
                        "- 담배꽁초 등 이물질을 넣지 말 것 \n" +
                        "- 빈용기보증금대상 유리병은 소매점에서\n" +
                        "  환불", R.color.lightYellow) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.can),
                "캔류", "- 알루미늄캠, 철 캔",
                "- 내용물을 비운 후 압착하여 배출             \n" +
                        "- 부탄 가스 등은 구멍을 뚫어 내용물을 제거\n" +
                        "  하고 플라스틱 뚜껑을 제거하고 배출", R.color.lightGreen) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.plastic_bottle),
                "투명 페트병", "- 무색 투명 페트병\n- 생수·음료 등)",
                "- 내용물은 비우고 라벨을 제거해 압축한 뒤\n" +
                        "  뚜껑을 닫아 전용 수거함에 배출", R.color.lightBlue) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.plastic),
                "플라스틱 류", "- PET·PVC·PE·PP·PS·PSP 재질의 용기와\n  포장재",
                "- 내용물을 비우고 뚜껑을 제거한 뒤 배출", R.color.lightPurple) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.box),
                "스티로폼", "- 전자제품 포장 완충제, 농·축·수산 포장재",
                "- 이물질과 부착 상표를 제거한 뒤 배출\n" +
                        "- 가전제품 포장 완충재는 가급적 제품 \n  구입처에 반납", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.packaging),
                "비닐 포장재", "- 과자, 음식료품류, 화장품, 세제, 의약품류\n  등 비닐포장재",
                "- 내용물을 비운 후 쌓아 묶어서 배출\n" +
                        "- 음식찌거기 등 이물질이 묻은 봉지류 제외", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.battery),
                "폐전지", "- 알칼리망간전지, 수은전지,산화은전지, \n  니켈·카드뮴전지, 리튬1차전지 등",
                "- 전용수거함에 배출하거나 판매소를 통하여\n" +
                        "  역회수 재활용품 배출시 구분 가능하도록 \n  하여 배출", R.color.lightYellow) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.fluorescent_light),
                "폐형광등", "- 직관형, 환형, 내장형,콤팩트형 기타 수은을\n  함유한 조명제품",
                "- 공동주택, 동행정복지센터 등에 마련된\n  수거함에 배출 깨어지지 않도록 재활용품 \n  배출 시 함께 배출", R.color.lightGreen) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.metal),
                "고철류", "- 고철, 비철금속",
                "- 이물질이 섞이지 않도록 한 후 봉투에 \n  넣거나  끈으로 묶어서 배출", R.color.lightBlue) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.clothes),
                "의류", "- 면섬유류, 기타의류",
                "- 물기에 젖지 않도록 마대에 담거나 묶어서 \n" +
                        "   배출\n" +
                        "- 민간 재활용 사업자 설치 수거함에 배출", R.color.lightPurple) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.oil),
                "폐식용류", "- 가정 배출 폐식용유",
                "- 찌거기와 빗물이 유입되지 않도록 주의하여\n  민간재활용 사업자 설치 수거함에 배출", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.electric_appliance),
                "대형폐가전제품", "- TV, 냉장고, 세탁기, 에어컨, 자동판매기,\n  러닝머신 등 1m 이상의 가전제품",
                "- 폐가전제품 무상방문 수거 제도를 이용해 \n  배출\n" +
                        "- 1599-0903 또는 www.15990903.or.kr", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.gadgets),
                "중소형 폐가전제품", "- 휴대폰, 카메라, MP3, PMP, 게임기,\n  전자사전, 믹서기, " +
                        "네비게이션, 스탠드,\n  헤어드라이기 등", "- 동행정복지센터 내 소형 가전 제품     \n  " +
                        "분리수거함에 배출하며 5개 이상 배출 시\n  폐가전제품 무상 방문 수거제도 이용", R.color.lightYellow) ;
    }
}