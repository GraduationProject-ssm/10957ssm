package com.entity.view;

import com.entity.WeihurenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 维护人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-20 21:03:47
 */
@TableName("weihurenyuan")
public class WeihurenyuanView  extends WeihurenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WeihurenyuanView(){
	}
 
 	public WeihurenyuanView(WeihurenyuanEntity weihurenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, weihurenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
