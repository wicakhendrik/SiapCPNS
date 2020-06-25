package com.nonamedev.siapcpns.ui.pengumumanpdf;

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

public class PengumumanPDFFragment extends Fragment {

    private PengumumanPDFViewModel mViewModel;

    public static PengumumanPDFFragment newInstance() {
        return new PengumumanPDFFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View pengumumanpdf = inflater.inflate(R.layout.fragment_pengumuman_pdf, container, false);
        String pilihan = "1";

        if (pilihan.equals("1")) {
            WebView webView = (WebView) pengumumanpdf.findViewById(R.id.webviewpengumuman);
            WebSettings mWebSettings = webView.getSettings();
            mWebSettings.setJavaScriptEnabled(true);
            mWebSettings.setSupportZoom(false);
            mWebSettings.setAllowFileAccess(true);
            mWebSettings.setAllowContentAccess(true);

            webView.setWebViewClient(new MyBrowser());
            webView.loadUrl("https://drive.google.com/file/d/17Oo0QPS1lQPCZcIIE_oYjSBftALnUg8e/view");
        }
        return pengumumanpdf;
    }

    public static class MyBrowser extends WebViewClient {
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
        mViewModel = ViewModelProviders.of(this).get(PengumumanPDFViewModel.class);
        // TODO: Use the ViewModel
    }

}
