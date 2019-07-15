package com.lifetime.mostpopularthree;

public class Info {
    private int Image;
    private String head;
    private String category;
    private String time;
    private String description;

    public Info(int image, String head, String category, String time, String description, String comment, String like) {
        Image = image;
        this.head = head;
        this.category = category;
        this.time = time;
        this.description = description;
        this.comment = comment;
        this.like = like;
    }

    private String comment;
    private String like;

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }
}
