package com.nonamedev.siapcpns.ui.siaranpersBKN;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.nonamedev.siapcpns.R;

public class SiaranPersBKNFragment extends Fragment {

    private SiaranPersBKNViewModel mViewModel;

    public static SiaranPersBKNFragment newInstance() {
        return new SiaranPersBKNFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View siaranpers = inflater.inflate(R.layout.fragment_siaranpers_bkn, container, false);
        Button btn1 = (Button) siaranpers.findViewById(R.id.nav_btnsiaranpers);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_siaranpers_bknpdf, null));
        return siaranpers;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SiaranPersBKNViewModel.class);
        // TODO: Use the ViewModel
    }

}
