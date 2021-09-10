package com.ithoughts.androidsamples.sample1.amessage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.ithoughts.androidsamples.sample1.amessage.databinding.FragmentMainpageBinding;

public class MainPageFragment extends Fragment {

    private FragmentMainpageBinding mainpageBinding;
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
    }
}
