package com.example.zaheeruddinbaber.ikl_api_21;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_IKL_Website extends Fragment {


    public Fragment_IKL_Website() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_ikl__website, container, false);
        //enabling web view//
        WebView mWebView = (WebView) v.findViewById(R.id.website_view);
        mWebView.loadUrl("https://ikl.ae");
        WebSettings web_settings = mWebView.getSettings();
        web_settings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient());
        return v;
    }
}