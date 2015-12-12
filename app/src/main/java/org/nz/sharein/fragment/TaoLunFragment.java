package org.nz.sharein.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.nz.sharein.R;

/**
 * Created by chenzm on 2015/12/10.
 */
public class TaoLunFragment extends Fragment {
    public TaoLunFragment() {
    }

    public static TaoLunFragment newInstance() {

        Bundle args = new Bundle();

        TaoLunFragment fragment = new TaoLunFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.taolun_fragment, container, false);
    }
}
