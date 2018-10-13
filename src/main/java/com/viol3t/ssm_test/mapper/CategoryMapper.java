package com.viol3t.ssm_test.mapper;
 
import com.viol3t.ssm_test.pojo.Category;

import java.util.List;


 
public interface CategoryMapper {
 
      
    public int add(Category category);
       
      
    public void delete(int id);  
       
      
    public Category get(int id);  
     
      
    public int update(Category category);   
       
      
    public List<Category> list();
    
      
    public int count();  
    
    
    
}