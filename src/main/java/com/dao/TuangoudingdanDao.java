package com.dao;

import com.entity.TuangoudingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuangoudingdanVO;
import com.entity.view.TuangoudingdanView;


/**
 * 团购订单
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface TuangoudingdanDao extends BaseMapper<TuangoudingdanEntity> {
	
	List<TuangoudingdanVO> selectListVO(@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);
	
	TuangoudingdanVO selectVO(@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);
	
	List<TuangoudingdanView> selectListView(@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);

	List<TuangoudingdanView> selectListView(Pagination page,@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);
	
	TuangoudingdanView selectView(@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);
	

}
