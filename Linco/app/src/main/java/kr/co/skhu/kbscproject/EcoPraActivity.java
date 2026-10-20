/*환경 관련 정보 _ 환경 보호를 위한 실천 _ Activity
* */
package kr.co.skhu.kbscproject;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class EcoPraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        ListView listview ;
        PraAdapter adapter;
        TextView textView1;
        TextView textView2;

        adapter = new PraAdapter() ;

        listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);

        textView1 = (TextView) findViewById(R.id.menuTitle1);
        textView1.setText("생활수칙");

        textView2 = (TextView) findViewById(R.id.menuTitle2);
        textView2.setText("환경을 보호하는 생활 수칙");

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra1), "1",
                "과대 포장된 제품과 선물 세트의 구매를\n  피해주세요", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra2), "2",
                "화장지, 종이, 가구 등 목재 및 임산물\n  구매 시 FSC 인증 라벨을 확인해 주세요", R.color.lightOrange) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra3), "3",
                "빨대외 일회용 플라스틱 컵 사용을 지양해\n  주세요", R.color.lightYellow) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra4), "4",
                "풀치, 노가리, 총알 오징어 등 어린 생선을\n  구매하지 말아주세요", R.color.lightGreen) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra5), "5",
                "설거지 할 때 물을 받아서 설거지를 해\n  주세요", R.color.lightBlue) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra6), "6",
                "이동 시 자가용 대신 걷거나 대중교통을\n  이용해 주세요", R.color.lightPurple) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra7), "7",
                "음식 구매 시 일회용기 대신 다회용기를\n  이용해 포장 해 주세요", R.color.lightRed) ;

        adapter.addItem(ContextCompat.getDrawable(this, R.drawable.pra8), "8",
                "장을 볼 때에는 비닐 봉시를 구매하지 말고\n  장바구니를 이용해 주세세요", R.color.lightOrange) ;
    }
}