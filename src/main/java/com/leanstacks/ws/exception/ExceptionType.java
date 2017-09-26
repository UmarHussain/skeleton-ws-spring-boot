package com.leanstacks.ws.exception;

public enum ExceptionType {

    DUPLICATE_ENTITY("DE", "Duplicate Entity"),
    INVALID_INPUT("II", "Invalid Input"),
    INVALID_OBJECT("IO", "Invalid Object"),
    UNABLE_TO_LOAD_OBJECT("UTLO","Unable to load object"),
    UNABLE_TO_SAVE_OBJECT("UTSO","Unable to save object"),
    UNABLE_TO_UPDATE_OBJECT("UTUO", "Unable to update object"),
    UNABLE_TO_DELETE_OBJECT("UTDO", "Unable to delete object"),
    UPDATE_ID_IS_NULL("IO","update ID is null"),
    CUSTOM_ERROR("CE","Custom error : "),
	ENTITY_EXIST_EXCEPTION("EEE", "The id attribute must not be null to update an entity."),
	UNAUTHORIZED_USER("UAU", "No user found");

    public String code;
    public String message;

    ExceptionType(String code, String message){
        this.code  = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
