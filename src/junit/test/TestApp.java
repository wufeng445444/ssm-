package junit.test;


import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:beans.xml")
public class TestApp {
	@Autowired
	private DataSource DataSource;
	@Test
	public void test01() throws SQLException {
		Connection connection = DataSource.getConnection();
		System.out.println(connection);
		
	}
}
