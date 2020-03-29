package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
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

/**
 * Created by Adib on 13-Apr-17.
 */

public class ThirdFragment extends Fragment {
    View rootView;
    private OnFragmentInteractionListener listener;
    private RecyclerView mRecyclerView;
    private List<Prize> FirstContent;


    public static ThirdFragment newInstance() {
        return new ThirdFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_third, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);
        PrizeAdapter prizeAdapter = new PrizeAdapter(getContext(), FirstContent);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mRecyclerView.setAdapter(prizeAdapter);

        return rootView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirstContent = new ArrayList<>();
        FirstContent.add(new Prize("Prizes", "Top teams will be awarded cash prizes worth 50,000 and certificate of excellence.", R.drawable.winner));
        FirstContent.add(new Prize("Certificate", "Participation certificates will be given to all the participants.", R.drawable.certificate));
        FirstContent.add(new Prize("Asset", "Get a chance to interact with professors from IIT, IIIT and industrial experts.", R.drawable.people));

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
