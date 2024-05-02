package com.dao;

import com.entity.PintuanshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PintuanshenqingVO;
import com.entity.view.PintuanshenqingView;


/**
 * 拼团申请
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface PintuanshenqingDao extends BaseMapper<PintuanshenqingEntity> {
	
	List<PintuanshenqingVO> selectListVO(@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);
	
	PintuanshenqingVO selectVO(@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);
	
	List<PintuanshenqingView> selectListView(@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);

	List<PintuanshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);
	
	PintuanshenqingView selectView(@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);
	

}
