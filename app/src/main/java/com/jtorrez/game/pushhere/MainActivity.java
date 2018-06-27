package com.jtorrez.game.pushhere;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


/**
 *  Created by Justin Torrez on 6/22/2018
 */
public class MainActivity extends AppCompatActivity
    implements BottomNavigationView.OnNavigationItemSelectedListener {


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    BottomNavigationView navigation = findViewById(R.id.navigation);
    navigation.setOnNavigationItemSelectedListener(this);

    loadFragment(new PlayFragment());
  }

  @Override
  protected void onStart() {
    super.onStart();
  }

  @Override
  protected void onStop() {
    super.onStop();
  }

  private boolean loadFragment(Fragment fragment) {
    if(fragment != null) {

      getSupportFragmentManager()
          .beginTransaction()
          .replace(R.id.fragment_container, fragment)
          .commit();

      return true;
    }
    return false;
  }

  @Override
  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

    Fragment fragment = null;

    switch(menuItem.getItemId()) {

      case R.id.navigation_Instructions:
        fragment = new InstructionsFragment();
            break;

      case R.id.navigation_Play:
        fragment = new PlayFragment();
        break;

      case R.id.navigation_About:
        fragment = new AboutFragment();
        break;
    }

    return loadFragment(fragment);
  }

}
