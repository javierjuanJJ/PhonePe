package com.example.phonepe.ui;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phonepe.R;
import com.example.phonepe.adapter.TransactionAdapter;
import com.example.phonepe.model.TransactionModel;

import java.util.ArrayList;

public class TransactionFragment extends Fragment {

    private Context context;
    private RecyclerView recyclerView;

    public TransactionFragment() {
        // Required empty public constructor
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.context = context;
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TransactionFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TransactionFragment newInstance() {
        TransactionFragment fragment = new TransactionFragment();
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
        View view = inflater.inflate(R.layout.fragment_transaction, container, false);
        initViews(view);
        ArrayList<TransactionModel> transactionModels = new ArrayList<TransactionModel>();
        transactionModels.add(new TransactionModel(R.drawable.ic_to_contact, "1 day ago", "Paid to", "Zomato", "Rs." + "500", "Debbotded from"));
        transactionModels.add(new TransactionModel(R.drawable.ic_to_contact, "1 day ago", "Paid to", "FlipKart", "Rs." + "200", "Debbotded from"));
        transactionModels.add(new TransactionModel(R.drawable.ic_to_account, "2 day ago", "CashBack", "Pizzahut", "Rs." + "190", "Debbotded to"));
        transactionModels.add(new TransactionModel(R.drawable.ic_to_contact, "3 day ago", "Paid to", "BigBazzar", "Rs." + "1170", "Creddited from"));


        transactionModels.add(new TransactionModel(R.drawable.ic_to_contact, "4 day ago", "Paid to", "Crompton", "Rs." + "700", "Debbotded from"));
        transactionModels.add(new TransactionModel(R.drawable.ic_to_account, "5 day ago", "Paid to", "AJIO", "Rs." + "900", "Debbotded to"));
        transactionModels.add(new TransactionModel(R.drawable.ic_to_account, "7 day ago", "CashBack", "Myntra", "Rs." + "190", "Credited from"));


        TransactionAdapter adapter = new TransactionAdapter(transactionModels, context);

        recyclerView.setAdapter(adapter);
        return view;
    }

    private void initViews(View view) {


        recyclerView = view.findViewById(R.id.transaction_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));


    }
}