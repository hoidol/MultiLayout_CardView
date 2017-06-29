package com.multi_cardview;

import android.graphics.drawable.Drawable;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class CardViewData_Layout6 {

    Drawable CardView_Image_Res;
    String CardView_Grade_Text_Value;
    String CardView_Title_Text_Value;
    String CardView_Price_Text_Value;
    String CardView_Data_Text_Value;


    public CardViewData_Layout6(Drawable CardView_Image_Res, String CardView_Grade_Text_Value, String CardView_Title_Text_Value, String CardView_Price_Text_Value, String CardView_Data_Text_Value){
        this.CardView_Image_Res = CardView_Image_Res;
        this.CardView_Grade_Text_Value = CardView_Grade_Text_Value;
        this.CardView_Title_Text_Value = CardView_Title_Text_Value;

        this.CardView_Price_Text_Value = CardView_Price_Text_Value;
        this.CardView_Data_Text_Value = CardView_Data_Text_Value;
    }

    public Drawable getCardView_Image_Res() {
        return CardView_Image_Res;
    }

    public void setCardView_Image_Res(Drawable cardView_Image_Res) {
        CardView_Image_Res = cardView_Image_Res;
    }

    public String getCardView_Grade_Text_Value() {
        return CardView_Grade_Text_Value;
    }

    public void setCardView_Grade_Text_Value(String cardView_Grade_Text_Value) {
        CardView_Grade_Text_Value = cardView_Grade_Text_Value;
    }

    public String getCardView_Title_Text_Value() {
        return CardView_Title_Text_Value;
    }

    public void setCardView_Title_Text_Value(String cardView_Title_Text_Value) {
        CardView_Title_Text_Value = cardView_Title_Text_Value;
    }

    public String getCardView_Price_Text_Value() {
        return CardView_Price_Text_Value;
    }

    public void setCardView_Price_Text_Value(String cardView_Price_Text_Value) {
        CardView_Price_Text_Value = cardView_Price_Text_Value;
    }

    public String getCardView_Data_Text_Value() {
        return CardView_Data_Text_Value;
    }

    public void setCardView_Data_Text_Value(String cardView_Data_Text_Value) {
        CardView_Data_Text_Value = cardView_Data_Text_Value;
    }
}
