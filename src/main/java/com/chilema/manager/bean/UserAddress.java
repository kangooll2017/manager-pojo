package com.chilema.manager.bean;

public class UserAddress {
    private Integer id;

    private Integer uid;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    @Override
    public String toString() {
        return "UserAddress [id=" + id + ", uid=" + uid + ", address=" + address + "]";
    }
    
}