package com.example.zaheeruddinbaber.ikl_api_21;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_IKL_Home_ContentList_Details extends Fragment {

    private TextView textViewTest;

    public Fragment_IKL_Home_ContentList_Details() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment__ikl__home__content_list__details, container, false);
        Bundle recievedBundle =getArguments();

        textViewTest = (TextView) v.findViewById(R.id.testkeyTextView);
        textViewTest.setText(String.valueOf(recievedBundle.getLong("key")));
        return v;
    }

}
