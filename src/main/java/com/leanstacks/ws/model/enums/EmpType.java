package com.leanstacks.ws.model.enums;

public enum EmpType {

    FULL_TIME_EMPLOYEE("FULL_TIME_EMPLOYEE", "Full Time Employee"),
    PART_TIME_EMPLOYEE("PART_TIME_EMPLOYEE", "Part Full Time Employee");

    private String code;
    private String title;

     EmpType(String code, String title) {
        this.code = code;
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }
}
