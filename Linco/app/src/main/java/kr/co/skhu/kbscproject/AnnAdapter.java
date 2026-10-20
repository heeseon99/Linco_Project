/*환경 관련 정보 _ 기념일 정보 정보 _ Adapter*/
package kr.co.skhu.kbscproject;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.LauncherActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Calendar;

public class AnnAdapter extends BaseAdapter {
    private ArrayList<AnnItem> AnnItemList = new ArrayList<AnnItem>();

    public AnnAdapter() {
    }

    @Override
    public int getCount() {
        return AnnItemList.size();
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
        ImageView iconImageView = (ImageView) convertView.findViewById(R.id.main_img);
        TextView titleTextView = (TextView) convertView.findViewById(R.id.main_content1);
        TextView dateTextView = (TextView) convertView.findViewById(R.id.main_content2);
        TextView contentTextView = (TextView) convertView.findViewById(R.id.main_content3);
        LinearLayout clickBtn = (LinearLayout) convertView.findViewById(R.id.clickTest);
        LinearLayout background = (LinearLayout) convertView.findViewById(R.id.test);

        AnnItem listViewItem = AnnItemList.get(position);

        //리스트뷰의 아이템에 값을 넣어줌
        iconImageView.setImageDrawable(listViewItem.getIcon());
        titleTextView.setText(listViewItem.getTitle());
        dateTextView.setText(listViewItem.getDate());
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
            detail1.setText("기념일");
            TextView detail2 = (TextView) test.findViewById(R.id.detail_text3);
            detail2.setText("날짜");
            TextView detail3 = (TextView) test.findViewById(R.id.detail_text2);
            detail3.setText("기념일 소개");

            //상세정보 표시하는 다이얼로그의 각 소제목에 대한 내용을 지정
            TextView content1 = (TextView) test.findViewById(R.id.detail_content1);
            content1.setText(titleTextView.getText());
            TextView content2 = (TextView) test.findViewById(R.id.detail_content2);
            content2.setText(dateTextView.getText());
            TextView content3 = (TextView) test.findViewById(R.id.detail_content3);
            content3.setText(contentTextView.getText());

            //다이얼로그를 닫는 버튼
            Button closeBtn = (Button) test.findViewById(R.id.closeBtn);

            //다이얼로그 닫는 기능 구현
            closeBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // 커스텀 다이얼로그를 종료한다.
                    test.dismiss();
                }
            });
        });
           

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public Object getItem(int position) {
        return AnnItemList.get(position);
    }

    //아이템 데이터 추가
    public void addItem(Drawable icon, String title, String date, String content, int color) {
        AnnItem item = new AnnItem();

        item.setIcon(icon);
        item.setTitle(title);
        item.setDate(date);
        item.setContent(content);
        item.setColor(color);

        AnnItemList.add(item);
    }
}