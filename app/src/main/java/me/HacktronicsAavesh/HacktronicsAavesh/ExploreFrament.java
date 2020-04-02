package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import me.HacktronicsAavesh.bottomnavbar.R;

public class ExploreFrament extends Fragment {
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_explore, container, false);
        ImageView imageView = (ImageView) v.findViewById(R.id.Sampleimage);
        TextView textView = (TextView) v.findViewById(R.id.SampleTitle);
        TextView text = (TextView) v.findViewById(R.id.SampleDescription);
        Button button = (Button) v.findViewById(R.id.websiteButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://aavesh-iiitu.tech/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        return v;
    }
}
