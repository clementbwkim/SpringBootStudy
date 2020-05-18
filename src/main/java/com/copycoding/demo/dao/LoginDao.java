package com.copycoding.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.copycoding.demo.vo.EnterpriseMemberVO;

@Mapper
public interface LoginDao {
	
	public List<EnterpriseMemberVO> selectListEnterpriseMember(EnterpriseMemberVO enterpriseMemberVO);
}
