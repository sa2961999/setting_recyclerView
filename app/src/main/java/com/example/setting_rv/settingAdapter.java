package com.example.setting_rv;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class settingAdapter extends RecyclerView.Adapter<settingAdapter.settingItemViewHolder> {
    public settingAdapter(List<settingItem> items) {
        this.items = items;
    }

    List<settingItem > items;

    @NonNull
    @Override
    public settingItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new settingItemViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull settingItemViewHolder holder, int position) {
settingItem item=items.get(position);
holder.title.setText(item.getTitle());
        holder.subtitle.setText(item.getSubtitle());
        holder.icon.setImageResource(item.ImageId);
        if(onImageClickListner!=null)
        holder.icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onImageClickListner.onItemClickListner(position,item);
            }
        });
holder.icon.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
onItemClickListner onImageClickListner;
    onItemClickListner onTitleClickListner;

    public void setOnImageClickListner(onItemClickListner onImageClickListner) {
        this.onImageClickListner = onImageClickListner;
    }

    public void setOnTitleClickListner(onItemClickListner onTitleClickListner) {
        this.onTitleClickListner = onTitleClickListner;
    }

    interface onItemClickListner{
void onItemClickListner(int position,settingItem item);
    }
    public static class settingItemViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView subtitle;
        ImageView icon;

        public settingItemViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            subtitle=itemView.findViewById(R.id.sub_title);
            icon=itemView.findViewById(R.id.icon);

        }
    }

}
