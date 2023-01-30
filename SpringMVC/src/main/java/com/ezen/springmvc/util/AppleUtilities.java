package com.ezen.springmvc.util;

public class AppleUtilities {

	
	int basketSize;
	
	public void setBasketSize(int basketSize) throws BasketSizeTooSmallException {
		if(basketSize < 0) {
			throw new BasketSizeTooSmallException("바구니의 사이즈가 너무 작습니다.");
		}
		
		this.basketSize = basketSize;
	}
	
	
	public int getBasketCount(int apple) {
		return apple % basketSize == 0 ?
				apple / basketSize : apple / basketSize + 1;
	}
}
