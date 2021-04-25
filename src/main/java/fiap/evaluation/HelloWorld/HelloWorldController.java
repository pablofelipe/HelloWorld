package fiap.evaluation.HelloWorld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "v1/HelloWorldController")
public class HelloWorldController {
	@RequestMapping(value = "/hello",method = RequestMethod.GET)
	public String hello() {
		
		return "Hello World devops!";
	}
}
