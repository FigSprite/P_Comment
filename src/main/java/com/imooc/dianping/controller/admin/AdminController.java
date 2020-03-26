package com.imooc.dianping.controller.admin;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpServletRequest;

import com.alibaba.druid.util.StringUtils;

import com.imooc.dianping.common.AdminPermission;
import com.imooc.dianping.common.BusinessException;
import com.imooc.dianping.common.CommonRes;
import com.imooc.dianping.common.EmBusinessError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.BASE64Encoder;

@Controller("/admin/admin")
@RequestMapping("/admin/admin")
public class AdminController {

    @Value("${admin.email}")
    private String email;

    @Value("${admin.encryptPassword}")
    private String encryptPassword;

    public static final String CURRENT_ADMIN_SESSION = "currentAdminSession";

    @Autowired
    private HttpServletRequest httpServletRequest;

    @RequestMapping("/index")
    @AdminPermission
    public ModelAndView index(){
        ModelAndView modelAndView= new ModelAndView("/admin/admin/index");
        return modelAndView;
    }



    //试验切面 produceType
    /*
    @RequestMapping("/index")
    @AdminPermission(produceType = "application/json")
    @ResponseBody
    public CommonRes index(){
        return CommonRes.create(null);
    }
    */





    @RequestMapping("/loginPage")
    public ModelAndView loginPage(){
        ModelAndView modelAndView= new ModelAndView("/admin/admin/login");
        return modelAndView;
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestParam(name="email")String email,@RequestParam(name="password")String password)
        throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if(StringUtils.isEmpty(email)||StringUtils.isEmpty(password)){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户名和密码不能为空");
        }
        if(email.equals(this.email)&&encryptPassword.equals(encodeByMd5(password))){
            //登录成功
            httpServletRequest.getSession().setAttribute(CURRENT_ADMIN_SESSION,email);
            return "redirect:/admin/admin/index";
        }else {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR,"用户名或密码为空");
        }
    }

    private String encodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(messageDigest.digest(str.getBytes("UTF-8")));
    }


}
