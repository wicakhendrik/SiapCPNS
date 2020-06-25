package com.nonamedev.siapcpns.ui.siaranpersBKNpdf;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.nonamedev.siapcpns.R;
import com.nonamedev.siapcpns.ui.pengumumanpdf.PengumumanPDFFragment;

public class SiaranpersBKNpdfFragment extends Fragment {

    private SiaranpersBKNpdfViewModel mViewModel;

    public static SiaranpersBKNpdfFragment newInstance() {
        return new SiaranpersBKNpdfFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View siaranperspdf = inflater.inflate(R.layout.fragment_siaranpers_bknpdf, container, false);
        String pilihan = "1";

        if (pilihan.equals("1")) {
            WebView webView = (WebView) siaranperspdf.findViewById(R.id.webviewsiaranpers);
            WebSettings mWebSettings = webView.getSettings();
            mWebSettings.setJavaScriptEnabled(true);
            mWebSettings.setSupportZoom(false);
            mWebSettings.setAllowFileAccess(true);
            mWebSettings.setAllowContentAccess(true);

            webView.setWebViewClient(new PengumumanPDFFragment.MyBrowser());
            webView.loadUrl("https://drive.google.com/file/d/1g4bjK0wHdUqZHDcBC-WEQE0OHBmfAbNZ/view?usp=sharing");
        }
        return siaranperspdf;
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            view.loadData("Maaf INternet Anda tidak stabil", "text/html", "utf-8");
            super.onReceivedError(view, request, error);
        }
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SiaranpersBKNpdfViewModel.class);
        // TODO: Use the ViewModel
    }

}
