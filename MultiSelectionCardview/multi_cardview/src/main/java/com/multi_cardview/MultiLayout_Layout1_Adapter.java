package com.multi_cardview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class MultiLayout_Layout1_Adapter extends RecyclerView.Adapter<MultiLayout_Layout1_Adapter.ViewHolder_layout1>{
    private List<CardViewData_Layout1> Data_List;

    Button Recommend_Btn;
    public MultiLayout_Layout1_Adapter(List<CardViewData_Layout1> Data_List){

        this.Data_List = Data_List;
    }

    @Override
    public ViewHolder_layout1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout1,null);

        ViewHolder_layout1 vh = new ViewHolder_layout1(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout1 holder, int position) {
        final CardViewData_Layout1 data = Data_List.get(position);

        holder.CardView_ImageView.setBackground(data.getImage_Res_Value());
        holder.CardView_Title_Text.setText(data.getTitle_Text_Value());
        holder.CardView_Cur_Price_Text.setText(data.getCur_Price_Text_Value());
        holder.CardView_Pre_Price_Text.setText(data.getPre_Price_Text_Value());

        Recommend_Btn = holder.CardView_Recommend_Btn;

    }

    public Button Get_Recommend_Btn(){

        return Recommend_Btn;
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout1 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case


        public ImageView CardView_ImageView;
        public TextView CardView_Title_Text;
        public TextView CardView_Cur_Price_Text;
        public TextView CardView_Pre_Price_Text;
        public Button CardView_Recommend_Btn;

        public ViewHolder_layout1(View view) {
            super(view);
            CardView_ImageView = (ImageView)view.findViewById(R.id.CardView_Image);
            CardView_Recommend_Btn = (Button)view.findViewById(R.id.CardView_Recommend_Btn);
            CardView_Title_Text =(TextView)view.findViewById(R.id.UserInf_ID_Text);
            CardView_Cur_Price_Text = (TextView)view.findViewById(R.id.CardView_Cur_Price_Text);
            CardView_Pre_Price_Text = (TextView)view.findViewById(R.id.CardView_Pre_Price_Text);

        }
    }


}
