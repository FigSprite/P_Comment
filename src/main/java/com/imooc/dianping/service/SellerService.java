package com.imooc.dianping.service;

import java.util.List;

import com.imooc.dianping.common.BusinessException;
import com.imooc.dianping.model.SellerModel;

public interface SellerService {
    SellerModel create(SellerModel sellerModel);
    SellerModel get(Integer id);
    List<SellerModel> selectAll();
    SellerModel changeStatus(Integer id,Integer displayFlg) throws BusinessException;
}
