package kr.co.bs.body;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.bs.form.MemberVO;

@Controller
@RequestMapping("/ajax")
public class ResBodyController {

	@ResponseBody
	@RequestMapping("/resBody.do")   //restBody.do=> res=>rest로 변경
	public String resStringBody() {
		return "ok, 성공";
	}
	@ResponseBody
	@RequestMapping("/resBody.json")
	public Map<String, String> resJsonBody(){
		Map<String, String> result = new HashMap<>();
		result.put("id", "hong");
		result.put("name", "홍길동");
		result.put("addr", "서울시 서초구");
		
		return result;
		
	}
	@ResponseBody
	@RequestMapping("/resVOBody.json")
	public MemberVO resJsonVOBody() {
		MemberVO vo = new MemberVO();
		vo.setId("hong");
		vo.setName("홍길동");
		vo.setPassword("1234");
		return vo;
	}
	@ResponseBody
	@RequestMapping("/resStringListBody.json")
	public List<String> resJsonStringListBody(){
		List<String> list = new ArrayList<>();
		for(int i=1; i<=4; i++) {
			list.add(String.valueOf(i));
		}
		return list;
		
	}
	
	@ResponseBody
	@RequestMapping("/resVOListBody.json")	
	public List<MemberVO> resJsonVOListBody() {
		List<MemberVO> list = new ArrayList<>();
		for (int i = 0; i < 4; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("hong");
			vo.setName("홍길동");
			vo.setPassword("1234");
			
			list.add(vo);
		}
		return list;
	}
}
