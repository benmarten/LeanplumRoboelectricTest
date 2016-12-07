package com.leanplum.leanplumroboelectrictest;

import android.content.Context;

import com.leanplum.Leanplum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
@Config(
    constants = BuildConfig.class,
    sdk = 21
)
public class LeanplumUnitTest {
  @Test
  public void testLeanplum() {
    Leanplum.start(RuntimeEnvironment.application);
    Context context = Leanplum.getContext();
    assertNotNull(context);
  }
}