package com.nonamedev.siapcpns.ui.tiu;

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

public class TIUFragment extends Fragment {

    private TIUViewModel mViewModel;

    public static TIUFragment newInstance() {
        return new TIUFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View tiu = inflater.inflate(R.layout.fragment_tiu, container, false);
        Button btn1 = (Button) tiu.findViewById(R.id.buttontiu1);
        Button btn2 = (Button) tiu.findViewById(R.id.buttontiu2);
        Button btn3 = (Button) tiu.findViewById(R.id.buttontiu3);
        Button btn4 = (Button) tiu.findViewById(R.id.buttontiu4);
        Button btn5 = (Button) tiu.findViewById(R.id.buttontiu5);
        Button btn6 = (Button) tiu.findViewById(R.id.buttontiu6);
        Button btn7 = (Button) tiu.findViewById(R.id.buttontiu7);
        Button btn8 = (Button) tiu.findViewById(R.id.buttontiu8);
        Button btn9 = (Button) tiu.findViewById(R.id.buttontiu9);
        Button btn10 = (Button) tiu.findViewById(R.id.buttontiu10);
        Button btn11 = (Button) tiu.findViewById(R.id.buttontiu11);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulsinonim, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulanalogi, null));
        btn3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulcspadanankata, null));
        btn4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumoduloperasi, null));
        btn5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulpecahan, null));
        btn6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumoduleksponen, null));
        btn7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulakar, null));
        btn8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulbentukakar, null));
        btn9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulaljabar, null));
        btn10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulperpangkatan, null));
        btn11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiumodulhubungandua, null));
        return tiu;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(TIUViewModel.class);
        // TODO: Use the ViewModel
    }

}
