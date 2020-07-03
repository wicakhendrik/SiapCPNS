package com.nonamedev.siapcpns.ui.twkmodulkonsepidiologi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class twkmodulkonsepidiologiFragment extends Fragment {

    private twkmodulkonsepidiologiViewModel mViewModel;

    public static twkmodulkonsepidiologiFragment newInstance() {
        return new twkmodulkonsepidiologiFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_twkmodulkosepidiologi, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(twkmodulkonsepidiologiViewModel.class);
        // TODO: Use the ViewModel
    }

}

