package com.multi_cardview;

import android.graphics.drawable.Drawable;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class CardViewData_Layout0 {
    Drawable Image_Res_Value;
    String Title_Text_Value;
    String Content_Text_Value;

    public CardViewData_Layout0(Drawable Image_Res_Value, String Title_Text_Value, String Content_Text_Value){
        this.Image_Res_Value = Image_Res_Value;
        this.Title_Text_Value = Title_Text_Value;
        this.Content_Text_Value = Content_Text_Value;
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

    public String getContent_Text_Value() {
        return Content_Text_Value;
    }

    public void setContent_Text_Value(String content_Text_Value) {
        Content_Text_Value = content_Text_Value;
    }
}
