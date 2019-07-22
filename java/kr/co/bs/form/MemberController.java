package kr.co.bs.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/form")
@Controller
public class MemberController {

	@RequestMapping("/joinForm.do")			
	public String joinForm() {
		return "form/joinForm";
	}
	
	//  http://localhost:9999/spring-mvc/form/join.do?id=hong&password=1234&name=홍길동
	@RequestMapping("/join.do")  //xml. forward. include. redirect : spring-mvc/ 까지.. 일반적 : localhost:9999/까지의 ...
	public String join(MemberVO member, Model model) {
		System.out.println("Id:"+member.getId());
		System.out.println("password:"+member.getPassword());
		System.out.println("Name:"+member.getName());
		
		model.addAttribute("msg","가입이 완료되었습니다.");
		return "form/joinForm";
		
	}
	
	/*@RequestMapping("/join.do")
	public ModelAndView join(MemberVO member) {
		ModelAndView mav = new ModelAndView("form/memberInfo");
		mav.addObject("member", member);
		mav.setViewName("form/memberInfo");
		return mav;
	}*/
	
	
	
	/*@RequestMapping("/join.do")
	public String join(@ModelAttribute MemberVO member) {
		
		System.out.println("id : " + member.getId());
		System.out.println("password : " + member.getPassword());
		System.out.println("name : " + member.getName());
		
		return "form/memberInfo";
	}
*/	
	/*
	@RequestMapping("/join.do")
	public String join(@RequestParam("id") String id,
						@RequestParam("password") String password, 
						@RequestParam("name") String name,
						HttpServletRequest request) {
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		
		request.setAttribute("member", member);
		
		return "form/memberInfo";
	}
	*/
	
	/*
	@RequestMapping("/join.do")
	public String join(HttpServletRequest request) {
		
		String id 		= request.getParameter("id");
		String password = request.getParameter("password");
		String name 	= request.getParameter("name");
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPassword(password);
		member.setName(name);
		
		request.setAttribute("member", member);
		
		return "form/memberInfo";
	}
	*/
}












