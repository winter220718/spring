package com.ezen.springmvc.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleUtilitiesTest {

	// ���� ��Ű�� ���ο� �ֱ� ������ import�� �ʿ� ����
	AppleUtilities util = new AppleUtilities();
	
	@Test
	public void test1() {
		util.setBasketSize(10);
		
		// ����ϴ� ���� 6�Դϴ�.
		assertEquals(6, util.getBasketCount(55));
	}
	
	@Test
	public void test2() {
		
		// ���� ���ܰ� �߻��� ���� ����ϴ� ���Դϴ�.
		assertThrows(BasketSizeTooSmallException.class , () -> {
			util.setBasketSize(5);
		});
		
	}

}
