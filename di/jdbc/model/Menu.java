package com.yaazli.springtraining.di.jdbc.model;


public class Menu {
	private Integer MenuID;
	private String MenuName;
	private Boolean MenuAvailability;
	

	public Menu() {
	}

	public Menu(Integer MenuID, String MenuName, Boolean MenuAvailability) {
		this.MenuID = MenuID;
		this.MenuName = MenuName;
		this.MenuAvailability = MenuAvailability;

	}

	public Integer getMenuID() {
		return MenuID;
	}

	public void setMenuID(Integer menuID) {
		MenuID = menuID;
	}

	public String getMenuName() {
		return MenuName;
	}

	public void setMenuName(String menuName) {
		MenuName = menuName;
	}

	public Boolean getMenuAvailability() {
		return MenuAvailability;
	}

	public void setMenuAvailability(Boolean menuAvailability) {
		MenuAvailability = menuAvailability;
	}

	
	@Override
	public String toString() {
		return "Menu{" + "MenuID=" + MenuID + ", MenuName='" + MenuName + '\'' + ", MenuAvailability='" + MenuAvailability + '\'' + '}';
	}
	
}