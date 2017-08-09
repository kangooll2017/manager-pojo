package com.chilema.manager.bean;

public class Food {
    private Integer id;

    private Integer sid;

    private String name;

    private String describle;

    private Long price;

    private Integer repertory;

    private Integer sales;

    private String pictureurl;

    private String label;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescrible() {
        return describle;
    }

    public void setDescrible(String describle) {
        this.describle = describle == null ? null : describle.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    @Override
    public String toString() {
        return "Food [id=" + id + ", sid=" + sid + ", name=" + name + ", describle=" + describle + ", price=" + price
                + ", repertory=" + repertory + ", sales=" + sales + ", pictureurl=" + pictureurl + ", label=" + label
                + "]";
    }
   
}