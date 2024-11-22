package com.unittest;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({AppTest.class, KorokSeedGuideTest.class, GameBuildingsTest.class})

public class suite {
    
}
