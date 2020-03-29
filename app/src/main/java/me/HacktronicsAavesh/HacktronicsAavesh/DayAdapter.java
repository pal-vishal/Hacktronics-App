package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class DayAdapter extends RecyclerView.Adapter<DayAdapter.ViewHolder> {

    // Member variables.
    List<DayContent> mData;
    Context mContext;


    public DayAdapter(Context mContext, List<DayContent> mData) {
        this.mData = mData;
        this.mContext = mContext;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.item_day, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,
                                 int position) {
        holder.mEventText.setText(mData.get(position).getEventInfo());
        holder.mVenueText.setText(mData.get(position).getVenueInfo());
        holder.mTimeNoText.setText(mData.get(position).getTimeNo());
        holder.mTimeWOrdText.setText(mData.get(position).getTimeWord());

    }


    @Override
    public int getItemCount() {
        return mData.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {

        // Member Variables for the TextViews
        private TextView mEventText;
        private TextView mVenueText;
        private TextView mTimeNoText;
        private TextView mTimeWOrdText;


        public ViewHolder(View itemView) {
            super(itemView);

            // Initialize the views.
            mEventText = (TextView) itemView.findViewById(R.id.eventName);
            mVenueText = (TextView) itemView.findViewById(R.id.venueName);
            mTimeWOrdText = (TextView) itemView.findViewById(R.id.timenoName);
            mTimeNoText = (TextView) itemView.findViewById(R.id.timeWordName);
        }


    }
}

