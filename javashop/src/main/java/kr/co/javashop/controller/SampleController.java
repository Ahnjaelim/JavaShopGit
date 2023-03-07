package kr.co.javashop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class SampleController {

	@GetMapping("/sample")
	public void hello(Model model) {
		log.info("Sample Controller Test");
		model.addAttribute("msg", "HELLO WORLD");
	}
}
