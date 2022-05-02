package com.defocs.xpense;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;


public class HomeFragment extends Fragment {

//    private RecyclerView recyclerView;
//
//    private String[] shopname = {
//            "Shop name 1",
//            "Shop name 2",
//            "Shop name 3",
//            "Shop name 4",
//            "Shop name 5",
//            "Shop name 6",
//            "Shop name 7",
//            "Shop name 8"
//    };
//    private String[] shopplace = {
//            "Chennai",
//            "Anna nagar",
//            "Trichy",
//            "coimbuture",
//            "Chinnasalem",
//            "Chinnasalem",
//            "Chinnasalem",
//            "Chinnasalem"
//    };



        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);



    }


}
