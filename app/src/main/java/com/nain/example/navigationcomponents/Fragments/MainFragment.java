package com.nain.example.navigationcomponents.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nain.example.navigationcomponents.R;

public class MainFragment extends Fragment {

    View rootView;
    Button btnOne, btnTwo, btnThree;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        btnOne = rootView.findViewById(R.id.mainButtonOneID);
        btnTwo = rootView.findViewById(R.id.mainButtonTwoID);
        btnThree = rootView.findViewById(R.id.mainButtonThreeID);

        btnOne.setOnClickListener(v -> {
            Navigation.findNavController(rootView).navigate(R.id.action_mainFragment_to_fragmentOne);
        });
        btnTwo.setOnClickListener(v -> {
            Navigation.findNavController(rootView).navigate(R.id.action_mainFragment_to_fragmentTwo);
        });
        btnThree.setOnClickListener(v -> {
            Navigation.findNavController(rootView).navigate(R.id.action_mainFragment_to_fragmentThree);
        });

        return rootView;
    }
}