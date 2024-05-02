package com.dao;

import com.entity.DiscusstuangouxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusstuangouxinxiVO;
import com.entity.view.DiscusstuangouxinxiView;


/**
 * 团购信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:37:03
 */
public interface DiscusstuangouxinxiDao extends BaseMapper<DiscusstuangouxinxiEntity> {
	
	List<DiscusstuangouxinxiVO> selectListVO(@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);
	
	DiscusstuangouxinxiVO selectVO(@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);
	
	List<DiscusstuangouxinxiView> selectListView(@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);

	List<DiscusstuangouxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);
	
	DiscusstuangouxinxiView selectView(@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);
	

}
