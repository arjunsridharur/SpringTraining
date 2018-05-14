package com.yaazli.springtraining.di.jdbc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.yaazli.springtraining.di.jdbc.model.Menu;
import com.yaazli.springtraining.di.jdbc.config.AppConfiguration;
import com.yaazli.springtraining.di.jdbc.dao.MenuDAO;

public class MenuMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

		MenuDAO menuDAO = context.getBean(MenuDAO.class);

		System.out.println("List of person is:");

		for (Menu m : menuDAO.getAllMenus()) {
			System.out.println(m);
		}
        //=======================================================
		System.out.println("\nGet menu with Menu ID 2");

		Menu menuByMenuID = menuDAO.getMenuById(2);
		System.out.println(menuByMenuID);
        //================================================================
		System.out.println("\nCreating menu: ");
		Menu menu = new Menu(8,"Vada Pav", true);
		System.out.println(menu);
		menuDAO.createMenu(menu);
		System.out.println("\nList of person is:");

		for (Menu m : menuDAO.getAllMenus()) {
			System.out.println(m);
		}
		
		//================================================================
		
		System.out.println("\nDeleting menu with ID 2");
		menuDAO.deleteMenu(menuByMenuID);
		
		//================================================================

		System.out.println("\nUpdate menu with ID 4");

		Menu mmenu = menuDAO.getMenuById(4);
		mmenu.setMenuName("Burger");
		menuDAO.updateMenu(mmenu);

		System.out.println("\nList of person is:");
		for (Menu m : menuDAO.getAllMenus()) {
			System.out.println(m);
		}

		context.close();
	}
}
