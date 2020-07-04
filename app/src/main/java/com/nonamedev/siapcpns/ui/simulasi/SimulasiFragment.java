package com.nonamedev.siapcpns.ui.simulasi;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.nonamedev.siapcpns.R;
import com.nonamedev.siapcpns.StartBankSoalActivity;

public class SimulasiFragment extends Fragment {

    private SimulasiViewModel mViewModel;
    public static int id;
    public static SimulasiFragment newInstance() {
        return new SimulasiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_simulasi, container, false);
        ImageButton btn1 = (ImageButton) root.findViewById(R.id.imageButton1Sim);
        ImageButton btn2 = (ImageButton) root.findViewById(R.id.imageButton2Sim);
        ImageButton btn3 = (ImageButton) root.findViewById(R.id.imageButton3Sim);
        ImageButton btn4 = (ImageButton) root.findViewById(R.id.imageButton4Sim);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 1;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 3;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 5;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 7;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SimulasiViewModel.class);
        // TODO: Use the ViewModel
    }

}
