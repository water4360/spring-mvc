package kr.co.mlec.body;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import kr.co.mlec.form.MemberVO;

//@ResponseBody 대신에 하나로 합쳐서 쓰는게 바로?!
@RestController
@RequestMapping("/ajax")
public class ResBodyController {

//	@ResponseBody
	@RequestMapping("/resBody.do")
	public String resStringBody() {
		return "OK! 성공쓰!";
	}
	
//	@ResponseBody
	@RequestMapping("/resBody.json")
	public Map<String, String> resJsonBody() {
		Map<String, String> result = new HashMap<>();
		result.put("id", "hari");
		result.put("name", "하리");
		result.put("addr", "서울");
		return result;
	}
	
//	@ResponseBody
	@RequestMapping("/resVOBody.json")
	public MemberVO resJsonVOBody() {
		MemberVO vo = new MemberVO();
		vo.setId("hari");
		vo.setName("하리");
		vo.setPassword("1234");
		return vo;
	}
	
//	@ResponseBody
	@RequestMapping("/resStringListBody.json")
	public List<String> resJsonStringListBody() {
		List<String> list = new ArrayList<>();
		for(int i=1; i<4; i++) {
			list.add(String.valueOf(i));
		}
		return list;
	}
	
//	@ResponseBody
	@RequestMapping("/resVOListBody.json")
	public List<MemberVO> resJsonVOListBody() {
		List<MemberVO> list = new ArrayList<>();
		
		for(int i=1; i<4; i++) {
			MemberVO vo = new MemberVO();
			vo.setId("hari");
			vo.setName("이하리");
			vo.setPassword("1234");
			list.add(vo);
		}
		
		return list;
	}
	
}
