package com.jci.myproject;

import com.jci.myproject.client.MyGWTProject8Test;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class MyGWTProject8Suite extends GWTTestSuite {
	public static Test suite() {
		TestSuite suite = new TestSuite("Tests for MyGWTProject8");
		suite.addTestSuite(MyGWTProject8Test.class);
		return suite;
	}
}
