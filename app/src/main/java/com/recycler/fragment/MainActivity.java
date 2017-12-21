package com.recycler.fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.message_tv);
        findViewById(R.id.ok_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //create bundle
        Bundle bundle = new Bundle();

        //attach required data to bundle
        bundle.putString("a", textView.getText().toString());

        //create fragment object
        MyFragment myFragment = new MyFragment();

        //attach bundle to fragment
        myFragment.setArguments(bundle);

        //get fragment manager object for fragment management
        FragmentManager fragmentManager = getFragmentManager();

        //get fragment transaction object from fragment manager
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //add fragment
        fragmentTransaction.add(R.id.container_fl, myFragment, MyFragment.TAG);

        //commit transaction
        fragmentTransaction.commit();
    }
}
