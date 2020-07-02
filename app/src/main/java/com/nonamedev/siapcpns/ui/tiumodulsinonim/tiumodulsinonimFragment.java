package com.nonamedev.siapcpns.ui.tiumodulsinonim;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class tiumodulsinonimFragment extends Fragment {

    private tiumodulsinonimViewModel mViewModel;

    public static tiumodulsinonimFragment newInstance() {
        return new tiumodulsinonimFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tiumodulsinonim, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(tiumodulsinonimViewModel.class);
        // TODO: Use the ViewModel
    }

}
