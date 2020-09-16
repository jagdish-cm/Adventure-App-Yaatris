package com.example.yaatris;

import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Explore_Homepage#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Explore_Homepage extends Fragment {

    CarouselView carouselView;
    int[] sampleImages = {R.drawable.riverrafting, R.drawable.safari, R.drawable.snow, R.drawable.trekking};

    private static final String[] COUNTRIES = new String[] { "River Rafting", "Trekking", "Desert Safari", "Snow skiing", "Sky Diving", "Caving", "Exploring"};

    public Explore_Homepage() {

    }

    public static Explore_Homepage newInstance() {
        Explore_Homepage fragment = new Explore_Homepage();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    ImageListener imageListener = new ImageListener() {
        @Override
        public void setImageForPosition(int position, ImageView imageView) {
            imageView.setImageResource(sampleImages[position]);
        }
    };



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_explore__homepage, container, false);
        carouselView = (CarouselView) v.findViewById(R.id.carouselView);
        carouselView.setPageCount(sampleImages.length);
        carouselView.setImageListener(imageListener);

        return v;
    }
}