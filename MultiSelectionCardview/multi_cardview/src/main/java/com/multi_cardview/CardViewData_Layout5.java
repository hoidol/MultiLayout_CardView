package com.multi_cardview;

import android.graphics.drawable.Drawable;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class CardViewData_Layout5 {

    int CardView_Link_Text_Value;
    Drawable User_Inf_Image_Res;
    String CardView_Title_Text_Value;

    String CardView_Tag1_Txt;
    String CardView_Tag2_Txt;
    String CardView_Tag3_Txt;


    public CardViewData_Layout5(int CardView_Link_Text_Value, Drawable User_Inf_Image_Res,String CardView_Title_Text_Value, String CardView_Tag1_Txt,String CardView_Tag2_Txt, String CardView_Tag3_Txt){
        this.CardView_Link_Text_Value = CardView_Link_Text_Value;
        this.User_Inf_Image_Res = User_Inf_Image_Res;
        this.CardView_Title_Text_Value = CardView_Title_Text_Value;

        this.CardView_Tag1_Txt = CardView_Tag1_Txt;
        this.CardView_Tag2_Txt = CardView_Tag2_Txt;
        this.CardView_Tag3_Txt = CardView_Tag3_Txt;
    }

    public int getCardView_Link_Text_Value() {
        return CardView_Link_Text_Value;
    }

    public void setCardView_Link_Text_Value(int cardView_Link_Text_Value) {
        CardView_Link_Text_Value = cardView_Link_Text_Value;
    }

    public Drawable getUser_Inf_Image_Res() {
        return User_Inf_Image_Res;
    }

    public void setUser_Inf_Image_Res(Drawable user_Inf_Image_Res) {
        User_Inf_Image_Res = user_Inf_Image_Res;
    }

    public String getCardView_Title_Text_Value() {
        return CardView_Title_Text_Value;
    }

    public void setCardView_Title_Text_Value(String cardView_Title_Text_Value) {
        CardView_Title_Text_Value = cardView_Title_Text_Value;
    }

    public String getCardView_Tag1_Txt() {
        return CardView_Tag1_Txt;
    }

    public void setCardView_Tag1_Txt(String cardView_Tag1_Txt) {
        CardView_Tag1_Txt = cardView_Tag1_Txt;
    }

    public String getCardView_Tag2_Txt() {
        return CardView_Tag2_Txt;
    }

    public void setCardView_Tag2_Txt(String cardView_Tag2_Txt) {
        CardView_Tag2_Txt = cardView_Tag2_Txt;
    }

    public String getCardView_Tag3_Txt() {
        return CardView_Tag3_Txt;
    }

    public void setCardView_Tag3_Txt(String cardView_Tag3_Txt) {
        CardView_Tag3_Txt = cardView_Tag3_Txt;
    }
}
