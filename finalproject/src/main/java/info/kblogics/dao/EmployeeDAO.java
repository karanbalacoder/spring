package info.kblogics.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import info.kblogics.entity.Employee;

@Repository
public class EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insertEmployee(final Employee employee) {
		jdbcTemplate.update(new PreparedStatementCreator() {

			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement prepareStatement = con.prepareStatement("insert into emp_tbl values(?,?,?)");
				prepareStatement.setInt(1, employee.getEno());
				prepareStatement.setString(2, employee.getName());
				prepareStatement.setDouble(3, employee.getSalary());

				return prepareStatement;
			}
		});
	}

	public List<Employee> searchEmp(Integer eno) {
		String sql = "select * from emp_tbl where eno=" + eno;
		return jdbcTemplate.query(sql, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

				Employee employee = new Employee();
				employee.setEno(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setSalary(rs.getDouble(3));
				return employee;

			}
		});

	}

}
