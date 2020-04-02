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
    ViewPager viewPager;
    View rootView;

    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_third, container, false);


        viewPager = (ViewPager) rootView.findViewById(R.id.ThirdFragmentViewPager);
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
                    return new PrizeFragment();
                case 1:
                    return new CertificateFragment();
                case 2:
                    return new CollaborationFragment();

                default:
                    return new PrizeFragment();
            }
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof ThirdFragment.OnFragmentInteractionListener) {
            listener = (ThirdFragment.OnFragmentInteractionListener) context;
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
