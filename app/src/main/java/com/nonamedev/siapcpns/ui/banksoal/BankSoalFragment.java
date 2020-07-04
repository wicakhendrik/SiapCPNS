package com.nonamedev.siapcpns.ui.banksoal;

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

public class BankSoalFragment extends Fragment {

    public static int id;
    private BankSoalViewModel mViewModel;

    public static BankSoalFragment newInstance() {
        return new BankSoalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bank_soal, container, false);
        ImageButton btn1 = (ImageButton) root.findViewById(R.id.imageButtonTIU1);
        ImageButton btn2 = (ImageButton) root.findViewById(R.id.imageButtonTIU2);
        ImageButton btn3 = (ImageButton) root.findViewById(R.id.imageButtonTIU3);
        ImageButton btn4 = (ImageButton) root.findViewById(R.id.imageButtonTIU4);
        ImageButton btn5 = (ImageButton) root.findViewById(R.id.imageButtonTWK1);
        ImageButton btn6 = (ImageButton) root.findViewById(R.id.imageButtonTWK2);
        ImageButton btn7 = (ImageButton) root.findViewById(R.id.imageButtonTWK3);
        ImageButton btn8 = (ImageButton) root.findViewById(R.id.imageButtonTWK4);
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
                id = 2;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 3;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 4;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 5;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 6;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 7;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id = 8;
                Intent intent = new Intent(getActivity(), StartBankSoalActivity.class);
                startActivity(intent);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BankSoalViewModel.class);
        // TODO: Use the ViewModel
    }

}
