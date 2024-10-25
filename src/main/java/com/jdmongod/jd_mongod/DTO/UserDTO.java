package com.jdmongod.jd_mongod.DTO;

public class UserDTO {
    private String userID, userPW;

    public UserDTO(String userID, String userPW) {
        this.userID = userID;
        this.userPW = userPW;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "ID='" + userID + '\'' +
                ", PW='" + userPW + '\'' +
                '}';
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) {
        this.userPW = userPW;
    }
}
