package com.nonamedev.siapcpns.ui.tiumodulperpangkatan;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class tiumodulperpangkatanFragment extends Fragment {

    private tiumodulperpangkatanViewModel mViewModel;

    public static tiumodulperpangkatanFragment newInstance() {
        return new tiumodulperpangkatanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tiumodulperpangkatan, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(tiumodulperpangkatanViewModel.class);
        // TODO: Use the ViewModel
    }

}

