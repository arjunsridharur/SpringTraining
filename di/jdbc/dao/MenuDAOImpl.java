package com.yaazli.springtraining.di.jdbc.dao;


import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.yaazli.springtraining.di.jdbc.model.Menu;
import com.yaazli.springtraining.di.jdbc.model.MenuMapper;

@Component
public class MenuDAOImpl implements MenuDAO {

	JdbcTemplate jdbcTemplate;

	private final String SQL_FIND_Menu = "select * from menu where MenuID = ?";
	private final String SQL_DELETE_Menu = "delete from menu where MenuID = ?";
	private final String SQL_UPDATE_Menu = "update people set MenuName = ?, MenuAvailability = ?";
	private final String SQL_GET_ALL = "select * from menu";
	private final String SQL_INSERT_Menu = "insert into menu(MenuID, MenuName, MenuAvailability) values(?,?,?)";

	@Autowired
	public MenuDAOImpl(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public Menu getMenuById(Integer MenuID) {
		return jdbcTemplate.queryForObject(SQL_FIND_Menu, new Object[] { MenuID }, new MenuMapper());
	}

	public List<Menu> getAllMenus() {
		return jdbcTemplate.query(SQL_GET_ALL, new MenuMapper());
	}

	public boolean deleteMenu(Menu Menu) {
		return jdbcTemplate.update(SQL_DELETE_Menu, Menu.getMenuID()) > 0;
	}

	public boolean updateMenu(Menu Menu) {
		return jdbcTemplate.update(SQL_UPDATE_Menu, Menu.getMenuName(), Menu.getMenuAvailability(), Menu.getMenuID()) > 0;
	}

	public boolean createMenu(Menu Menu) {
		return jdbcTemplate.update(SQL_INSERT_Menu, Menu.getMenuID(), Menu.getMenuName(), Menu.getMenuAvailability()) > 0;
	}
}