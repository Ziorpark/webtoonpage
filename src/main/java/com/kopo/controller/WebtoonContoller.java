package com.kopo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kopo.domain.Webtoon;
import com.kopo.domain.Webtoon2;
import com.kopo.service.WebtoonService;
//
//@Controller
//@RequestMapping("/webtoons")
//public class WebtoonContoller { //service 계층과 연동이 되어야 함
//	
//	@Autowired //(의존성주입)  즉, 스프링 컨테이너가 해당 어노테이션이 적용된 필드에 맞는 빈을 찾아서 자동으로 주입함.
//	//이렇게 의존성 주입을 통해 webtoonService 변수는 컨트롤러나 다른 컴포넌트에서 WebtoonService 인터페이스의 메서드를 호출할 수 있게 됩니다. 
//	//이를 통해 필요한 비즈니스 로직을 처리하거나 데이터를 조작하는 등의 작업을 수행할 수 있습니다.
//	private WebtoonService webtoonService;
//	
//	//@RequestMapping(value="/webtoons", method=RequestMethod.GET)
//	@GetMapping("/home")
//	public String requestWebtoonList(Model model) {
//		List<Webtoon> list = webtoonService.getAllwebtoonList();
//		model.addAttribute("webtoonList",list);
//		return "webtoons";
//	}
//
//	
//	@RequestMapping
//	//@GetMapping("/home")
//	public String requestAllWebtoonList(Model model) {
//		List<Webtoon> list = webtoonService.getAllwebtoonList();
//		model.addAttribute("webtoonList",list);
//		return "webtoons";
//	}
//	
//	//월요웹툰 확인하기
//	@GetMapping("/list")
//	public String requestAllWebtoonList2(Model model) {
//		List<Webtoon2> list = webtoonService.getAllwebtoonList2();
//		model.addAttribute("webttonList", list);
//		return "webtoons2";
//	}
//	
//	//상세보기
//	@GetMapping("/list/{titleId}")
//	public String requestWebtoonById(@PathVariable("titleId") String WebtoonId, Model model) {
//		Webtoon2 webtoonById = webtoonService.getWebtoonById(WebtoonId);
//		model.addAttribute("webtoon", webtoonById);
//		
//		return "webtoonId";
//	}
//			
//	
//	
//}
