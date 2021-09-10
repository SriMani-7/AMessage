package com.ithoughts.androidsamples.sample1.amessage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ithoughts.androidsamples.sample1.amessage.databinding.FragmentMainpageBinding;

import java.util.LinkedList;

public class MainPageFragment extends Fragment {

    private FragmentMainpageBinding mainpageBinding;

    private MainPageFragment(){

    }

    public static MainPageFragment getInstance() {
        return new MainPageFragment();
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

        LinkedList<MPerson> people = new LinkedList<>();
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        people.add(new MPerson("ABC","Hi"));
        PersonAdapter personAdapter = new PersonAdapter(people);
        host.setAdapter(personAdapter);
    }
}
