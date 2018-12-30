package info.kblogics;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

@Configuration
@ComponentScan
public class EmployeeDAO extends JdbcDaoSupport {

	public EmployeeDAO(DataSource dataSource) {
		this.setDataSource(dataSource);
	}
	
	public void insertEmployee() {
		
		
			this.getJdbcTemplate().update(new PreparedStatementCreator() {
				
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					
					PreparedStatement preparedStatement = con.prepareStatement("insert into emp_tbl values(?,?,?)");
					Employee employee = new Employee(9,"pooja",10002d);
					preparedStatement.setInt(1, employee.getEno());
					preparedStatement.setString(2, employee.getName());
					preparedStatement.setDouble(3, employee.getSalary());
					return preparedStatement;
				}
			});
		}
	}

