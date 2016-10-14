package com.njd.portal.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.njd.portal.service.ContentService;

@Controller
public class IndexController {
	@Autowired
	private ContentService contentService;
	@RequestMapping("/index")
	public String showIndex(Model model) throws ServletException, IOException {
		String adJson = contentService.getContentList();
		model.addAttribute("ad1", adJson);
		return "index";
	}
}
