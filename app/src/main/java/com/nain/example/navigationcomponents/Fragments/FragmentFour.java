package com.nain.example.navigationcomponents.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.nain.example.navigationcomponents.R;

public class FragmentFour extends Fragment {

    View view;
    Button back, next;

    public FragmentFour() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_four, container, false);

        back = view.findViewById(R.id.backOneBtnID);
        next = view.findViewById(R.id.nextFourBzazaztnID);

        assert getArguments() != null;

        Toast.makeText(getContext(), "" + FragmentFourArgs.fromBundle(getArguments()).getName(), Toast.LENGTH_SHORT).show();

        next.setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_fragmentFour_to_fragmentSeven);
        });

        return view;
    }

}