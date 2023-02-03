package tests;

import lombok.extern.slf4j.Slf4j;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Slf4j
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
public class RunCucumberTests {
}
