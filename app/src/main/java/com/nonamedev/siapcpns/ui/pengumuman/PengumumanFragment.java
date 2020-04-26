package com.nonamedev.siapcpns.ui.pengumuman;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nonamedev.siapcpns.R;

public class PengumumanFragment extends Fragment {

    private PengumumanViewModel mViewModel;

    public static PengumumanFragment newInstance() {
        return new PengumumanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pengumuman, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PengumumanViewModel.class);
        // TODO: Use the ViewModel
    }

}
