package com.copycoding.demo.service;

import java.util.List;

import com.copycoding.demo.vo.EnterpriseMemberVO;

public interface LoginService {

	List<EnterpriseMemberVO> selectListEnterpriseMember(EnterpriseMemberVO vo);
}
