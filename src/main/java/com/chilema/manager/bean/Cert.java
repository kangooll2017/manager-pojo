package com.chilema.manager.bean;

public class Cert {
    private Integer id;
    private Integer sid;

    private String idImg;

    private String tradImg;

    private String hygImg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getIdImg() {
        return idImg;
    }

    public void setIdImg(String idImg) {
        this.idImg = idImg == null ? null : idImg.trim();
    }

    public String getTradImg() {
        return tradImg;
    }

    public void setTradImg(String tradImg) {
        this.tradImg = tradImg == null ? null : tradImg.trim();
    }

    public String getHygImg() {
        return hygImg;
    }

    public void setHygImg(String hygImg) {
        this.hygImg = hygImg == null ? null : hygImg.trim();
    }
}