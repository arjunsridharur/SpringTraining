package com.yaazli.springtraining.di.jdbc.model;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MenuMapper implements RowMapper<Menu> {

	public Menu mapRow(ResultSet resultSet, int i) throws SQLException {

		Menu menu = new Menu();
		menu.setMenuID(resultSet.getInt("menuID"));
		menu.setMenuName(resultSet.getString("menuName"));
		menu.setMenuAvailability(resultSet.getBoolean("menuAvailability"));
		
		
		return menu;
	}
}