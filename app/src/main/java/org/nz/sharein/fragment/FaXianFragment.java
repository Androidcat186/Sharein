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
public class FaXianFragment extends Fragment {
    public FaXianFragment() {
    }

    public static FaXianFragment newInstance() {

        Bundle args = new Bundle();

        FaXianFragment fragment = new FaXianFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.faxian_fragment, container, false);
    }
}
