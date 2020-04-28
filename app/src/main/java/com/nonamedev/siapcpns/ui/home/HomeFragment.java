package com.nonamedev.siapcpns.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.Navigation;

import com.nonamedev.siapcpns.AboutActivity;
import com.nonamedev.siapcpns.R;
import com.nonamedev.siapcpns.SettingsActivity;
import com.nonamedev.siapcpns.ui.tahapan.TahapanFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton btnTahapanActivity = (ImageButton) root.findViewById(R.id.imageButton1);
        btnTahapanActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment= new TahapanFragment();
                FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.drawer_layout, fragment); // fragmen container id in first parameter is the  container(Main layout id) of Activity
                transaction.commit();
            }
        });
        ImageButton btn1 = (ImageButton) root.findViewById(R.id.imageButton1);
        ImageButton btn2 = (ImageButton) root.findViewById(R.id.imageButton2);
        ImageButton btn3 = (ImageButton) root.findViewById(R.id.imageButton3);
        ImageButton btn4 = (ImageButton) root.findViewById(R.id.imageButton4);
        ImageButton btn5 = (ImageButton) root.findViewById(R.id.imageButton5);
        ImageButton btn6 = (ImageButton) root.findViewById(R.id.imageButton6);
        ImageButton btn7 = (ImageButton) root.findViewById(R.id.imageButton7);
        ImageButton btn8 = (ImageButton) root.findViewById(R.id.imageButton8);
        ImageButton btn9 = (ImageButton) root.findViewById(R.id.imageButton9);
        ImageButton btn10 = (ImageButton) root.findViewById(R.id.imageButton10);
        ImageButton btn11 = (ImageButton) root.findViewById(R.id.imageButton11);
        Button btn12 = (Button) root.findViewById(R.id.button);
        Button btn13 = (Button) root.findViewById(R.id.button2);
        btn1.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tahapan, null));
        btn2.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_pengumuman, null));
        btn3.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_alur, null));
        btn4.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_ambangbatas, null));
        btn5.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_faq, null));
        btn6.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tips, null));
        btn7.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tiu, null));
        btn8.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_twk, null));
        btn9.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_tkp, null));
        btn10.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_banksoal, null));
        btn11.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_simulasi, null));
        btn12.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.nav_petunjuk, null));
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.cpns.vilo"));
                startActivity(intent);
            }
        });
        return root;
    }

}
