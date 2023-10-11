package triangles;

public class BlackTriangle implements Triangle {
    private String color;

    public BlackTriangle() {
        this.color = "black";
        System.out.println("Constructing black triangle");
    }

    @Override
    public String getColor(){
        return color;
    }
}
