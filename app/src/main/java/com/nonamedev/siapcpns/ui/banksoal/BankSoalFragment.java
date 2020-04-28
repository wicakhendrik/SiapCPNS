package com.nonamedev.siapcpns.ui.banksoal;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nonamedev.siapcpns.R;

public class BankSoalFragment extends Fragment {

    private BankSoalViewModel mViewModel;

    public static BankSoalFragment newInstance() {
        return new BankSoalFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_bank_soal, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(BankSoalViewModel.class);
        // TODO: Use the ViewModel
    }

}
