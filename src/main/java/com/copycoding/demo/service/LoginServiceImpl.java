package com.copycoding.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.copycoding.demo.dao.LoginDao;
import com.copycoding.demo.vo.EnterpriseMemberVO;

@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	LoginDao loginDao;

	@Override
	public List<EnterpriseMemberVO> selectListEnterpriseMember(EnterpriseMemberVO vo) {
		// TODO Auto-generated method stub
		System.out.println(" <<< serviceImpl >>>");
		return loginDao.selectListEnterpriseMember(vo);
	}
							
			

	
	
}
