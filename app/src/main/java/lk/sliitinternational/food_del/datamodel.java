package lk.sliitinternational.food_del;

public class datamodel {
    int image;
    String header;
    String description;

    public datamodel(int image, String header, String description) {
        this.image = image;
        this.header = header;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
