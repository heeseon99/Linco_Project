/*환경 관련 정보 _ 환경 단체 _ Adapter*/
package kr.co.skhu.kbscproject;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import kr.co.skhu.kbscproject.AssItem;

public class AssAdapter extends BaseAdapter {
    private ArrayList<AssItem> AssItemList = new ArrayList<AssItem>() ;

    public AssAdapter() {

    }

    @Override
    public int getCount() {
        return AssItemList.size() ;
    }

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
        TextView urlTextView = (TextView) convertView.findViewById(R.id.main_content2) ;
        TextView contentTextView = (TextView) convertView.findViewById(R.id.main_content3) ;
        LinearLayout clickBtn = (LinearLayout) convertView.findViewById(R.id.clickTest);
        LinearLayout background = (LinearLayout) convertView.findViewById(R.id.test);

        AssItem listViewItem = AssItemList.get(position);

        //리스트뷰의 아이템에 값을 넣어줌
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        urlTextView.setText(listViewItem.getUrl());
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
            detail1.setText("단체명");
            TextView detail2 = (TextView) test.findViewById(R.id.detail_text3);
            detail2.setText("url");
            TextView detail3 = (TextView) test.findViewById(R.id.detail_text2);
            detail3.setText("단체 소개");

            //상세정보 표시하는 다이얼로그의 각 소제목에 대한 내용을 지정
            TextView content1 = (TextView) test.findViewById(R.id.detail_content1);
            content1.setText("- " + titleTextView.getText());
            TextView content2 = (TextView) test.findViewById(R.id.detail_content2);
            content2.setText(urlTextView.getText());
            TextView content3 = (TextView) test.findViewById(R.id.detail_content3);
            content3.setText(contentTextView.getText());

            final SpannableString site = new SpannableString(
                    content2.getText().toString());
            Linkify.addLinks(site, Linkify.ALL);

            Button closeBtn = (Button) test.findViewById(R.id.closeBtn);

            //url 클릭 시 해당 웹 페이지로 이동
            content2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    content2.setMovementMethod(LinkMovementMethod.getInstance());
                }
            });
            // 커스텀 다이얼로그 종료
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
        return AssItemList.get(position) ;
    }

    public void addItem(Drawable icon, String title, String url, String content, int color) {
        AssItem item = new AssItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setUrl(url);
        item.setContent(content);
        item.setColor(color);

        AssItemList.add(item);
    }
}