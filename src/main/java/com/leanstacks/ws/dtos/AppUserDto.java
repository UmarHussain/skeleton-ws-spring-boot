package com.leanstacks.ws.dtos;

public class AppUserDto {

    /**
     "response": {
     "username": "mrangavajhala",
     "firstName": "Krishna",
     "lastName": "Rangavajhala",
     "email": "mrangavajhala@nisum.com",
     "active": true,
     "functionalGroup": "Customer Interactive",
     "employeeType": {
     "name": "Nisum",
     "type": "FULLTIMEEMPLOYEE"
     },
     "location": {
     "location": "Santiago",
     "region": "Santiago",
     "country": "Chile"
     },
     }
     */

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private Boolean active;
    private String functionalGroup;
    private EmployeeTypeDto employeeType;
    private LocationDto locationDto;
    private String error;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getFunctionalGroup() {
        return functionalGroup;
    }

    public void setFunctionalGroup(String functionalGroup) {
        this.functionalGroup = functionalGroup;
    }

    public EmployeeTypeDto getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeTypeDto employeeType) {
        this.employeeType = employeeType;
    }

    public LocationDto getLocationDto() {
        return locationDto;
    }

    public void setLocationDto(LocationDto locationDto) {
        this.locationDto = locationDto;
    }


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}