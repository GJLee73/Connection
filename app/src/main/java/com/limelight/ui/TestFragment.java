package com.limelight.ui;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.limelight.R;

/**
 * Created by GILJAE on 2018-04-18.
 */

public class TestFragment extends Fragment {
    private AdapterFragmentCallbacks callbacks;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        callbacks = (AdapterFragmentCallbacks) activity;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_test, container, false);
        Button listButton = view.findViewById(R.id.button_list);
        Button pairButton = view.findViewById(R.id.button_pair);
        Button deleteButton = view.findViewById(R.id.button_delete);
        Button testingButton = view.findViewById(R.id.button_testing);
        final TextView testingText = view.findViewById(R.id.text_testing);

        listButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callbacks.listGame();
            }
        });

        pairButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i;
                if (callbacks.pairComputer()) i = 0;
            }
        });

        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callbacks.deleteComputer();
            }
        });

        testingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                testingText.setText(String.valueOf(callbacks.getComputerCounts()));
            }
        });

        return view;
    }
}
