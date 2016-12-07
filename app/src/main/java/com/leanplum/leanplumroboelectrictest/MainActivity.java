package com.leanplum.leanplumroboelectrictest;

import android.os.Bundle;

import com.leanplum.Leanplum;
import com.leanplum.activities.LeanplumActivity;

public class MainActivity extends LeanplumActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Leanplum.setAppIdForDevelopmentMode("app_BWTRIgOs0OoevDfSsBtabRiGffu5wOFU3mkxIxA7NBs",
        "dev_Bx8i3Bbz1OJBTBAu63NIifr3UwWqUBU5OhHtywo58RY");
    Leanplum.start(this);
  }
}
