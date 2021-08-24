package com.nain.example.navigationcomponents.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.nain.example.navigationcomponents.R;

public class FragmentOne extends Fragment {

    View view;
    Button back, next;
    EditText editText;

    public FragmentOne() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_one, container, false);

        back = view.findViewById(R.id.backOneBtnID);
        next = view.findViewById(R.id.nextOneBtnID);
        editText = view.findViewById(R.id.androidEditTextID);


        next.setOnClickListener(v -> {

            if (!editText.getText().toString().isEmpty()) {
                NavDirections directions = FragmentOneDirections.actionFragmentOneToFragmentFour(
                        editText.getText().toString().trim());
                Navigation.findNavController(view).navigate(directions);
            } else {
                editText.setError("Enter Number");
            }
        });

        return view;
    }
}