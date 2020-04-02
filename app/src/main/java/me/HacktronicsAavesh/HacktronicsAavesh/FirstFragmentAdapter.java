package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class FirstFragmentAdapter extends PagerAdapter {
    List<Prize> mData;
    Context mContext;
    private LayoutInflater layoutInflater;


    FirstFragmentAdapter(Context mContext, List<Prize> mData) {
        this.mData = mData;
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        return mData.size();

    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(mContext);

        View view = layoutInflater.inflate(R.layout.fragment_first_content, container, false);
        ImageView image;
        TextView Title, Desc;
        Button button;
        button = view.findViewById(R.id.websiteButton);
        image = view.findViewById(R.id.Sampleimage);
        Title = view.findViewById(R.id.SampleTitle);
        Desc = view.findViewById(R.id.SampleDescription);

        image.setImageResource(mData.get(position).getImageResource());
        Title.setText(mData.get(position).getTitle());
        Desc.setText(mData.get(position).getInfo());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        container.addView(view, 0);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}
