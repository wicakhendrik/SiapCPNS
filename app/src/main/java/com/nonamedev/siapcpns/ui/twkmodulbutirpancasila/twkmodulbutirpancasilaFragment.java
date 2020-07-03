package com.nonamedev.siapcpns.ui.twkmodulbutirpancasila;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class twkmodulbutirpancasilaFragment extends Fragment {

    private twkmodulbutirpancasilaViewModel mViewModel;

    public static twkmodulbutirpancasilaFragment newInstance() {
        return new twkmodulbutirpancasilaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_twkmodulbutirpancasila, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(twkmodulbutirpancasilaViewModel.class);
        // TODO: Use the ViewModel
    }

}

