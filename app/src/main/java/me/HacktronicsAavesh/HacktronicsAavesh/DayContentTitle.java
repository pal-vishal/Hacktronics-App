package me.HacktronicsAavesh.HacktronicsAavesh;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class DayContentTitle extends ExpandableGroup<DayContentDesc> {

    public DayContentTitle(String title ,List<DayContentDesc> items) {
        super(title,items);
    }
}
