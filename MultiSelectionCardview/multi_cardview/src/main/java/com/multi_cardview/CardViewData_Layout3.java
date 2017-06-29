package com.multi_cardview;

import android.graphics.drawable.Drawable;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class CardViewData_Layout3 {

    Drawable UserInf_Image_Res_Value;
    String CardView_Title_Text_Value;
    String CardView_Sub_Title_Text_Value;

    Drawable Image_Res_Value;
    String CardView_Content_Text_Value;

    public CardViewData_Layout3(Drawable UserInf_Image_Res_Value, String CardView_Title_Text_Value, String CardView_Sub_Title_Text_Value,  Drawable Image_Res_Value, String CardView_Content_Text_Value){
        this.UserInf_Image_Res_Value = UserInf_Image_Res_Value;
        this.CardView_Title_Text_Value = CardView_Title_Text_Value;
        this.CardView_Sub_Title_Text_Value = CardView_Sub_Title_Text_Value;
        this.Image_Res_Value =Image_Res_Value;
        this.CardView_Content_Text_Value = CardView_Content_Text_Value;
    }

    public Drawable getUserInf_Image_Res_Value() {
        return UserInf_Image_Res_Value;
    }

    public void setUserInf_Image_Res_Value(Drawable userInf_Image_Res_Value) {
        UserInf_Image_Res_Value = userInf_Image_Res_Value;
    }


    public String getCardView_Title_Text_Value() {
        return CardView_Title_Text_Value;
    }

    public void setCardView_Title_Text_Value(String cardView_Title_Text_Value) {
        CardView_Title_Text_Value = cardView_Title_Text_Value;
    }

    public String getCardView_Sub_Title_Text_Value() {
        return CardView_Sub_Title_Text_Value;
    }

    public void setCardView_Sub_Title_Text_Value(String cardView_Sub_Title_Text_Value) {
        CardView_Sub_Title_Text_Value = cardView_Sub_Title_Text_Value;
    }

    public Drawable getImage_Res_Value() {
        return Image_Res_Value;
    }

    public void setImage_Res_Value(Drawable image_Res_Value) {
        Image_Res_Value = image_Res_Value;
    }

    public String getCardView_Content_Text_Value() {
        return CardView_Content_Text_Value;
    }

    public void setCardView_Content_Text_Value(String cardView_Content_Text_Value) {
        CardView_Content_Text_Value = cardView_Content_Text_Value;
    }
}
