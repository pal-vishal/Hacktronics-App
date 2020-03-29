package me.HacktronicsAavesh.HacktronicsAavesh;

import android.view.View;
import android.widget.TextView;


import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import me.HacktronicsAavesh.bottomnavbar.R;

public class DayChildViewHolder extends ChildViewHolder {
    private TextView childText;
    public DayChildViewHolder(View itemView) {
        super(itemView);
        childText = (TextView) itemView.findViewById(R.id.list_item_day_text);
    }
    public void bind(DayContentDesc dayContentDesc){
        childText.setText(dayContentDesc.name);
    }
}
