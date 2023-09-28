package com.example.phonepe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonepe.R;
import com.example.phonepe.model.DealerModel;

import java.util.ArrayList;

public class DealerAdapter extends RecyclerView.Adapter<DealerAdapter.ViewHolder> {
    Context context;
    ArrayList<DealerModel> dealerModelArrayList;
    public DealerAdapter(Context context, ArrayList<DealerModel> dealerModelArrayList) {
        this.context = context;
        this.dealerModelArrayList = dealerModelArrayList;
    }

    @NonNull
    @Override
    public DealerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_dealers_offers, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DealerAdapter.ViewHolder holder, int position) {

        holder.dealerName.setText(dealerModelArrayList.get(position).getDealerName());
        holder.discountOffer.setText(dealerModelArrayList.get(position).getDiscountOffer());
        holder.discountAmtm.setText(dealerModelArrayList.get(position).getDiscountAmt());
        holder.discountVc.setText(dealerModelArrayList.get(position).getDiscountOffer());
        holder.discountDealer.setText(dealerModelArrayList.get(position).getDiscountWay());

    }


    @Override
    public int getItemCount() {
        return dealerModelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView dealerName, discountOffer, discountAmtm, discountVc, discountDealer;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dealerName = itemView.findViewById(R.id.dealer_txt);
            discountOffer = itemView.findViewById(R.id.dealer_off);
            discountAmtm = itemView.findViewById(R.id.dealer_off_price);
            discountVc = itemView.findViewById(R.id.dealer_off_bw);
            discountDealer = itemView.findViewById(R.id.discount_info);
        }
    }
}
