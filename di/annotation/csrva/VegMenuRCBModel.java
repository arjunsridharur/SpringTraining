package com.yaazli.springtraining.di.annotation.csrva;

import org.springframework.stereotype.Service;

public class VegMenuRCBModel {

	public int menuId;
	public String menuName;

	//@Service("VegMenuRCB")

	public void getMenuDetails() {
		System.out.println(menuId);
		System.out.println(menuName);
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

}
