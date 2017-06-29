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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class MultiLayout_Layout2_Adapter extends RecyclerView.Adapter<MultiLayout_Layout2_Adapter.ViewHolder_layout2>{

    private List<CardViewData_Layout2> Data_List;

    public MultiLayout_Layout2_Adapter(  List<CardViewData_Layout2> Data_List){

        this.Data_List = Data_List;
    }

    @Override
    public ViewHolder_layout2 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout2,null);

        ViewHolder_layout2 vh = new ViewHolder_layout2(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout2 holder, int position) {
        final CardViewData_Layout2 data = Data_List.get(position);


        holder.User_Inf_Image.setBackground(data.getUserInf_Image_Res_Value());
        holder.User_Inf_ID_Text.setText(data.getUserInf_ID_Text_Value());
        holder.User_Inf_Tag_Text.setText(data.getUserInf_Tag_Text_Value());
        holder.User_Inf_Time_Text.setText(data.getUserInf_Time_Text_Value());
        holder.User_Inf_Location_Text.setText(data.getUserInf_Location_Text_Value());

        holder.CardView_Image.setBackground(data.getImage_Res_Value());
        holder.User_Inf_Content_Text.setText(data.getUserInf_Content_Text_Value());
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout2 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView User_Inf_Image;
        public TextView User_Inf_ID_Text;
        public TextView User_Inf_Tag_Text;
        public TextView User_Inf_Time_Text;
        public TextView User_Inf_Location_Text;

        public ImageView CardView_Image;
        public TextView User_Inf_Content_Text;

        public ViewHolder_layout2(View view) {
            super(view);
            User_Inf_Image = (ImageView)view.findViewById(R.id.User_Inf_Image);
            User_Inf_ID_Text = (TextView)view.findViewById(R.id.UserInf_ID_Text);
            User_Inf_Tag_Text = (TextView)view.findViewById(R.id.UserInf_Tag_Text);
            User_Inf_Time_Text = (TextView)view.findViewById(R.id.UserInf_Time_Text);
            User_Inf_Location_Text = (TextView) view.findViewById(R.id.UserInf_Location_Text);


            CardView_Image = (ImageView)view.findViewById(R.id.CardView_Image);
            User_Inf_Content_Text =(TextView)view.findViewById(R.id.UserInf_Content_Text);

        }
    }


}
