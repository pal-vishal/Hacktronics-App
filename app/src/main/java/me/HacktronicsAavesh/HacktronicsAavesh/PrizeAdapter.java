package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class PrizeAdapter extends RecyclerView.Adapter<PrizeAdapter.ViewHolder> {

    // Member variables.
    List<Prize> mData;
    Context mContext;
    private LayoutInflater layoutInflater;


    PrizeAdapter(Context mContext, List<Prize> mData) {
        this.mData = mData;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.prize_content, parent,false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(PrizeAdapter.ViewHolder holder, int position) {
        holder.infotext.setText(mData.get(position).getInfo());
        holder.image.setImageResource(mData.get(position).getImageResource());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView infotext;
        private ImageView image;

        ViewHolder(View itemView){
            super(itemView);
            infotext = (TextView) itemView.findViewById(R.id.HacktronicsText);
            image = (ImageView) itemView.findViewById(R.id.HacktronicsImage);
        }
    }
}

