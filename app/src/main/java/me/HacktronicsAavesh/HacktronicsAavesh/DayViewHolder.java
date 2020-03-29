package me.HacktronicsAavesh.HacktronicsAavesh;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import me.HacktronicsAavesh.bottomnavbar.R;


public class DayViewHolder extends GroupViewHolder {
    private TextView mEventText;
    private TextView mVenueText;
    private TextView mTimeNoText;
    private TextView mTimeWOrdText;


    // Initialize the views.

    public DayViewHolder(View itemView) {

        super(itemView);
        mEventText = (TextView) itemView.findViewById(R.id.eventName);
        mVenueText = (TextView) itemView.findViewById(R.id.venueName);
        mTimeWOrdText = (TextView) itemView.findViewById(R.id.timenoName);
        mTimeNoText = (TextView) itemView.findViewById(R.id.timeWordName);
    }
    public void bind(DayContentTitle dayContentTitle){
        mEventText.setText(dayContentTitle.getTitle());
        mVenueText.setText(dayContentTitle.getTitle());
        mTimeWOrdText.setText(dayContentTitle.getTitle());
        mTimeNoText.setText(dayContentTitle.getTitle());
    }
}
