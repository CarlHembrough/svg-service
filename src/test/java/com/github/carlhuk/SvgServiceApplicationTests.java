package com.github.carlhuk;

import com.github.carlhuk.SvgServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SvgServiceApplication.class)
@WebAppConfiguration
public class SvgServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
