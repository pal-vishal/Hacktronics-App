package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import me.HacktronicsAavesh.bottomnavbar.R;

public class PrizeAdapter extends PagerAdapter {

    // Member variables.
    List<Prize> mData;
    Context mContext;
    private LayoutInflater layoutInflater;


    PrizeAdapter(Context mContext, List<Prize> mData) {
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

        View view = layoutInflater.inflate(R.layout.prize_content, container, false);
        ImageView image;
        TextView Title, Desc;
        image = view.findViewById(R.id.Sampleimage);
        Title = view.findViewById(R.id.SampleTitle);
        Desc = view.findViewById(R.id.SampleDescription);

        image.setImageResource(mData.get(position).getImageResource());
        Title.setText(mData.get(position).getTitle());
        Desc.setText(mData.get(position).getInfo());

        container.addView(view, 0);
        return view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}

