package com.yaazli.springtraining.di.jdbc.dao;

import java.util.List;

import com.yaazli.springtraining.di.jdbc.model.Menu;



public interface MenuDAO {
	Menu getMenuById(Integer MenuID);

	List<Menu> getAllMenus();

	boolean deleteMenu(Menu menu);

	boolean updateMenu(Menu menu);

	boolean createMenu(Menu menu);
}