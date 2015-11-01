package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String home() {
		return "Hello Home!";
	}

	@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
	public String hello(Model model, @PathVariable("name") String name) {
		model.addAttribute("name", name);

		return "hello";
	}
}