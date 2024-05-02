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


import com.dao.TuichupintuanDao;
import com.entity.TuichupintuanEntity;
import com.service.TuichupintuanService;
import com.entity.vo.TuichupintuanVO;
import com.entity.view.TuichupintuanView;

@Service("tuichupintuanService")
public class TuichupintuanServiceImpl extends ServiceImpl<TuichupintuanDao, TuichupintuanEntity> implements TuichupintuanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuichupintuanEntity> page = this.selectPage(
                new Query<TuichupintuanEntity>(params).getPage(),
                new EntityWrapper<TuichupintuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuichupintuanEntity> wrapper) {
		  Page<TuichupintuanView> page =new Query<TuichupintuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuichupintuanVO> selectListVO(Wrapper<TuichupintuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuichupintuanVO selectVO(Wrapper<TuichupintuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuichupintuanView> selectListView(Wrapper<TuichupintuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuichupintuanView selectView(Wrapper<TuichupintuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
