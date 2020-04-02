package me.HacktronicsAavesh.HacktronicsAavesh;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class FirstFragmentCardView extends Fragment {

    private OnFragmentInteractionListener listener;
    ViewPager viewPager;
    FirstFragmentAdapter firstFragmentAdapter;
    View rootView;

    public static FirstFragmentCardView newInstance() {
        return new FirstFragmentCardView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_first_cardview, container, false);


        viewPager = (ViewPager) rootView.findViewById(R.id.prizeViewPager);
        viewPager.setAdapter(new MyPagerAdapter(getChildFragmentManager()));
        return rootView;
    }

    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        @Override
        public Fragment getItem(int pos) {
            switch (pos) {

                case 0:
                    return new AboutFragment();
                case 1:
                    return new WhyFragment();
                case 2:
                    return new TimelineFragment();
                case 3:
                    return new ExploreFrament();
                default:
                    return new AboutFragment();
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FirstFragmentCardView.OnFragmentInteractionListener) {
            listener = (FirstFragmentCardView.OnFragmentInteractionListener) context;
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
