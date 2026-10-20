/*환경 관련 정보 _ 기념일 정보 정보 _ 데이터 클래스*/
package kr.co.skhu.kbscproject;

import android.graphics.drawable.Drawable;

public class AnnItem {
    private Drawable iconDrawable ; //기념일에 맞는 image
    private String titleStr ;   //기념일명
    private String dateStr ;    //기념일 날짜
    private String contentStr ; //기념일 소개
    private int colorStr;   //리스트뷰의 각 아이템의 backgrond color

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setDate(String date) {
        dateStr = date ;
    }
    public void setContent(String content) {
        contentStr = content ;
    }
    public void setColor(int color) {colorStr = color;}


    public Drawable getIcon() {
        return this.iconDrawable ;
    }
    public String getTitle() {
        return this.titleStr ;
    }
    public String getDate() {
        return this.dateStr ;
    }
    public String getContent() {
        return this.contentStr ;
    }
    public int getColor() {return this.colorStr;}
}
