package com.nonamedev.siapcpns.ui.tkp;

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

public class TKPFragment extends Fragment {

    private TKPViewModel mViewModel;

    public static TKPFragment newInstance() {
        return new TKPFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View tkp = inflater.inflate(R.layout.fragment_tkp, container, false);
        Button btn1 = (Button) tkp.findViewById(R.id.buttonTKPB1);
        Button btn2 = (Button) tkp.findViewById(R.id.buttonTKPB2);
        Button btn3 = (Button) tkp.findViewById(R.id.buttonTKPB3);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_pengertianTKP, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tips_tkp, null));
        btn3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_pembahasan_tkp, null));
        return tkp;

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TKPViewModel.class);
        // TODO: Use the ViewModel
    }

}
