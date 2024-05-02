package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuangoudingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuangoudingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuangoudingdanView;


/**
 * 团购订单
 *
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface TuangoudingdanService extends IService<TuangoudingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuangoudingdanVO> selectListVO(Wrapper<TuangoudingdanEntity> wrapper);
   	
   	TuangoudingdanVO selectVO(@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);
   	
   	List<TuangoudingdanView> selectListView(Wrapper<TuangoudingdanEntity> wrapper);
   	
   	TuangoudingdanView selectView(@Param("ew") Wrapper<TuangoudingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuangoudingdanEntity> wrapper);
   	

}

