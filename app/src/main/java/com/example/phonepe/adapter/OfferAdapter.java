package com.example.phonepe.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.phonepe.R;
import com.example.phonepe.model.OfferModel;

import java.util.ArrayList;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.ViewHolder> {

   private ArrayList<OfferModel> offerModelArrayList;
   private Context context;

   public OfferAdapter(ArrayList<OfferModel> offerModelArrayList, Context context) {
      this.offerModelArrayList = offerModelArrayList;
      this.context = context;
   }

   @NonNull
   @Override
   public OfferAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_offers,parent,false);
      return new ViewHolder(view);
   }

   @Override
   public void onBindViewHolder(@NonNull OfferAdapter.ViewHolder holder, int position) {

      holder.offerImgView.setImageResource(offerModelArrayList.get(position).getImage());
      holder.offerItem.setText(offerModelArrayList.get(position).getOfferOn());
      holder.offerDescription.setText(offerModelArrayList.get(position).getOfferDetails());

   }

   @Override
   public int getItemCount() {
      return offerModelArrayList.size();
   }

   public class ViewHolder extends RecyclerView.ViewHolder {


      private ImageView offerImgView;
      private TextView offerItem, offerDescription;

      public ViewHolder(@NonNull View itemView) {
         super(itemView);
         offerImgView = itemView.findViewById(R.id.offer_img);
         offerItem = itemView.findViewById(R.id.offer_txt);
         offerDescription = itemView.findViewById(R.id.offer_info);
      }
   }
}
