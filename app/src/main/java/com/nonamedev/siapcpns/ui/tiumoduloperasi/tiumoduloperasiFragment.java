package com.nonamedev.siapcpns.ui.tiumoduloperasi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class tiumoduloperasiFragment extends Fragment {

    private tiumoduloperasiViewModel mViewModel;

    public static tiumoduloperasiFragment newInstance() {
        return new tiumoduloperasiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tiumoduloperasi, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(tiumoduloperasiViewModel.class);
        // TODO: Use the ViewModel
    }

}
