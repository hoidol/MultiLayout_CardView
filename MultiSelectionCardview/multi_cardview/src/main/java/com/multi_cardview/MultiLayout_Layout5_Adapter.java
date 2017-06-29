package com.multi_cardview;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
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

public class MultiLayout_Layout5_Adapter extends RecyclerView.Adapter<MultiLayout_Layout5_Adapter.ViewHolder_layout5>{

    private List<CardViewData_Layout5> Data_List;
    private int Layout_Style_idx;

    public MultiLayout_Layout5_Adapter(int Layout_Style_idx, List<CardViewData_Layout5> Data_List){
        this.Layout_Style_idx = Layout_Style_idx;
        this.Data_List = Data_List;
    }

    @Override
    public ViewHolder_layout5 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout5,null);

        ViewHolder_layout5 vh = new ViewHolder_layout5(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout5 holder, int position) {
        CardViewData_Layout5 data = Data_List.get(position);

        holder.CardView_Link_Text.setText(data.getCardView_Link_Text_Value());

        holder.User_Inf_ImageView.setBackground(new ShapeDrawable(new OvalShape()));

        if (Build.VERSION.SDK_INT >= 21) {
            holder.User_Inf_ImageView.setClipToOutline(true);
        }

        holder.CardView_Title_Text.setText(data.getCardView_Title_Text_Value());
        holder.CardView_Tag1_Text.setText(data.getCardView_Tag1_Txt());
        holder.CardView_Tag2_Text.setText(data.getCardView_Tag2_Txt());
        holder.CardView_Tag3_Text.setText(data.getCardView_Tag3_Txt());
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout5 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case

        public TextView CardView_Link_Text;
        public ImageView User_Inf_ImageView;
        public TextView CardView_Title_Text;
        public TextView CardView_Tag1_Text;
        public TextView CardView_Tag2_Text;
        public TextView CardView_Tag3_Text;


        public ViewHolder_layout5(View view) {
            super(view);
            CardView_Link_Text = (TextView)view.findViewById(R.id.CardView_Link_Text);
            User_Inf_ImageView = (ImageView)view.findViewById(R.id.User_Inf_Image);
            CardView_Title_Text =(TextView)view.findViewById(R.id.UserInf_ID_Text);
            CardView_Tag1_Text = (TextView)view.findViewById(R.id.CardView_Tag1_Text);
            CardView_Tag2_Text = (TextView)view.findViewById(R.id.CardView_Tag2_Text);
            CardView_Tag3_Text = (TextView)view.findViewById(R.id.CardView_Tag3_Text);

        }
    }


}
