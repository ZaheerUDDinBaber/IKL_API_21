package com.example.zaheeruddinbaber.ikl_api_21;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_IKL_Home extends Fragment{

    Toolbar homefragment_toolbar;
    ListView homefragment_listview;

    public Fragment_IKL_Home() {
        // Required empty public constructor
    }  // cunstroctor closing

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_ikl__home, container, false);
        ArrayAdapter<String> ArrayAdaptor = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.home_fragment_content_list));

        ListView showListDataOnTemplate = (ListView) v.findViewById(R.id.homefragment_content_listview);
        showListDataOnTemplate.setAdapter(ArrayAdaptor); // start showing list on phone

        // function to check if list item is clicked
        homefragment_listview =(ListView)  v.findViewById(R.id.homefragment_content_listview);

        homefragment_listview.setOnItemClickListener(new ListView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                String strID = Long.toString(id); // for testing on console
                Log.d("Selected ID", strID); // for testing on console

                Fragment switchFragment = new Fragment_IKL_Home_ContentList_Details(); //New Fragment

                Bundle bundleForSendingId=new Bundle(); // LOCAL VARIABLE FOR SHARING ID TO NEXT ACTIVITY
                bundleForSendingId.putLong("key",id); //  setting up bundle.
                switchFragment.setArguments(bundleForSendingId); //data being send to SecondFragment

                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.home, switchFragment); // give your fragment container id in first parameter
                transaction.addToBackStack(null);  // if written, this transaction will be added to backstack

                transaction.commit();

            }
        });
        // cut area closing
        return  v;

    } // on create closing


}

