package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
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


    PrizeAdapter(Context mContext, List<Prize> mData) {
        this.mData = mData;
        this.mContext = mContext;
    }


    @Override
    public PrizeAdapter.ViewHolder onCreateViewHolder(
            ViewGroup parent, int viewType) {
        View v;
       v =LayoutInflater.from(mContext).
                inflate(R.layout.prize_content, parent, false);
       ViewHolder viewHolder = new ViewHolder(v);
       return viewHolder;
    }

    @Override
    public void onBindViewHolder(PrizeAdapter.ViewHolder holder,
                                 int position) {
        holder.mTitleText.setText(mData.get(position).getTitle());
        holder.mInfoText.setText(mData.get(position).getInfo());
        holder.mImage.setImageResource(mData.get(position).getImageResource());

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {

        // Member Variables for the TextViews
        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView mImage;

        ViewHolder(View itemView) {
            super(itemView);

            // Initialize the views.
            mTitleText = (TextView) itemView.findViewById(R.id.SampleTitle);
            mInfoText = (TextView) itemView.findViewById(R.id.SampleDescription);
            mImage = (ImageView) itemView.findViewById(R.id.Sampleimage);
        }


    }
}
