package org.nz.sharein.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.support.v4.app.Fragment;
import android.view.ViewGroup;

import org.nz.sharein.R;

/**
 * Created by chenzm on 2015/12/10.
 */
public class JingXuanFragment extends Fragment {
    public JingXuanFragment() {
    }

    public static JingXuanFragment newInstance() {

        Bundle args = new Bundle();

        JingXuanFragment fragment = new JingXuanFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.jingxuan_fragment, container, false);
    }
}
