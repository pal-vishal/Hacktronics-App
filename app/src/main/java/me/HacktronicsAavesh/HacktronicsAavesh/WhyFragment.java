package me.HacktronicsAavesh.HacktronicsAavesh;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import me.HacktronicsAavesh.bottomnavbar.R;

public class WhyFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_why, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.Sampleimage);
        TextView textView = (TextView) v.findViewById(R.id.SampleTitle);
        TextView text = (TextView) v.findViewById(R.id.SampleDescription);
        return v;
    }
}

