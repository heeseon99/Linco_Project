/*환경 관련 정보 _ 환경 보호를 위한 실천 _ Adapter*/
package kr.co.skhu.kbscproject;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class PraAdapter extends BaseAdapter {
    private ArrayList<PraItem> PraItemList = new ArrayList<PraItem>() ;

    public PraAdapter() {

    }

    @Override
    public int getCount() {
        return PraItemList.size() ;
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
        TextView contentTextView = (TextView) convertView.findViewById(R.id.main_content2) ;
        LinearLayout background = (LinearLayout) convertView.findViewById(R.id.test);

        //실천 부분의 경우 번호 표시 textView외에는 내용 표시하는 TextView가 하나만 있으므로
        //2번째 textView의 MaxLine을 타 메뉴와 달리 3줄로하고,
        // 마지막 textView의 textSize를 0으로, 패딩을 상하좌우 모드 0으로 함
        contentTextView.setMaxLines(3);
        TextView blankView = (TextView) convertView.findViewById(R.id.main_content3);
        blankView.setTextSize(0);
        blankView.setPadding(0, 0, 0, 0);

        PraItem listViewItem = PraItemList.get(position);

        //리스트뷰의 아이템에 값을 넣어줌
        iconImageView.setImageDrawable(listViewItem.getIcon());

        //No. + 번호의 형식으로 표시되도록
        String title = "No." + listViewItem.getNum().toString();
        titleTextView.setText(title);

        contentTextView.setText("- " + listViewItem.getContent());
        background.setBackgroundResource(listViewItem.getColor());

        return convertView;
    }

    @Override
    public long getItemId(int position) {
        return position ;
    }

    @Override
    public Object getItem(int position) {
        return PraItemList.get(position) ;
    }

    public void addItem(Drawable icon, String num, String content, int color) {
        PraItem item = new PraItem();

        item.setIcon(icon);
        item.setNum(num);
        item.setContent(content);
        item.setColor(color);

        PraItemList.add(item);
    }
}