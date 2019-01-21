package com.Human.human;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ComparableTest.class, ComparatorTestByAge.class, ComparatorTestByIncome.class })
public class AllTests {

}
