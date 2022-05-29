package com.example.hobbify;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder> {

    private Context mContext;
    private List<Recipies> mData;
    private Object ViewGroup;

    public RecyclerViewAdapter(Context mContext,List<Recipies> mData ){
        this.mContext = mContext;
        this.mData = mData;

    }
    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int i) {

     View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.activity_recipie2, (android.view.ViewGroup) ViewGroup,false);
        return new MyHolder(view);


    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {
        TextView recipieTitle;
        CardView cardView;
        ImageView img_recipie_thumbnail;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
             recipieTitle = (TextView) itemView.findViewById(R.id.Recipie_Name);
             img_recipie_thumbnail = (ImageView) itemView.findViewById((R.id.recipie_img_id));
             cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }
    }
    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int i) {

        holder.recipieTitle.setText(mData.get(i).getRecipieName());
        holder.img_recipie_thumbnail.setImageResource(mData.get(i).getThumbnail());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,RecipieActivity.class);

                intent.putExtra("Name",mData.get(i).getRecipieName());
                intent.putExtra("Ingredients",mData.get(i).getRecipieIngredients());
                intent.putExtra("MethodTitle",mData.get(i).getRecipieMethodTitle());
                intent.putExtra("Recipie",mData.get(i).getRecipie());

                mContext.startActivity(intent);
            }
        });
    }

}
