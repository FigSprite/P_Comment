package com.imooc.dianping.service.impl;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import com.imooc.dianping.common.BusinessException;
import com.imooc.dianping.common.EmBusinessError;
import com.imooc.dianping.dal.UserModelMapper;
import com.imooc.dianping.model.UserModel;
import com.imooc.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.BASE64Encoder;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserModelMapper userModelMapper;

    @Override
    public UserModel getUserById(Integer id) {
        return userModelMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional
    public UserModel register(UserModel registerUser)
        throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        registerUser.setCreatedAt(new Date());
        registerUser.setUpdatedAt(new Date());
        registerUser.setPassword(this.encodeByMd5(registerUser.getPassword()));

        try{
            userModelMapper.insertSelective(registerUser);
        }catch (DuplicateKeyException e){
            throw new BusinessException(EmBusinessError.REGISTER_DUP_FAIL);
        }

        return getUserById(registerUser.getId());
    }

    @Override
    public UserModel login(String telphone, String password)
        throws UnsupportedEncodingException, NoSuchAlgorithmException, BusinessException {
        UserModel userModel = userModelMapper.selectByTelphoneAndPassword(telphone,encodeByMd5(password));
        if (userModel==null){
            throw new BusinessException(EmBusinessError.LOGIN_FAIL);
        }

        return userModel;
    }

    @Override
    public Integer countAllUser(){
        return userModelMapper.countAllUser();
    }

    private String encodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(messageDigest.digest(str.getBytes("UTF-8")));
    }

}
