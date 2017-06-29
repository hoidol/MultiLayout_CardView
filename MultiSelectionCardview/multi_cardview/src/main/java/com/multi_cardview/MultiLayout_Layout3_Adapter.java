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

public class MultiLayout_Layout3_Adapter extends RecyclerView.Adapter<MultiLayout_Layout3_Adapter.ViewHolder_layout3>{

    private List<CardViewData_Layout3> Data_List;
    private int Layout_Style_idx;

    public MultiLayout_Layout3_Adapter(int Layout_Style_idx, List<CardViewData_Layout3> Data_List){
        this.Layout_Style_idx = Layout_Style_idx;
        this.Data_List = Data_List;
    }

    @Override
    public ViewHolder_layout3 onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout3,null);

        ViewHolder_layout3 vh = new ViewHolder_layout3(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder_layout3 holder, int position) {
        CardViewData_Layout3 data = Data_List.get(position);

        holder.User_Inf_Image.setBackground(new ShapeDrawable(new OvalShape()));

        if (Build.VERSION.SDK_INT >= 21) {
            holder.User_Inf_Image.setClipToOutline(true);
        }

        holder.CardView_Title_Text.setText(data.getCardView_Title_Text_Value());
        holder.CardView_Sub_Title_Text.setText(data.getCardView_Sub_Title_Text_Value());
        holder.CardView_Content_Text.setText(data.getCardView_Content_Text_Value());
        holder.CardView_Image.setBackground(data.getImage_Res_Value());
    }

    @Override
    public int getItemCount() {
        return Data_List.size();
    }

    public class ViewHolder_layout3 extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView User_Inf_Image;

        public TextView CardView_Title_Text;
        public TextView CardView_Sub_Title_Text;
        public TextView CardView_Content_Text;

        public ImageView CardView_Image;


        public ViewHolder_layout3(View view) {
            super(view);
            User_Inf_Image = (ImageView)view.findViewById(R.id.User_Inf_Image);
            CardView_Title_Text = (TextView)view.findViewById(R.id.UserInf_ID_Text);
            CardView_Sub_Title_Text =(TextView)view.findViewById(R.id.CardView_Sub_Title_Text);
            CardView_Content_Text =(TextView)view.findViewById(R.id.CardView_Content_Text);
            CardView_Image = (ImageView)view.findViewById(R.id.CardView_Image);

        }
    }


}
