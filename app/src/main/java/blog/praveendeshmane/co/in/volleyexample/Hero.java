package blog.praveendeshmane.co.in.volleyexample;

/**
 * Created by Admin on 05-12-2017.
 */

public class Hero {
    String name, imageUrl;

    public Hero(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}