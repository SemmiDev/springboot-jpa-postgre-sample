package com.sammidev.demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(
		executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD,
		scripts = {
				"/data/course.sql",
				"/data/student.sql",
				"/data/batch.sql"
		}
)
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

}
