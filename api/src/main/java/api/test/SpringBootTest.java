package api.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTest {
	
	@RequestMapping("/test")
	public String JustTest() {
		return "This is just a test to see Spring Boot controller works!";
	}

}
