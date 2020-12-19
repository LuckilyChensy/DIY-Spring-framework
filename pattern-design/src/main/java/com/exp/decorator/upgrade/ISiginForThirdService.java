package com.exp.decorator.upgrade;

import com.exp.decorator.old.ISigninService;
import com.exp.decorator.old.ResultMsg;

public interface ISiginForThirdService extends ISigninService {

    ResultMsg loginForQQ(String id);

    ResultMsg loginForWechat(String id);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String telphone, String code);

    ResultMsg loginForRegist(String username, String passport);

}
