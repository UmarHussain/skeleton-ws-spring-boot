package com.leanstacks.ws.model;


import com.leanstacks.ws.model.enums.EmpType;

import javax.persistence.Entity;
import javax.persistence.Enumerated;

@Entity
public class EmployeeType extends TransactionalEntity{

    private static final long serialVersionUID = 1L;

    private String name;

    @Enumerated
    private EmpType type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmpType getType() {
        return type;
    }

    public void setType(EmpType type) {
        this.type = type;
    }
}
