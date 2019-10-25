package com.example.infs3634_task2_finalfinal;

public class ProductItem {
    public int id;
    public int categoryId;
    public String name;
    public String description;
    public String price;
    public int image;

    public ProductItem(int id, int categoryId, String name, String description, String price, int image) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public int getItemID(){
        return id; }
    public void setItemID(int id){
        this.id = id; }

    public int getCategoryID(){
        return categoryId; }
    public void setCategoryID(int categoryID){
        this.categoryId = categoryId; }

    public String getName(){
        return name; }
    public void setName(String name){
        this.name = name; }

    public String getDescription(){
        return description; }
    public void setDescription(String description){
        this.description = description; }

    public String getItemPrice(){
        return price; }
    public void setItemPrice(String price){
        this.price = price; }

    public int getImage(){
        return image; }
    public void setImage(int image){
        this.image = image; }
}