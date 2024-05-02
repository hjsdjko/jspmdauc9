package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuichupintuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuichupintuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuichupintuanView;


/**
 * 退出拼团
 *
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface TuichupintuanService extends IService<TuichupintuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuichupintuanVO> selectListVO(Wrapper<TuichupintuanEntity> wrapper);
   	
   	TuichupintuanVO selectVO(@Param("ew") Wrapper<TuichupintuanEntity> wrapper);
   	
   	List<TuichupintuanView> selectListView(Wrapper<TuichupintuanEntity> wrapper);
   	
   	TuichupintuanView selectView(@Param("ew") Wrapper<TuichupintuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuichupintuanEntity> wrapper);
   	

}

