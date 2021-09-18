package com.ithoughts.androidsamples.sample1.amessage;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PagesAdapter extends FragmentStateAdapter {
    public PagesAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public MainPageFragment createFragment(int position) {
        return MainPageFragment.getInstance(position);
    }

    @Override
    public int getItemCount() {
        return MainActivity.PAGES_COUNT;
    }
}
