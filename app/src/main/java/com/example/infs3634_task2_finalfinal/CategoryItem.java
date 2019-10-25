package com.example.infs3634_task2_finalfinal;

public class CategoryItem {
    public int id;
    public String name;
    public int image;

    public CategoryItem(int id, String name, int image) {
        this.id = id;
        this.name = name;
        this.image = image;
    }

    public int getCategoryID(){
        return id; }
    public void setCategoryID(int id){
        this.id = id; }

    public String getName(){
        return name; }
    public void setName(String name){
        this.name = name; }

    public int getImage(){
        return image; }
    public void setImage(int image){
        this.image = image; }
}