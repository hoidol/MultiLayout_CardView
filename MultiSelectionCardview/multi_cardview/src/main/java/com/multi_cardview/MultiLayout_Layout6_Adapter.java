package com.multi_cardview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class MultiLayout_Layout6_Adapter extends RecyclerView.Adapter<MultiLayout_Layout6_Adapter.ViewHolder_layout6>{

    private List<CardViewData_Layout6> Data_List;
    private int Layout_Style_idx;

    public MultiLayout_Layout6_Adapter(int Layout_Style_idx, List<CardViewData_Layout6> Data_List){
        this.Layout_Style_idx = Layout_Style_idx;
        this.Data_List = Data_List;

    }


    @Override
    public ViewHolder_layout6 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout6,null);

        ViewHolder_layout6 vh = new ViewHolder_layout6(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout6 holder, int position) {
        CardViewData_Layout6 data = Data_List.get(position);

        holder.CardView_Home_Card_Back_Layout.setBackground(data.getCardView_Image_Res());
        holder.CardView_Grade_Text.setText(data.getCardView_Grade_Text_Value());
        holder.CardView_Title_Text.setText(data.getCardView_Title_Text_Value());
        holder.CardView_Price_Text.setText(data.getCardView_Price_Text_Value());
        holder.CardView_Data_Text.setText(data.getCardView_Data_Text_Value());
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout6 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public LinearLayout CardView_Home_Card_Back_Layout;
        public TextView CardView_Grade_Text;
        public TextView CardView_Title_Text;
        public TextView CardView_Price_Text;
        public TextView CardView_Data_Text;


        public ViewHolder_layout6(View view) {
            super(view);

            CardView_Home_Card_Back_Layout =(LinearLayout)view.findViewById(R.id.home_card_back);
            CardView_Grade_Text = (TextView)view.findViewById(R.id.card_grade_text);
            CardView_Title_Text =(TextView)view.findViewById(R.id.card_title_text);
            CardView_Price_Text = (TextView)view.findViewById(R.id.card_price_text);
            CardView_Data_Text = (TextView)view.findViewById(R.id.card_date_text);


        }
    }


}
