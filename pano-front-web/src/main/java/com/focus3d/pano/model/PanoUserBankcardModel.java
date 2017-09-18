package com.focus3d.pano.model;

import com.focus3d.pano.common.model.CommonModel;
import com.focus3d.pano.model.ibator.PanoUserBankcard;
import com.focus3d.pano.model.ibator.PanoUserBankcardCriteria;
/**
 * 
 * *
 * @author lihaijun
 *
 */
public class PanoUserBankcardModel extends PanoUserBankcard<PanoUserBankcardModel, PanoUserBankcardCriteria> implements CommonModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String maskName;
	private String maskCertNo;
	private String maskCardNo;
	public String getMaskName() {
		return maskName;
	}
	public void setMaskName(String maskName) {
		this.maskName = maskName;
	}
	public String getMaskCertNo() {
		return maskCertNo;
	}
	public void setMaskCertNo(String maskCertNo) {
		this.maskCertNo = maskCertNo;
	}
	public String getMaskCardNo() {
		return maskCardNo;
	}
	public void setMaskCardNo(String maskCardNo) {
		this.maskCardNo = maskCardNo;
	}
}
