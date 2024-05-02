package com.dao;

import com.entity.TuichupintuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuichupintuanVO;
import com.entity.view.TuichupintuanView;


/**
 * 退出拼团
 * 
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface TuichupintuanDao extends BaseMapper<TuichupintuanEntity> {
	
	List<TuichupintuanVO> selectListVO(@Param("ew") Wrapper<TuichupintuanEntity> wrapper);
	
	TuichupintuanVO selectVO(@Param("ew") Wrapper<TuichupintuanEntity> wrapper);
	
	List<TuichupintuanView> selectListView(@Param("ew") Wrapper<TuichupintuanEntity> wrapper);

	List<TuichupintuanView> selectListView(Pagination page,@Param("ew") Wrapper<TuichupintuanEntity> wrapper);
	
	TuichupintuanView selectView(@Param("ew") Wrapper<TuichupintuanEntity> wrapper);
	

}
