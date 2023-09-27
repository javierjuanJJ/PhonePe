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

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.phonepe.R;
import com.example.phonepe.adapter.DealerAdapter;
import com.example.phonepe.adapter.OfferViewPagerAdapter;
import com.example.phonepe.model.DealerModel;
import com.example.phonepe.model.OfferModel;

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
        ArrayList<DealerModel> offlineMerchantList = new ArrayList<DealerModel>();
        offlineMerchantList.add(new DealerModel(
           "StarsBuck","Flat",
                "Rs."+"39","Gree","Valid Onece pre User"
        ));

        offlineMerchantList.add(new DealerModel(
                "StarsBuck","Flat",
                "Rs."+"39","Gree","Valid Onece pre User"
        ));

        offlineMerchantList.add(new DealerModel(
                "StarsBuck","Flat",
                "Rs."+"39","Gree","Valid Onece pre User"
        ));

        adapter = new DealerAdapter(context, offlineMerchantList);
        dealersRecycler.setAdapter(adapter);

        ArrayList<DealerModel> onlineDealerList = new ArrayList<>();
        onlineDealerList.add(new DealerModel(
                "Zomato","Get",
                "20%","Cashback",
                "Valid Twice per User"
        ));

        onlineDealerList.add(new DealerModel(
                "Zomato","Get",
                "20%","Cashback",
                "Valid Twice per User"
        ));

        onlineDealerList.add(new DealerModel(
                "Zomato","Get",
                "20%","Cashback",
                "Valid Twice per User"
        ));

        adapter = new DealerAdapter(context, offlineMerchantList);
        dealersRecyclerOnline.setAdapter(adapter);

        ArrayList<OfferModel> offerList = new ArrayList<OfferModel>();
        offerList.add(new OfferModel(R.drawable.ic_bill_green,
                "Bill Payment", "25% CashBack"));

        offerList.add(new OfferModel(R.drawable.ic_bill_green,
                "Bill Payment", "25% CashBack"));

        offerList.add(new OfferModel(R.drawable.ic_bill_green,
                "Bill Payment", "25% CashBack"));

        return view;
    }

    private void setUpViewPager() {
        offerList = new ArrayList<>();
        offerList.add("25% Cashback");
        offerList.add("Free Recharge JIO");
        offerList.add("20 % off on $BI card");
        offerList.add("10% discount Book Flight");
        offerList.add("20 % off on $BI card");
        OfferViewPagerAdapter viewPagerAdapter = new OfferViewPagerAdapter(context, offerList);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setClipToPadding(false);
        viewPager.setPadding(40,0,40,20);
        viewPager.setPageMargin(20);
        addBottomDots(count);
    }

    private void addBottomDots(int currentPage) {
        TextView[] mTxtDot = new TextView[offerList.size()];

        for (int counter = 0; counter < mTxtDot.length; counter++) {
            mTxtDot[counter] = new TextView(context);
            mTxtDot[counter].setText(Html.fromHtml("&#8226;"));
            mTxtDot[counter].setTextSize(35.0F);
            mTxtDot[counter].setTextColor(getResources().getColor(R.color.green_300));
            lnrLyt.addView(mTxtDot[counter]);
        }

        if (mTxtDot.length > 0) {
            mTxtDot[currentPage].setTextColor(getResources().getColor(R.color.green_400));
        }
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

    @Override
    public void onDetach() {
        super.onDetach();
        timer.cancel();
    }
}