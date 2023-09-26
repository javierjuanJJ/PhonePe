package com.example.phonepe.ui;

import static androidx.appcompat.widget.LinearLayoutCompat.HORIZONTAL;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.phonepe.R;
import com.example.phonepe.adapter.DealerAdapter;

import java.util.ArrayList;
import java.util.Timer;

public class OfferFragment extends Fragment {

    private Context context;
    private RecyclerView offerRecycler, dealersRecycler, dealersRecyclerOnline;
    private DealerAdapter adapter;
    private ViewPager viewPager;
    private ArrayList<String> offerList;
    private LinearLayout lnrLyt;
    private Timer timer;
    private int count = 0;


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    public OfferFragment() {
        // Required empty public constructor
    }

    public static OfferFragment newInstance() {
        OfferFragment fragment = new OfferFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_offer, container, false);
        initViews(view);

        setUpViewPager();


        return view;
    }

    private void setUpViewPager() {
        offerList = new ArrayList<>();
        offerList.add("25% Cashback");
        offerList.add("Free Recharge JIO");
        offerList.add("20 % off on $BI card");
        offerList.add("10% discount Book Flight");
        offerList.add("20 % off on $BI card");
    }

    private void initViews(View view) {
        viewPager = view.findViewById(R.id.offer_view_pager);
        lnrLyt = view.findViewById(R.id.ln_points);
        offerRecycler = view.findViewById(R.id.rv_bill_pay_offers);
        dealersRecycler = view.findViewById(R.id.rv_offline_merchant);
        dealersRecyclerOnline = view.findViewById(R.id.online_dealers_recycler);
        dealersRecyclerOnline.setNestedScrollingEnabled(false);
        dealersRecycler.setNestedScrollingEnabled(false);
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(RecyclerView.HORIZONTAL);
        offerRecycler.setLayoutManager(layoutManager);

        dealersRecycler.setLayoutManager(new GridLayoutManager(context, 3));
        dealersRecyclerOnline.setLayoutManager(new GridLayoutManager(context, 3));
    }
}