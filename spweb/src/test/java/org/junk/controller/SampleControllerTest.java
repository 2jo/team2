package org.junk.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SampleControllerTest {

	@Autowired
	private SampleController sample;
	
	@Test
	public void test() {
		sample.doA();
	}

}
