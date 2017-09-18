package com.focus3d.pano.member.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.focus3d.pano.common.controller.BaseController;
import com.focus3d.pano.member.service.PanoUserBankcardService;
import com.focus3d.pano.model.PanoUserBankcardModel;
import com.focustech.common.utils.TCUtil;
/**
 * 
 * *
 * @author lihaijun
 *
 */
@Controller
@RequestMapping(value = "/bankCard")
public class BankCardController extends BaseController {
	@Autowired
	private PanoUserBankcardService<PanoUserBankcardModel> userBankcardService;
	/**
	 * 
	 * *
	 * @param bankCardSn
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value = "/delete")
	public void delete(String  bankCardSn, HttpServletResponse response) throws IOException{
		if(StringUtils.isNotEmpty(bankCardSn)){
			PanoUserBankcardModel bankcardModel = userBankcardService.getBySn(TCUtil.lv(bankCardSn));
			if(bankcardModel != null){
				userBankcardService.delete(bankcardModel);
			}
		}
		JSONObject jo = new JSONObject();
		jo.put("status", 1);
		ajaxOutput(response, jo.toString());
	}
}
