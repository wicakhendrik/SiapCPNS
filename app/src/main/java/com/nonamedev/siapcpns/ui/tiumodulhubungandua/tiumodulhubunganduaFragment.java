package com.nonamedev.siapcpns.ui.tiumodulhubungandua;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class tiumodulhubunganduaFragment extends Fragment {

    private tiumodulhubunganduaViewModel mViewModel;

    public static tiumodulhubunganduaFragment newInstance() {
        return new tiumodulhubunganduaFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tiumodulhubungandua, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(tiumodulhubunganduaViewModel.class);
        // TODO: Use the ViewModel
    }

}

