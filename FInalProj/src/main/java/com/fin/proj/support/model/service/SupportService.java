package com.fin.proj.support.model.service;

import java.util.ArrayList;

import com.fin.proj.support.model.vo.Support;
import com.fin.proj.support.model.vo.SupportDetail;

public interface SupportService {

	int supportApply(Support s);

	int insertSupportDetail(SupportDetail supportDetail);

	ArrayList<Support> selectApplyListUser(int uNo);

	Support supportDetail(int supportNo);

	ArrayList<SupportDetail> supportUsageDetail(int supportNo);

	int getListCount();



}
