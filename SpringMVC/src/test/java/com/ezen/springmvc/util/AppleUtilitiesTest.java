package com.ezen.springmvc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleUtilitiesTest {

	// 같은 패키지 내부에 있기 때문에 import가 필요 없다
	AppleUtilities util = new AppleUtilities();
	
	@Test
	public void test1() {
		util.setBasketSize(10);
		
		// 기대하는 값은 6입니다.
		assertEquals(6, util.getBasketCount(55));
	}
	
	@Test
	public void test2() {
		
		// 나는 예외가 발생할 것을 기대하는 중입니다.
		assertThrows(BasketSizeTooSmallException.class , () -> {
			util.setBasketSize(5);
		});
		
	}

}
