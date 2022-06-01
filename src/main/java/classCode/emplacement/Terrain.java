package classCode.emplacement;

public class Terrain {
    private float width;
    private float height;
    private float x;
    private float y;

    public Terrain(float width, float height, float x, float y) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}
