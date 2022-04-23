package jUnitTestPackage;

// Maharaj Mahaadev
//E20CSE085
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ jUnitAddStrings.class, testAddNumbers.class })
public class AllTests {

}
