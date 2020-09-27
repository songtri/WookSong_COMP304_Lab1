package com.example.wooksong_comp304_lab1_ex1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomFragment extends Fragment {

    public BottomFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BottomFragment.
     */
    public static BottomFragment newInstance() {
        BottomFragment fragment = new BottomFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

        ShowToastMessage(getString(R.string.lifecycle_status_oncreate));
    }

    @Override
    public void onStart() {
        super.onStart();
        ShowToastMessage(getString(R.string.lifecycle_status_onstart));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom, container, false);
    }

    private void ShowToastMessage(String statusText) {
        CharSequence seq = getString(R.string.status_toastmessage_fragment, getString(R.string.fragment_bottom_name), statusText);
        Toast.makeText(getContext(), seq, Toast.LENGTH_SHORT).show();
    }
}