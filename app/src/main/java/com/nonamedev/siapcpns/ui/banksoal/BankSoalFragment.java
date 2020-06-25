package com.nonamedev.siapcpns.ui.banksoal;

import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.nonamedev.siapcpns.R;
import com.nonamedev.siapcpns.TIUPaketAActivity;

public class BankSoalFragment extends Fragment {

    private BankSoalViewModel mViewModel;

    public static BankSoalFragment newInstance() {
        return new BankSoalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bank_soal, container, false);
        ImageButton btn1 = (ImageButton) root.findViewById(R.id.imageButtonTIU1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TIUPaketAActivity.class);
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
