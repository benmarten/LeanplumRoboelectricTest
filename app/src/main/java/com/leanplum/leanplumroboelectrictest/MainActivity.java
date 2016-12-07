package com.leanplum.leanplumroboelectrictest;

import android.os.Bundle;
import android.util.Log;

import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.activities.LeanplumActivity;
import com.leanplum.callbacks.ActionCallback;

import java.util.HashMap;

public class MainActivity extends LeanplumActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Leanplum.setAppIdForDevelopmentMode("app_BWTRIgOs0OoevDfSsBtabRiGffu5wOFU3mkxIxA7NBs", "dev_Bx8i3Bbz1OJBTBAu63NIifr3UwWqUBU5OhHtywo58RY");
    Leanplum.start(this);
    Leanplum.defineAction("test", Leanplum.ACTION_KIND_MESSAGE,
        new ActionArgs().with("ACCEPT_ACTION", new HashMap<String, String>() {{
          put("a", "ACCEPT_ACTION");
        }}), new ActionCallback() {
          @Override
          public boolean onResponse(ActionContext actionContext) {
            Log.d("LP", actionContext.toString());
            return false;
          }
        });

  }
}
