package com.nonamedev.siapcpns.ui.twkmodulpancasilanilai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class twkmodulpancasilanilaiFragment extends Fragment {

    private twkmodulpancasilanilaiViewModel mViewModel;

    public static twkmodulpancasilanilaiFragment newInstance() {
        return new twkmodulpancasilanilaiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_twkmodulpacasilanilai, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(twkmodulpancasilanilaiViewModel.class);
        // TODO: Use the ViewModel
    }

}

