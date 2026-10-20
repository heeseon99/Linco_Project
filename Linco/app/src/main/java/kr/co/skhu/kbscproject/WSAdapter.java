/*분리수거 정보 _ Adapter*/
package kr.co.skhu.kbscproject;

import static kr.co.skhu.kbscproject.R.color.black;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WSAdapter extends BaseAdapter {
    private ArrayList<WSItem> WSItemList = new ArrayList<WSItem>() ;

    public WSAdapter() {

    }

    @Override
    public int getCount() {
        return WSItemList.size() ;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final int pos = position;
        final Context context = parent.getContext();

        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.activity_listview_item, parent, false);
        }

        //내용을 채울 부분의 주소(레이아웃)를 읽어 옴
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.main_img) ;
        TextView titleTextView = (TextView) convertView.findViewById(R.id.main_content1) ;
        TextView productTextView = (TextView) convertView.findViewById(R.id.main_content2) ;
        TextView contentTextView = (TextView) convertView.findViewById(R.id.main_content3) ;
        LinearLayout clickBtn = (LinearLayout) convertView.findViewById(R.id.clickTest);
        LinearLayout background = (LinearLayout) convertView.findViewById(R.id.test);

        WSItem listViewItem = WSItemList.get(position);

        //리스트뷰의 아이템에 값을 넣어줌
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        productTextView.setText(listViewItem.getProduct());
        contentTextView.setText(listViewItem.getContent());
        background.setBackgroundResource(listViewItem.getColor());

        //리스트뷰의 각 item 클릭 시 분리수거에 대한 상세 정보 표시
        clickBtn.setOnClickListener(view -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
            builder.setView(R.layout.activity_detail_dialog);
            AlertDialog test = builder.create();
            test.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
            test.show();

            //상세정보 표시하는 다이얼로그의 소제목 지정
            TextView detail1 = (TextView) test.findViewById(R.id.detail_text1);
            detail1.setText("종류");
            TextView detail2 = (TextView) test.findViewById(R.id.detail_text3);
            detail2.setText("품목");
            TextView detail3 = (TextView) test.findViewById(R.id.detail_text2);
            detail3.setText("배출 요령");

            //상세정보 표시하는 다이얼로그의 각 소제목에 대한 내용을 지정
            TextView content1 = (TextView) test.findViewById(R.id.detail_content1);
            content1.setText("- " + titleTextView.getText());
            TextView content2 = (TextView) test.findViewById(R.id.detail_content2);
            content2.setText(productTextView.getText());
            TextView content3 = (TextView) test.findViewById(R.id.detail_content3);
            content3.setText(contentTextView.getText());

            //다이얼로그를 닫는 버튼
            Button closeBtn = (Button) test.findViewById(R.id.closeBtn);

            //다이얼로그 닫는 기능 구현
            closeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    test.dismiss();
                }
            });
        });

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public Object getItem(int position) {
        return WSItemList.get(position) ;
    }

    //아이템 데이터 추가
    public void addItem(Drawable icon, String title, String product, String content, int color) {
        WSItem item = new WSItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setProduct(product);
        item.setContent(content);
        item.setColor(color);

        WSItemList.add(item);
    }
}