package kr.co.bs.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloController {
	@RequestMapping("/hello/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView("hello/hello");
		mav.addObject("msg", "hi 스프링 mvc~"); //공유영역에 올린다(물론 내가 아니고 spring이 한다.)
		return mav;
	}
}
