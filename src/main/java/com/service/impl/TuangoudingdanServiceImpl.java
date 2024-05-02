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


import com.dao.TuangoudingdanDao;
import com.entity.TuangoudingdanEntity;
import com.service.TuangoudingdanService;
import com.entity.vo.TuangoudingdanVO;
import com.entity.view.TuangoudingdanView;

@Service("tuangoudingdanService")
public class TuangoudingdanServiceImpl extends ServiceImpl<TuangoudingdanDao, TuangoudingdanEntity> implements TuangoudingdanService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuangoudingdanEntity> page = this.selectPage(
                new Query<TuangoudingdanEntity>(params).getPage(),
                new EntityWrapper<TuangoudingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuangoudingdanEntity> wrapper) {
		  Page<TuangoudingdanView> page =new Query<TuangoudingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuangoudingdanVO> selectListVO(Wrapper<TuangoudingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuangoudingdanVO selectVO(Wrapper<TuangoudingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuangoudingdanView> selectListView(Wrapper<TuangoudingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuangoudingdanView selectView(Wrapper<TuangoudingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
