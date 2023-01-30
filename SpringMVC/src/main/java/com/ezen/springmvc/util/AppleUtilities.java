package com.ezen.springmvc.util;

public class AppleUtilities {

	
	Integer basketSize;
	
	public void setBasketSize(int basketSize) {
		if(basketSize < 0) {
			throw new BasketSizeTooSmallException("�ٱ����� ����� �ʹ� �۽��ϴ�.");
		}
		
		this.basketSize = basketSize;
	}
	
	
	public int getBasketCount(int apple) {
		if (basketSize == null) {
			
			throw new BasketSizeUnsetException("basket size is not initialized");
		}
		return apple % basketSize == 0 ?
				apple / basketSize : apple / basketSize + 1;
	}
}
