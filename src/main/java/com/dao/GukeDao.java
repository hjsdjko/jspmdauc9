package com.dao;

import com.entity.GukeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GukeVO;
import com.entity.view.GukeView;


/**
 * 顾客
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface GukeDao extends BaseMapper<GukeEntity> {
	
	List<GukeVO> selectListVO(@Param("ew") Wrapper<GukeEntity> wrapper);
	
	GukeVO selectVO(@Param("ew") Wrapper<GukeEntity> wrapper);
	
	List<GukeView> selectListView(@Param("ew") Wrapper<GukeEntity> wrapper);

	List<GukeView> selectListView(Pagination page,@Param("ew") Wrapper<GukeEntity> wrapper);
	
	GukeView selectView(@Param("ew") Wrapper<GukeEntity> wrapper);
	

}
