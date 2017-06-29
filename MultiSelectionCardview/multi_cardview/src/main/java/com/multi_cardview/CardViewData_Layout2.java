package com.multi_cardview;

import android.graphics.drawable.Drawable;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class CardViewData_Layout2 {

    Drawable UserInf_Image_Res_Value;
    String UserInf_ID_Text_Value;
    String UserInf_Tag_Text_Value;
    String UserInf_Time_Text_Value;
    String UserInf_Location_Text_Value;

    Drawable Image_Res_Value;
    String UserInf_Content_Text_Value;

    public CardViewData_Layout2(Drawable UserInf_Image_Res_Value, String UserInf_ID_Text_Value, String UserInf_Tag_Text_Value, String UserInf_Time_Text_Value, String UserInf_Location_Text_Value, Drawable Image_Res_Value, String UserInf_Content_Text_Value){
        this.UserInf_Image_Res_Value = UserInf_Image_Res_Value;
        this.UserInf_ID_Text_Value = UserInf_ID_Text_Value;
        this.UserInf_Tag_Text_Value = UserInf_Tag_Text_Value;
        this.UserInf_Time_Text_Value = UserInf_Time_Text_Value;
        this.UserInf_Location_Text_Value = UserInf_Location_Text_Value;
        this.Image_Res_Value =Image_Res_Value;
        this.UserInf_Content_Text_Value = UserInf_Content_Text_Value;
    }

    public Drawable getUserInf_Image_Res_Value() {
        return UserInf_Image_Res_Value;
    }

    public void setUserInf_Image_Res_Value(Drawable userInf_Image_Res_Value) {
        UserInf_Image_Res_Value = userInf_Image_Res_Value;
    }

    public String getUserInf_ID_Text_Value() {
        return UserInf_ID_Text_Value;
    }

    public void setUserInf_ID_Text_Value(String userInf_ID_Text_Value) {
        UserInf_ID_Text_Value = userInf_ID_Text_Value;
    }

    public String getUserInf_Tag_Text_Value() {
        return UserInf_Tag_Text_Value;
    }

    public void setUserInf_Tag_Text_Value(String userInf_Tag_Text_Value) {
        UserInf_Tag_Text_Value = userInf_Tag_Text_Value;
    }

    public String getUserInf_Time_Text_Value() {
        return UserInf_Time_Text_Value;
    }

    public void setUserInf_Time_Text_Value(String userInf_Time_Text_Value) {
        UserInf_Time_Text_Value = userInf_Time_Text_Value;
    }

    public String getUserInf_Location_Text_Value() {
        return UserInf_Location_Text_Value;
    }

    public void setUserInf_Location_Text_Value(String userInf_Location_Text_Value) {
        UserInf_Location_Text_Value = userInf_Location_Text_Value;
    }

    public Drawable getImage_Res_Value() {
        return Image_Res_Value;
    }

    public void setImage_Res_Value(Drawable image_Res_Value) {
        Image_Res_Value = image_Res_Value;
    }

    public String getUserInf_Content_Text_Value() {
        return UserInf_Content_Text_Value;
    }

    public void setUserInf_Content_Text_Value(String userInf_Content_Text_Value) {
        UserInf_Content_Text_Value = userInf_Content_Text_Value;
    }
}
