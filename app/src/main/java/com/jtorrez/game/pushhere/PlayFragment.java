package com.jtorrez.game.pushhere;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 *  Created by Justin Torrez on 6/22/2018
 */
public class PlayFragment extends Fragment {

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    Toast toast = Toast.makeText(getActivity(), "TEST YOUR MIGHT", Toast.LENGTH_SHORT);
    TypedArray attributes = getContext().getTheme().obtainStyledAttributes(
        new int[] {android.R.attr.actionBarSize});
    toast.setGravity(Gravity.TOP,0, (int)attributes.getDimension(0, 0));
    toast.show();    return inflater.inflate(R.layout.fragment_play, null);
  }

}
