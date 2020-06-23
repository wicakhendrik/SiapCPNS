package com.nonamedev.siapcpns.ui.pembahasantkp;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nonamedev.siapcpns.R;

public class PembahasanTKPFragment extends Fragment {

    private PembahasanTKPViewModel mViewModel;

    public static PembahasanTKPFragment newInstance() {
        return new PembahasanTKPFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_pembahasan_tkp, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PembahasanTKPViewModel.class);
        // TODO: Use the ViewModel
    }

}
