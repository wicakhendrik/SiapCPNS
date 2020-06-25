package com.nonamedev.siapcpns.ui.pengumuman;

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

public class PengumumanFragment extends Fragment {

    private PengumumanViewModel mViewModel;

    public static PengumumanFragment newInstance() {
        return new PengumumanFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View pengumuman = inflater.inflate(R.layout.fragment_pengumuman, container, false);
        Button btn1 = (Button) pengumuman.findViewById(R.id.buttonpengumuman1);
        Button btn2 = (Button) pengumuman.findViewById(R.id.buttonpengumuman2);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_pengumuman_pdf, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_siaranpersbkn, null));
        return pengumuman;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(PengumumanViewModel.class);
        // TODO: Use the ViewModel
    }

}
