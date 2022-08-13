package com.mob.welups.view.transfer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.mob.welups.view.transfer.TransferReceiveFrag;
import com.mob.welups.view.transfer.TransferSendFrag;

public class TransferAdapter extends FragmentStateAdapter {

    public TransferAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new TransferSendFrag();
            case 1:
                return new TransferReceiveFrag();
            default:
                return new TransferSendFrag();
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
