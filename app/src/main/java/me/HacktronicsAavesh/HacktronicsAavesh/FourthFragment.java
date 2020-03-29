package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.HacktronicsAavesh.bottomnavbar.R;


public class FourthFragment extends Fragment {


    View v;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;


    private OnFragmentInteractionListener listener;

    public static FourthFragment newInstance() {
        return new FourthFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_fourth, container, false);

        tabLayout = (TabLayout) v.findViewById(R.id.tablayoutid);
        viewPager = (ViewPager) v.findViewById(R.id.viewpager);
        adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.AddFragment(new Day1Fragment(), "Day 1");
        adapter.AddFragment(new Day2Fragment(), "Day 2");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


        return v;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FourthFragment.OnFragmentInteractionListener) {
            listener = (FourthFragment.OnFragmentInteractionListener) context;
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
    }
    /*
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


    }

     */

}
