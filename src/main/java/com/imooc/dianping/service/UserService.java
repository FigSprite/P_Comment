package com.imooc.dianping.service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import com.imooc.dianping.common.BusinessException;
import com.imooc.dianping.model.UserModel;

public interface UserService {
    UserModel getUserById(Integer id);

    UserModel register(UserModel userModel)
        throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException;

    UserModel login(String telphone,String password)
        throws UnsupportedEncodingException, NoSuchAlgorithmException, BusinessException;

    Integer countAllUser();
}
