package me.HacktronicsAavesh.HacktronicsAavesh;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class Adapter extends ExpandableRecyclerViewAdapter<DayViewHolder, DayChildViewHolder> {
    LayoutInflater inflater;

    public Adapter(List<? extends ExpandableGroup> groups) {
        super(groups);
    }


    @Override
    public DayViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_day, parent, false);
        return new DayViewHolder(v);
    }

    @Override
    public DayChildViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_day, parent, false);
        return new DayChildViewHolder(v);
    }

    @Override
    public void onBindChildViewHolder(DayChildViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final DayContentDesc dayContentDesc = (DayContentDesc) group.getItems().get(childIndex);
        holder.bind(dayContentDesc);
    }

    @Override
    public void onBindGroupViewHolder(DayViewHolder holder, int flatPosition, ExpandableGroup group) {
        final DayContentTitle dayContentTitle = (DayContentTitle) group;
        holder.bind(dayContentTitle);
    }
}
