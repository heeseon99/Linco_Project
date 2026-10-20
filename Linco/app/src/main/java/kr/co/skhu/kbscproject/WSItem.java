/*분리수거 정보 _ 데이터 클래스*/
package kr.co.skhu.kbscproject;

import android.graphics.drawable.Drawable;

public class WSItem {
    private Drawable iconDrawable ; //분류에 맞는 image
    private String titleStr ;   //분류
    private String productStr ; //각 분류에 해당하는 품목
    private String contentStr ; //분리수거 하는 방법
    private int colorStr;   //리스트뷰의 각 아이템의 backgrond color

    public void setIcon(Drawable icon) {
        iconDrawable = icon ;
    }
    public void setTitle(String title) {
        titleStr = title ;
    }
    public void setProduct(String product) {
        productStr = product ;
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
    public String getProduct() {
        return this.productStr ;
    }
    public String getContent() {
        return this.contentStr ;
    }
    public int getColor() {return this.colorStr;}
}
