package com.exp.decorator.old;

public interface ISigninService {

    ResultMsg regist(String username,String password);

    ResultMsg login(String username, String password);

}
