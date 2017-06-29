package com.multi_cardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by parkhoyoung on 2017. 6. 26..
 */

public class MultiLayout_Layout0_Adapter extends RecyclerView.Adapter<MultiLayout_Layout0_Adapter.ViewHolder_layout0>{

    private List<CardViewData_Layout0> Data_List;
    private int Layout_Style_idx;

    public MultiLayout_Layout0_Adapter(int Layout_Style_idx, List<CardViewData_Layout0> Data_List){
        this.Layout_Style_idx = Layout_Style_idx;
        this.Data_List = Data_List;
    }

    @Override
    public ViewHolder_layout0 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout0,null);

        ViewHolder_layout0 vh = new ViewHolder_layout0(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout0 holder, int position) {
        CardViewData_Layout0 data = Data_List.get(position);

        holder.CardView_ImageView.setBackground(data.getImage_Res_Value());
        holder.CardView_Title_Text.setText(data.getTitle_Text_Value());
        holder.CardView_Content_Text.setText(data.getContent_Text_Value());
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout0 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView CardView_ImageView;
        public TextView CardView_Title_Text;
        public TextView CardView_Content_Text;

        public ViewHolder_layout0(View view) {
            super(view);
            CardView_ImageView = (ImageView)view.findViewById(R.id.CardView_Image);
            CardView_Title_Text = (TextView)view.findViewById(R.id.UserInf_ID_Text);
            CardView_Content_Text =(TextView)view.findViewById(R.id.CardView_Content_Text);

        }
    }


}
