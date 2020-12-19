package com.exp.delegate;

import java.util.HashMap;
import java.util.Map;

public class ProjectManager {

    private Map<String,Employee> targets = new HashMap<String,Employee>();

    public ProjectManager(){

        targets.put("NO01",new EmployeeA());
        targets.put("NO02",new EmployeeB());

    }

    public void doing(String command){
        targets.get(command).doing(command);
    }
}
