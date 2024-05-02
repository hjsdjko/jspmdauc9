package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusstuangouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusstuangouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusstuangouxinxiView;


/**
 * 团购信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-12 09:37:03
 */
public interface DiscusstuangouxinxiService extends IService<DiscusstuangouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusstuangouxinxiVO> selectListVO(Wrapper<DiscusstuangouxinxiEntity> wrapper);
   	
   	DiscusstuangouxinxiVO selectVO(@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);
   	
   	List<DiscusstuangouxinxiView> selectListView(Wrapper<DiscusstuangouxinxiEntity> wrapper);
   	
   	DiscusstuangouxinxiView selectView(@Param("ew") Wrapper<DiscusstuangouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusstuangouxinxiEntity> wrapper);
   	

}

