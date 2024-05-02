package com.dao;

import com.entity.TuangouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuangouxinxiVO;
import com.entity.view.TuangouxinxiView;


/**
 * 团购信息
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface TuangouxinxiDao extends BaseMapper<TuangouxinxiEntity> {
	
	List<TuangouxinxiVO> selectListVO(@Param("ew") Wrapper<TuangouxinxiEntity> wrapper);
	
	TuangouxinxiVO selectVO(@Param("ew") Wrapper<TuangouxinxiEntity> wrapper);
	
	List<TuangouxinxiView> selectListView(@Param("ew") Wrapper<TuangouxinxiEntity> wrapper);

	List<TuangouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<TuangouxinxiEntity> wrapper);
	
	TuangouxinxiView selectView(@Param("ew") Wrapper<TuangouxinxiEntity> wrapper);
	

}
