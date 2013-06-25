package com.hao;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:config/spring/spring-*.xml", "file:WebRoot/WEB-INF/mvc-servlet.xml" })
public class BaseTest {

}
