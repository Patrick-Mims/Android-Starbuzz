package edu.sfsu.starbuzz.Models;

public class ProductModel {
    private int imgId;
    private String description;
    private String name;

    public ProductModel(int imgId, String description, String name) {
        this.imgId = imgId;
        this.description = description;
        this.name = name;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}