package com.nonamedev.siapcpns.ui.tips;

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
import android.widget.ImageButton;

import com.nonamedev.siapcpns.R;

public class TipsFragment extends Fragment {

    private TipsViewModel tipsViewModel;

    public static TipsFragment newInstance() {
        return new TipsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tipsViewModel =
                ViewModelProviders.of(this).get(TipsViewModel.class);
        View tips = inflater.inflate(R.layout.fragment_tips, container, false);
        Button btn1 = (Button) tips.findViewById(R.id.buttontips1);
        Button btn2 = (Button) tips.findViewById(R.id.buttontips2);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_overview, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_trik, null));
        return tips;


    }
}
