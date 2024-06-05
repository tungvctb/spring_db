package sopvn.demo.repositories;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;

import sopvn.demo.model.Category;

@Repository
public class CategoryRepository {
	private static CategoryRepository _instance = null;
	private JdbcTemplate db;
	
	public CategoryRepository() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		dataSource.setUrl("jdbc:sqlserver://DESKTOP-S0IBPHF:1433;databaseName=sample1;encrypt=true;trustServerCertificate=true;");
		dataSource.setUsername("sa");
		dataSource.setPassword("1");
		db=new JdbcTemplate(dataSource);
	}
	
	public static CategoryRepository Instance() {
		if(_instance == null) {
			_instance = new CategoryRepository();
		}
		return _instance;
	}
	
	class CategoryRowMapper implements RowMapper<Category>{
		@Override
		public Category mapRow(ResultSet rs, int rowNum) throws SQLException{
			Category category = new Category();
			category.setIdc(rs.getInt(Category.IDC));
			category.setName_c(rs.getString(Category.NAME_C));
			category.setActive(rs.getInt(Category.ACTIVE));
			return category;
		}
	}
	
	public List<Category> findAll(){
		return db.query("select * from category", new CategoryRowMapper());
	}
	
	public Category findById(int id) {
		return db.queryForObject("select * from category where idc=?", new CategoryRowMapper(), new Object[] {id});
	}
	
	public int deleteId(int id) {
		return db.update("delete from category where idc=?", new Object[] {id});
	}
	
	public int insert(Category newCategory) {
		return db.update("insert into category(name_c, active)" + "values(?, ?)", new Object[] { newCategory.getName_c(), newCategory.getActive()});
	}
	
	public int update(Category upCategory) {
		return db.update("update category" + "set name_c=?, active=?" + "where idc=?", new Object[] {upCategory.getName_c(), upCategory.getClass(), upCategory.getIdc()});
	}	
}
