package test;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:config/applicationContext*.xml" })
public class BaseTest extends AbstractJUnit4SpringContextTests {
	public BaseTest() {
		PropertyConfigurator.configure(BaseTest.class.getClassLoader()
				.getResource("config/log4j.properties"));
	}

}
