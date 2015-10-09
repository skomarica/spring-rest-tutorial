package io.github.skomarica.bookmark;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import io.github.skomarica.bookmark.SpringRestTutorialApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringRestTutorialApplication.class)
@WebAppConfiguration
public class SpringRestTutorialApplicationTests {

	@Test
	public void contextLoads() {
	}

}
