package com.example.newsapplication.model;

public class Results {

    private Integer id;
    private String name;
    private Image image;

    private Integer price;
    private Integer price_week;
    private Integer price_month;
    private Currency currency;

    private Integer view_count;
    private Boolean favorite;
    private Integer email_count;
    private Integer phone_count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrice_week() {
        return price_week;
    }

    public void setPrice_week(Integer price_week) {
        this.price_week = price_week;
    }

    public Integer getPrice_month() {
        return price_month;
    }

    public void setPrice_month(Integer price_month) {
        this.price_month = price_month;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }

    public Integer getEmail_count() {
        return email_count;
    }

    public void setEmail_count(Integer email_count) {
        this.email_count = email_count;
    }

    public Integer getPhone_count() {
        return phone_count;
    }

    public void setPhone_count(Integer phone_count) {
        this.phone_count = phone_count;
    }

    public Boolean getOwner() {
        return owner;
    }

    public void setOwner(Boolean owner) {
        this.owner = owner;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Results{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", image=" + image +
                ", price=" + price +
                ", price_week=" + price_week +
                ", price_month=" + price_month +
                ", currency=" + currency +
                ", view_count=" + view_count +
                ", favorite=" + favorite +
                ", email_count=" + email_count +
                ", phone_count=" + phone_count +
                ", owner=" + owner +
                ", category=" + category +
                '}';
    }

    private Boolean owner;
    private Integer category;


}
