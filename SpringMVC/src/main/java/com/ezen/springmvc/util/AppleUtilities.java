package com.ezen.springmvc.util;

public class AppleUtilities {

	
	int basketSize;
	
	public void setBasketSize(int basketSize) throws BasketSizeTooSmallException {
		if(basketSize < 0) {
			throw new BasketSizeTooSmallException("�ٱ����� ����� �ʹ� �۽��ϴ�.");
		}
		
		this.basketSize = basketSize;
	}
	
	
	public int getBasketCount(int apple) {
		return apple % basketSize == 0 ?
				apple / basketSize : apple / basketSize + 1;
	}
}
