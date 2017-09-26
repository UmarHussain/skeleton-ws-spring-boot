package com.leanstacks.ws.dtos;

public class EmployeeTypeDto {

    /**
     *  "employeeType": {
     "name": "Nisum",
     "type": "FULLTIMEEMPLOYEE"
     },
     */

    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
