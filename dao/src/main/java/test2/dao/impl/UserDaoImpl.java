package test2.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



/*
// classic JdbcTemplate-style...
private JdbcTemplate jdbcTemplate;

public void setDataSource(DataSource dataSource) {
    this.jdbcTemplate = new JdbcTemplate(dataSource);
}

public Actor findActor(String specialty, int age) {

    String sql = "select id, first_name, last_name from T_ACTOR" + 
            " where specialty = ? and age = ?";
    
    RowMapper<Actor> mapper = new RowMapper<Actor>() {
        public Actor mapRow(ResultSet rs, int rowNum) throws SQLException {
            Actor actor = new Actor();
            actor.setId(rs.getLong("id"));
            actor.setFirstName(rs.getString("first_name"));
            actor.setLastName(rs.getString("last_name"));
            return actor;
        }
    };

    
    // notice the wrapping up of the argumenta in an array
    return (Actor) jdbcTemplate.queryForObject(sql, new Object[] {specialty, age}, mapper);
 */
import test2.dao.UserDao;
@Repository
public class UserDaoImpl implements UserDao{
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public String getUserByUAndP(String username) {
		String password = this.jdbcTemplate.queryForObject(
		        "select password from register where username=? ", 
		        new Object[]{username}, String.class);
		return password;
		
	}
	

}
