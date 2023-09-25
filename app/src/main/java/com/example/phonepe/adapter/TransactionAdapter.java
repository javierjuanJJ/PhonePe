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
import com.example.phonepe.model.TransactionModel;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.ViewHolder> {


    private ArrayList<TransactionModel> txtList;
    private Context context;

    public TransactionAdapter(ArrayList<TransactionModel> txtList, Context context) {
        this.txtList = txtList;
        this.context = context;
    }

    @NonNull
    @Override
    public TransactionAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_list_item, parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionAdapter.ViewHolder holder, int position) {
        holder.txtImg.setImageResource(txtList.get(position).getImgTxnWay());
        holder.txtDate.setText(txtList.get(position).getTxnDate());
        holder.txtTxnView.setText(txtList.get(position).getTxnMed());
        holder.txtDealer.setText(txtList.get(position).getTxnDealer());
        holder.txtAmt.setText(txtList.get(position).getTxnAmt());
        holder.txtAmtDebCred.setText(txtList.get(position).getTxnAntCd());
    }

    @Override
    public int getItemCount() {
        return txtList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        private ImageView txtImg;
        private TextView txtDate, txtTxnView, txtDealer, txtAmt, txtAmtDebCred;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtImg = itemView.findViewById(R.id.imv_transaction_type);
            txtDate = itemView.findViewById(R.id.txt_transaction_date);
            txtTxnView = itemView.findViewById(R.id.txt_transaction_date);
            txtDealer = itemView.findViewById(R.id.txt_transaction_type);
            txtAmt = itemView.findViewById(R.id.txt_transaction_merchant);
            txtAmtDebCred = itemView.findViewById(R.id.txt_transaction_cred_deb);

        }
    }
}
