package com.ithoughts.androidsamples.sample1.amessage;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ithoughts.androidsamples.sample1.amessage.databinding.FragmentMainpageBinding;

import java.util.Date;
import java.util.LinkedList;
import java.util.Random;

public class MainPageFragment extends Fragment {

    private FragmentMainpageBinding mainpageBinding;
    private static final String ARG_PARAM1 = "param1";
    private int which;
    public static final int CHATS = 0,GROUPS = 1,STATUS = 2,CALLS = 3;

    private MainPageFragment(){

    }

    public static MainPageFragment getInstance(int param) {
        MainPageFragment mainPageFragment = new MainPageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1,param);
        mainPageFragment.setArguments(args);
        return mainPageFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            which = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mainpageBinding = FragmentMainpageBinding.inflate(inflater,container,false);
        return mainpageBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView host = mainpageBinding.recyclerview;
        host.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
        PersonAdapter personAdapter = new PersonAdapter(which);
        host.setAdapter(personAdapter);
    }
}
