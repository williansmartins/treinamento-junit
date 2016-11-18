package com.williansmartins.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  TestFeatureLogin.class,
  TestFeatureLogout.class,
})

public class FeatureTestSuite {
  // the class remains empty,
  // used only as a holder for the above annotations
}