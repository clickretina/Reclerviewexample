package com.example;

public class MyModel{
    public MyModel(String maintitle,int images)
    {
        setMaintitle(maintitle);
        setImages(images);

}

       public String getMaintitle() {


        return Maintitle;

    }

    public void setMaintitle(String maintitle) {
        this.Maintitle= maintitle;
    }

    private String Maintitle;

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    private int images;
}
