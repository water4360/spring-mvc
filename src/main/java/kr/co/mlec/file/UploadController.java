package kr.co.mlec.file;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

public class UploadController {

	@Autowired
	ServletContext servletContext;
	
	
	/*
	 * 이렇게 만드는 게 싫어서
	 * spring-mvc.xml에서 <mvc:view-controller ...> 해놨음ㅋㅋ
	 * 컨트롤러조차 만들지 않아도 되도록!
	 * 
	@RequestMapping("/uploadForm.do")
	public String fileUploadForm() {
		return "file/fileUploadForm";
	}
	*/
}
