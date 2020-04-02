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
        dayContentExampleList.add(new DayContentExample("Event 1", "Venue 1 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 2", "Venue 2 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 3", "Venue 3 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 4", "Venue 4 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 5", "Venue 5 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 6", "Venue 6 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 7", "Venue 7 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 8", "Venue 8 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 9", "Venue 9 is here ", "AM", "10:00"));
        dayContentExampleList.add(new DayContentExample("Event 10","Venue 10 is here ", "AM", "10:00"));


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
