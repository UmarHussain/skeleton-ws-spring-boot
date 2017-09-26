package com.leanstacks.ws.dtos;

public class ResponseDto <T> {

    private T response ;
    private String status;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
