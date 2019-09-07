package com.hs.basis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * TODO
 *
 * @Author heshang.ink
 * @Date 2019/9/6 10:31
 */
@Slf4j
public class StringDemo {

	@Test
	public void testFinal() {
		String s = "Hello";
		s = "world";
		log.info(s);
	}
}
