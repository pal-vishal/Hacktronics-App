package me.HacktronicsAavesh.HacktronicsAavesh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class Day2Fragment extends Fragment {
    View v;
    private RecyclerView myrecyclerview;
    private List<DayContentExample> dayContentExampleList;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        dayContentExampleList = new ArrayList<>();
        dayContentExampleList.add(new DayContentExample("Event1", "Venue1 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event2", "Venue2 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event3", "Venue3 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event4", "Venue4 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event5", "Venue5 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event6", "Venue6 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event7", "Venue7 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event8", "Venue8 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event9", "Venue9 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event10", "Venue10 is here ", "AM", "10:00"));


    }



    public Day2Fragment() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.day1_fragment, container, false);
/*
        ArrayList<DayContentDesc> dayContentDescs = new ArrayList<>();
        dayContentDescs.add(new DayContentDesc("Event\n""description\n"           "is\n"       "here"));
        ArrayList<DayContentTitle> dayContentTitles = new ArrayList<>();
        DayContentTitle Event1 = new DayContentTitle("Event 1", dayContentDescs);
        dayContentTitles.add(Event1);
*/


        myrecyclerview = (RecyclerView) v.findViewById(R.id.day1_recycler);
        DayAdapterEx dayAdapter = new DayAdapterEx(dayContentExampleList,getContext());
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(dayAdapter);
        //  Adapter adapter = new Adapter(dayContentTitles);
        // myrecyclerview.setAdapter(adapter);
        return v;

    }


}
