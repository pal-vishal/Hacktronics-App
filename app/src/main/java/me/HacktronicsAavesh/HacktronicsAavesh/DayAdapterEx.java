package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class DayAdapterEx extends RecyclerView.Adapter<DayAdapterEx.DayVH> {
    private static final String TAG = "DayAdapterEx";
    List<DayContentExample> dayContentExampleList;
    Context context;


    public DayAdapterEx(List<DayContentExample> dayContentExampleList, Context context) {
        this.dayContentExampleList = dayContentExampleList;
        this.context = context;
    }

    @Override
    public DayVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.day1_ex, parent, false);
        return new DayVH(view, context);
    }

    @Override
    public void onBindViewHolder(@NonNull DayVH holder, int position) {
        DayContentExample dayContentExample = dayContentExampleList.get(position);
        holder.mEventText.setText(dayContentExample.getEventInfoEx());
        holder.mVenueText.setText(dayContentExample.getVenueInfoEx());
        holder.mTimeWOrdText.setText(dayContentExample.getTimeWordEx());
        holder.mTimeNoText.setText(dayContentExample.getTimeNoEx());


        boolean isExpanded = dayContentExampleList.get(position).isExpanded();
        holder.expandable.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return dayContentExampleList.size();
    }

    class DayVH extends RecyclerView.ViewHolder implements View.OnClickListener {
        private static final String TAG = "DayVH";
        RelativeLayout expandable;
        TextView mEventText, mVenueText, mTimeWOrdText, mTimeNoText;
        Context context;
        Button mapImage;


        public DayVH(@NonNull final View itemView, Context context) {
            super(itemView);
            mEventText = (TextView) itemView.findViewById(R.id.EventName);
            mVenueText = (TextView) itemView.findViewById(R.id.VenueName);
            mTimeWOrdText = (TextView) itemView.findViewById(R.id.TimeNoName);
            mTimeNoText = (TextView) itemView.findViewById(R.id.TimeWordName);
            expandable = (RelativeLayout) itemView.findViewById(R.id.expand);
            mapImage = (Button) itemView.findViewById(R.id.ViewLocation);
            mapImage.setOnClickListener(this);
            this.context = context;


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    DayContentExample dayContentExample = dayContentExampleList.get(getAdapterPosition());
                    dayContentExample.setExpanded(!dayContentExample.isExpanded());
                    notifyItemChanged(getAdapterPosition());

                }
            });


        }

        @Override
        public void onClick(View view) {
            Uri gmmIntentUri = Uri.parse("geo:0,0?q=31.707212, 76.526879(Google+NIT+ Hamirpur+ Library)");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            context.startActivity(mapIntent);
        }
    }
}

