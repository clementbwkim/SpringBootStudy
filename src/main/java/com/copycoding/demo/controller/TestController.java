package com.copycoding.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.copycoding.demo.service.LoginService;
import com.copycoding.demo.vo.EnterpriseMemberVO;

@RestController
public class TestController {

		@Autowired
		LoginService loginService;
		
		@RequestMapping("/member/")
		public @ResponseBody List<EnterpriseMemberVO> selectListEnterpriseMember 
		(@ModelAttribute("searchVO") EnterpriseMemberVO enterpriseMemberVO, ModelMap model)
		throws Exception{
			System.out.println(" <<< controller >>>");
			List<EnterpriseMemberVO> eList = loginService.selectListEnterpriseMember(enterpriseMemberVO);
			
			return eList;
		}
}
