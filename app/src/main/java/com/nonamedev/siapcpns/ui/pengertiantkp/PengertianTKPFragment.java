package com.nonamedev.siapcpns.ui.pengertiantkp;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nonamedev.siapcpns.R;

public class PengertianTKPFragment extends Fragment {

    private PengertianTKPViewModel mViewModel;

    public static PengertianTKPFragment newInstance() {
        return new PengertianTKPFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pengertiantkp, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PengertianTKPViewModel.class);
        // TODO: Use the ViewModel
    }

}
