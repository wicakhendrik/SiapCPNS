package com.nonamedev.siapcpns.ui.twk;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.nonamedev.siapcpns.R;

public class TWKFragment extends Fragment {

    private TWKViewModel mViewModel;

    public static TWKFragment newInstance() {
        return new TWKFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View twk = inflater.inflate(R.layout.fragment_twk, container, false);
        Button btn1 = (Button) twk.findViewById(R.id.buttonTWKB1);
        Button btn2 = (Button) twk.findViewById(R.id.buttonTWKB2);
        Button btn3 = (Button) twk.findViewById(R.id.buttonTWKB3);

        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_twkmodulkonsepidiologi, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_twkmodulpancasilanilai, null));
        btn3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_twkmodulbutirpancasila, null));
        return twk;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TWKViewModel.class);
        // TODO: Use the ViewModel
    }

}
