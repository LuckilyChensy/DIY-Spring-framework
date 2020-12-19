package com.exp.delegate;

public class CEO {

    public void command(String command,ProjectManager pm){
        pm.doing(command);
    }
}
