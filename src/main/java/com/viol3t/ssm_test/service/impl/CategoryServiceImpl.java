package com.viol3t.ssm_test.service.impl;

import java.util.List;

import com.viol3t.ssm_test.mapper.CategoryMapper;
import com.viol3t.ssm_test.pojo.Category;
import com.viol3t.ssm_test.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class CategoryServiceImpl  implements CategoryService {
	@Autowired
	CategoryMapper categoryMapper;
	
	
	public List<Category> list(){
		return categoryMapper.list();
	}

}
