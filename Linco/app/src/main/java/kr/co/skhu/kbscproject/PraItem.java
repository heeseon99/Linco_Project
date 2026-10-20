/*환경 관련 정보 _ 환경 보호를 위한 실천 _ 데이터 클래스*/
package kr.co.skhu.kbscproject;

import android.graphics.drawable.Drawable;

public class PraItem {
    private Drawable iconDrawable ; //각 실천에 알맞는 img
    private String numStr ; //번호
    private String contentStr ; //실천 내용
    private int colorStr;   //리스트뷰 각 아이템의 백 그라운드 컬러

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setNum(String num) {
        numStr = num ;
    }
    public void setContent(String content) {
        contentStr = content ;
    }
    public void setColor(int color) {colorStr = color;}

    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getNum() {
        return this.numStr ;
    }
    public String getContent() {
        return this.contentStr ;
    }
    public int getColor() {return this.colorStr;}
}
