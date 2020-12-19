package com.exp.decorator.upgrade;

import com.exp.decorator.old.ISigninService;
import com.exp.decorator.old.ResultMsg;

public class SiginForThirdService implements ISiginForThirdService {

    private ISigninService signinService;

    public SiginForThirdService(ISigninService signinService) {
        this.signinService = signinService;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return signinService.regist(username,password);
    }

    @Override
    public ResultMsg login(String username, String password) {
        return signinService.login(username,password);
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelphone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }
}
