package com.nonamedev.siapcpns.ui.tiumodulbentukakar;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.nonamedev.siapcpns.R;

public class tiumodulbentukakarFragment extends Fragment {

    private tiumodulbentukakarViewModel mViewModel;

    public static tiumodulbentukakarFragment newInstance() {
        return new tiumodulbentukakarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tiumodulbentukakar, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(tiumodulbentukakarViewModel.class);
        // TODO: Use the ViewModel
    }

}
