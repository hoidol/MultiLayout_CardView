package com.multi_cardview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class MultiLayout_Layout4_Adapter extends RecyclerView.Adapter<MultiLayout_Layout4_Adapter.ViewHolder_layout4>{

    private List<CardViewData_Layout4> Data_List;

    public MultiLayout_Layout4_Adapter(List<CardViewData_Layout4> Data_List){
        this.Data_List = Data_List;
    }

    @Override
    public ViewHolder_layout4 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout4,null);

        ViewHolder_layout4 vh = new ViewHolder_layout4(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout4 holder, int position) {
        final CardViewData_Layout4 data = Data_List.get(position);

        holder.CardView_Image.setBackground(data.getImage_Res_Value());
        holder.CardView_Addicational_Image.setBackground(data.getAdditional_Image_Res_Value());
        holder.CardView_Title_Text.setText(data.getTitle_Text_Value());
        holder.CardView_Title_Text.setText(data.getCur_Price_Text_Value());
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout4 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public ImageView CardView_Image;
        public ImageView CardView_Addicational_Image;
        public TextView CardView_Title_Text;
        public TextView CardView_Cur_Price_Text;

        public ViewHolder_layout4(View view) {
            super(view);

            CardView_Image = (ImageView)view.findViewById(R.id.CardView_Image);
            CardView_Addicational_Image =(ImageView)view.findViewById(R.id.CardView_Addicational_Image);
            CardView_Title_Text = (TextView)view.findViewById(R.id.UserInf_ID_Text);
            CardView_Cur_Price_Text= (TextView)view.findViewById(R.id.CardView_Cur_Price_Text);

        }
    }


}
