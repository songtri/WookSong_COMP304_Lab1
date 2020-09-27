package com.example.wooksong_comp304_lab1_ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TopFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TopFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    public TopFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment TopFragment.
     */
    public static TopFragment newInstance(String param1, String param2) {
        TopFragment fragment = new TopFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.recyclerview_fragment_top);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        ArrayList<String> activityList = new ArrayList<String>();
        activityList.add(getString(R.string.ai_activity_name));
        activityList.add(getString(R.string.vr_activity_name));
        adapter = new RecyclerAdapter(activityList);
        recyclerView.setAdapter(adapter);
        ((RecyclerAdapter)adapter).setOnItemClickListener(new RecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(String text) {
                Intent intent = null;
                if(text == getString(R.string.ai_activity_name))
                    intent = new Intent(getContext(), AIActivity.class);
                else if(text == getString(R.string.vr_activity_name))
                    intent = new Intent(getContext(), VRActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }

        CharSequence seq = getString(R.string.fragment_top_name) + " " + getString(R.string.lifecycle_status_oncreate);
        Toast.makeText(getContext(), seq, Toast.LENGTH_SHORT).show();
    }


    @Override
    public void onStart() {
        super.onStart();
        CharSequence seq = getString(R.string.fragment_top_name) + " " + getString(R.string.lifecycle_status_onstart);
        Toast.makeText(getContext(), seq, Toast.LENGTH_SHORT).show();
    }
}