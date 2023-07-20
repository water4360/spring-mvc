package kr.co.mlec.form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/form")
@Controller
public class MemberController {

	//가입 폼으로 이동
	@RequestMapping("/joinForm.do")
	public String joinForm() {
		return "form/joinForm";
	}
	
	//폼입력값 전달
//	@RequestMapping("/join.do")
//	public String join(HttpServletRequest request) {
//		String id = request.getParameter("id");
//		String password = request.getParameter("password");
//		String name = request.getParameter("name");
//		
//		MemberVO mem = new MemberVO(id, password, name);
//		request.setAttribute("member", mem);
//		
//		return "form/memberInfo";
//	}
	
	//공유영역에 등록되는 이름은 클래스명 첫글자만 소문자&그대로!
//	@RequestMapping("/join.do")
//	public String join(MemberVO mem) {
//		return "form/memberInfo";
//	}
	
	//@ModelAttribute
	//하지만 공유영역에 내가 원하는 이름으로 등록하고 싶다면?
	@RequestMapping("/join.do")
	public String join(@ModelAttribute("member") MemberVO mem) {
		return "form/memberInfo";
	}
	
	
	
}
