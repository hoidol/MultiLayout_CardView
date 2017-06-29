package com.multi_cardview;

import android.graphics.drawable.Drawable;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class CardViewData_Layout1   {
    Drawable Image_Res_Value;

    String Title_Text_Value;
    String Cur_Price_Text_Value;
    String Pre_Price_Text_Value;

    public CardViewData_Layout1(Drawable Image_Res_Value, String Title_Text_Value, String Cur_Price_Text_Value, String Pre_Price_Text_Value){
        this.Image_Res_Value = Image_Res_Value;
        this.Title_Text_Value = Title_Text_Value;
        this.Cur_Price_Text_Value = Cur_Price_Text_Value;
        this.Pre_Price_Text_Value = Pre_Price_Text_Value;
    }

    public Drawable getImage_Res_Value() {
        return Image_Res_Value;
    }

    public void setImage_Res_Value(Drawable image_Res_Value) {
        Image_Res_Value = image_Res_Value;
    }

    public String getTitle_Text_Value() {
        return Title_Text_Value;
    }

    public void setTitle_Text_Value(String title_Text_Value) {
        Title_Text_Value = title_Text_Value;
    }

    public String getCur_Price_Text_Value() {
        return Cur_Price_Text_Value;
    }

    public void setCur_Price_Text_Value(String cur_Price_Text_Value) {
        Cur_Price_Text_Value = cur_Price_Text_Value;
    }

    public String getPre_Price_Text_Value() {
        return Pre_Price_Text_Value;
    }

    public void setPre_Price_Text_Value(String pre_Price_Text_Value) {
        Pre_Price_Text_Value = pre_Price_Text_Value;
    }
}
