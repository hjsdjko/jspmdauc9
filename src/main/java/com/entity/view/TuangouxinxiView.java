package com.entity.view;

import com.entity.TuangouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 团购信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
@TableName("tuangouxinxi")
public class TuangouxinxiView  extends TuangouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TuangouxinxiView(){
	}
 
 	public TuangouxinxiView(TuangouxinxiEntity tuangouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, tuangouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
