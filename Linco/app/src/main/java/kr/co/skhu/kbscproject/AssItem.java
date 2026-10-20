/*환경 관련 정보 _ 환경 단체 _ 데이터 클래스*/
package kr.co.skhu.kbscproject;

import android.graphics.drawable.Drawable;

public class AssItem {
    private Drawable iconDrawable ; //단체 로고
    private String titleStr ;   //단체명
    private String urlStr ; //단체 홈페이지
    private String contentStr ; //단체 소개
    private int colorStr;   //리스트뷰 아이템 백그라운드 색

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setUrl(String url) {
        urlStr = url ;
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
    public String getUrl() {
        return this.urlStr ;
    }
    public String getContent() {
        return this.contentStr ;
    }
    public int getColor() {return this.colorStr;}
}
