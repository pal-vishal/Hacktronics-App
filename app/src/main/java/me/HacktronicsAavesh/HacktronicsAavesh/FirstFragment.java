package me.HacktronicsAavesh.HacktronicsAavesh;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;

import me.HacktronicsAavesh.bottomnavbar.R;



public class FirstFragment extends Fragment {

    View rootView;

    ViewFlipper viewFlipper;
    private LinearLayout dotsContainer;
    private int custom_position = 0;

    private OnFragmentInteractionListener listener;

    public static FirstFragment newInstance() {
        return new FirstFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View rootView = inflater.inflate(R.layout.fragment_first, container, false);

        int image[] = {R.drawable.hacktronics, R.drawable.presentedby, R.drawable.collaboration};
        viewFlipper = (ViewFlipper) rootView.findViewById(R.id.view_flipper);

        for (int i = 0; i < image.length; i++) {
            flipperimage(image[i]);
        }

        //  ImageView imageView = (ImageView) rootView.findViewById(R.id.hacktronicsImage);
        TextView textView = (TextView) rootView.findViewById(R.id.about_text);
        final TextView abouttextView = (TextView) rootView.findViewById(R.id.about_content);
        String name = abouttextView.getText().toString();
        name = "Hacktronics is a wide spectrum hackathon that incorporates both hardware and software to bring innovation in the field of engineering.\n";
        name += "A platfrom to shape your innovations into profilic products which would have a potential to change the world. ";
        abouttextView.setText(name);

        final TextView whycontentView = (TextView) rootView.findViewById(R.id.why_content);
        String whyContent = whycontentView.getText().toString();
        whyContent = "Hacktronics 2020 has been thought to be an event with no restrictions based on themes unlike other institutions.\n";
        whyContent += "We aim to promote a new level of healthy competitive fervour and electronics culture among various institutes.";
        whycontentView.setText(whyContent);

        rootView.setBackgroundColor(getResources().getColor(R.color.colorBackground));
       // textView.setTextColor(getResources().getColor(R.color.textColor));
        abouttextView.setTextColor(getResources().getColor(R.color.textColor));
        whycontentView.setTextColor(getResources().getColor(R.color.textColor));



        return rootView;
    }

    public void flipperimage(int image) {
        ImageView imageView = new ImageView(getActivity());
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.setAutoStart(true);

        viewFlipper.setInAnimation(getActivity(), android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(getActivity(), android.R.anim.slide_out_right);
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
    }

}
