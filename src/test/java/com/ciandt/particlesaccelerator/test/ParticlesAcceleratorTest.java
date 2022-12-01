package com.ciandt.particlesaccelerator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.ciandt.particlesaccelerator.ParticlesAccelerator;

public class ParticlesAcceleratorTest {
	
	private ParticlesAccelerator accelerator;

	@Test
	public void teste1() {
		assertEquals("1 1 0", accelerator.getDistribution(3, 1, 3));
	}

	@Test
	public void teste2() {
		assertEquals("10 61 59 61 9 0 0 0 0 0", accelerator.getDistribution(1_000_000_000, 100, 10));
	}

	@Test
	public void teste3() {
		assertEquals("10 61 59 61 9 0 0 0 0 0", accelerator.getDistribution(1_000_000_001, 100, 10));
	}

	@Test
	public void teste4() {
		assertEquals("1 0 0 0 1 0 1 2 0 0 0 2 0 0 2 0 2 1 2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0",
				accelerator.getDistribution(1000_000_000, 2, 50));
	}

	@Test
	public void teste5() {
		assertEquals("91 9 0 0 0 0 0 0 0 0", accelerator.getDistribution(1_000, 101, 10));
	}

	@Test
	public void teste6() {
		assertEquals(
				"10 2 8 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0",
				accelerator.getDistribution(1_000, 10, 101));
	}

}
