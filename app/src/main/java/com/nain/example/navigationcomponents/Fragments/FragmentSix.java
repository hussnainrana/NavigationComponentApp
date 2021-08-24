package com.nain.example.navigationcomponents.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nain.example.navigationcomponents.R;

public class FragmentSix extends Fragment {

    View view;
    Button nextButton;

    public FragmentSix() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_six, container, false);

        nextButton = view.findViewById(R.id.buttoxsxntwoID);
        nextButton.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_fragmentSix_to_fragmentNine);
        });

        return view;
    }
}