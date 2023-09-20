package com.example.phonepe.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.phonepe.R;
import com.example.phonepe.adapter.HomeViewPagerAdapter;

import java.util.ArrayList;
import java.util.Timer;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private Context context;
    private ViewPager viewPager;
    private LinearLayout lnrLyt;
    private ArrayList<Integer> offerList;
    private int count = 0;
    private Timer timer;

    public HomeFragment() {
        // Required empty public constructor
    }


    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void initViews(View view) {
        viewPager = viewPager.findViewById(R.id.viewPagerHome);
        lnrLyt = view.findViewById(R.id.lnPointsHome);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initViews(view);
        setupViewPager();


        // Inflate the layout for this fragment
        return view;
    }

    private void setupViewPager() {
        offerList = new ArrayList<>();
        offerList.add(R.drawable.jsi);
        offerList.add(R.drawable.jse1);
        offerList.add(R.drawable.jse2);
        HomeViewPagerAdapter viewPagerAdapter = new HomeViewPagerAdapter(context, offerList);
        viewPager.setAdapter(viewPagerAdapter);
        addBottomDots(0);
    }

    private void addBottomDots(int currentPage) {
        TextView[] mTxtDot = new TextView[offerList.size()];

        for (int counter = 0; counter < mTxtDot.length; counter++) {
            mTxtDot[counter] = new TextView(context);
            mTxtDot[counter].setText(Html.fromHtml("&#8226;"));
        }

    }
}