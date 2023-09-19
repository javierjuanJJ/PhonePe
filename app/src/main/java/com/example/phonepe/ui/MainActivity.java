package com.example.phonepe.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.phonepe.R;
import com.example.phonepe.helper.BottomNavHelp;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TextView tvToolbarText;
    private BottomNavigationView bottomNavigationView;
    private HomeFragment homeFragment;
    private AccountFragment accountFragment;
    private OfferFragment offerFragment;
    private PaymentFragment paymentFragment;
    private TransactionFragment transactionFragment;

    private final BottomNavigationView.OnNavigationItemReselectedListener onNavigationItemReselectedListener = item -> {
        int itemId = item.getItemId();
        if (itemId == R.id.navigation_home) {
            tvToolbarText.setText("PhonePe");
            setUpFragment(homeFragment);
            // return true;
        } else if (itemId == R.id.navigation_offers) {
            tvToolbarText.setText("Offers");
            setUpFragment(offerFragment);
            // return true;
        } else if (itemId == R.id.navigation_payment) {
            tvToolbarText.setText("Scan & pay");
            setUpFragment(paymentFragment);
            // return true;
        } else if (itemId == R.id.navigation_account) {
            tvToolbarText.setText("My Account");
            setUpFragment(accountFragment);
            // return true;
        } else if (itemId == R.id.navigation_transactions) {
            tvToolbarText.setText("Transactions");
            setUpFragment(transactionFragment);
            // return true;
        }
        // return false;
    };

    private void setUpFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.setCustomAnimations(android.R.animator.fade_in, android.R.animator.fade_out);
        fragmentTransaction.replace(R.id.home_view, fragment);
        fragmentTransaction.commit();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        initViews();
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("");
        tvToolbarText.setText("PhonePe");

        bottomNavigationView.setOnNavigationItemReselectedListener(onNavigationItemReselectedListener);


        BottomNavHelp.removeShiftMode(bottomNavigationView);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.home_view, homeFragment);
        beginTransaction.commit();

    }

    private void initViews() {
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        tvToolbarText = findViewById(R.id.titleToolbar);
        bottomNavigationView = findViewById(R.id.navigation);

        homeFragment = HomeFragment.newInstance();
        accountFragment = AccountFragment.newInstance();
        offerFragment = OfferFragment.newInstance();
        paymentFragment = PaymentFragment.newInstance();
        transactionFragment = TransactionFragment.newInstance();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_home, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull final MenuItem item) {

        int itemId = item.getItemId();
        if (itemId == R.id.notify) {
            Toast.makeText(this, "Notification", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.scanAndPay) {
            Toast.makeText(this, "Scan any code", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);


    }
}