package org.mvpigs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloControlller {
	
	@RequestMapping(path="/")
	@ResponseBody
	public String saluda() {
		return "hi :P";
	}
}