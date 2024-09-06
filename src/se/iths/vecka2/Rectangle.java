package vecka2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle (){
        this.width = 0;
        this.height = 0;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if (height <= 0){
            throw new IllegalArgumentException("Height must be greater than 0");
        }
        this.height = height;
    }
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getArea() {
        return width * height;
    }

    public int perimeter() {
        return width*2 + height*2;
    }
}
