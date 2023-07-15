package solid;

public abstract class  Bird {
    private int weight;
    private String color;
    private String type;
    private int size;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    protected void eat(){
        System.out.println("Bird Eating");
    }

    protected void makeSound(){
        System.out.println("Bird Making sound");
    }

}
