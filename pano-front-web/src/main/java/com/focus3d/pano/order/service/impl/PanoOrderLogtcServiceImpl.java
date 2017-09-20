package com.focus3d.pano.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.focus3d.pano.common.dao.CommonDao;
import com.focus3d.pano.common.service.impl.CommonServiceImpl;
import com.focus3d.pano.model.PanoOrderLogtcModel;
import com.focus3d.pano.order.dao.PanoOrderLogtcDao;
import com.focus3d.pano.order.service.PanoOrderLogtcService;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Service
@Transactional
public class PanoOrderLogtcServiceImpl extends CommonServiceImpl<PanoOrderLogtcModel> implements PanoOrderLogtcService<PanoOrderLogtcModel> {
	@Autowired
	private PanoOrderLogtcDao orderLogtcDao;
	@Override
	public CommonDao<PanoOrderLogtcModel> getDao() {
		return orderLogtcDao;
	}

}
