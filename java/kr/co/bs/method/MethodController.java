package kr.co.bs.method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@RequestMapping(value="/method/method.do")
@Controller
public class MethodController {
	@RequestMapping(value="/method/method.do", method=RequestMethod.GET)
	public String callGet() {
		return "method/methodForm";
	}
	@RequestMapping(value="/method/method.do", method=RequestMethod.POST)
	public String callPost() {
		return "method/methodProcess";
		
	}

}
