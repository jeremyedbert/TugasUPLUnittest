package id.ifundip.testing.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import id.ifundip.*;
import id.ifundip.calc.*;

@Suite
@SelectClasses({HelloTest.class, CalculatorTest.class})
public class TestSuiteIfUndipApp {

}
