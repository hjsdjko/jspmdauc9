package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PintuanshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PintuanshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PintuanshenqingView;


/**
 * 拼团申请
 *
 * @author 
 * @email 
 * @date 2022-03-12 09:37:02
 */
public interface PintuanshenqingService extends IService<PintuanshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PintuanshenqingVO> selectListVO(Wrapper<PintuanshenqingEntity> wrapper);
   	
   	PintuanshenqingVO selectVO(@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);
   	
   	List<PintuanshenqingView> selectListView(Wrapper<PintuanshenqingEntity> wrapper);
   	
   	PintuanshenqingView selectView(@Param("ew") Wrapper<PintuanshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PintuanshenqingEntity> wrapper);
   	

}

