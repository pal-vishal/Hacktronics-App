package me.HacktronicsAavesh.HacktronicsAavesh;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;


public class ThirdFragment extends Fragment {
    private OnFragmentInteractionListener listener;
    private RecyclerView recyclerView;
    private List<Prize> Content;
    View rootView;

    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_third, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        PrizeAdapter prizeAdapter = new PrizeAdapter(getContext(), Content);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(prizeAdapter);
        return rootView;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Content = new ArrayList<>();
        Content.add(new Prize("Top teams will be awarded cash prizes worth 50,000 and certificate of excellence.", R.drawable.winner));
        Content.add(new Prize("Participation certificates will be given to all the participants.", R.drawable.certificatenew));
        Content.add(new Prize("Get a chance to interact with professors from IIT, IIIT and industrial experts.",R.drawable.people));
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }

    public interface OnFragmentInteractionListener {

        void onClicked();

    }
}
