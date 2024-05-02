package com.entity.view;

import com.entity.DiscusstuangouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 团购信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-12 09:37:03
 */
@TableName("discusstuangouxinxi")
public class DiscusstuangouxinxiView  extends DiscusstuangouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusstuangouxinxiView(){
	}
 
 	public DiscusstuangouxinxiView(DiscusstuangouxinxiEntity discusstuangouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusstuangouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}