package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PintuanshenqingDao;
import com.entity.PintuanshenqingEntity;
import com.service.PintuanshenqingService;
import com.entity.vo.PintuanshenqingVO;
import com.entity.view.PintuanshenqingView;

@Service("pintuanshenqingService")
public class PintuanshenqingServiceImpl extends ServiceImpl<PintuanshenqingDao, PintuanshenqingEntity> implements PintuanshenqingService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PintuanshenqingEntity> page = this.selectPage(
                new Query<PintuanshenqingEntity>(params).getPage(),
                new EntityWrapper<PintuanshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PintuanshenqingEntity> wrapper) {
		  Page<PintuanshenqingView> page =new Query<PintuanshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PintuanshenqingVO> selectListVO(Wrapper<PintuanshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PintuanshenqingVO selectVO(Wrapper<PintuanshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PintuanshenqingView> selectListView(Wrapper<PintuanshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PintuanshenqingView selectView(Wrapper<PintuanshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
