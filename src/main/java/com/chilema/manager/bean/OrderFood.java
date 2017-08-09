package com.chilema.manager.bean;

public class OrderFood {
    private Integer id;

    private Integer oid;
    private Integer fid;

    private Integer count;

    private Long price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderFood [id=" + id + ", oid=" + oid + ", fid=" + fid + ", count=" + count + ", price=" + price + "]";
    }
    
}