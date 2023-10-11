package triangles;

public class WhiteTriangle implements Triangle {
    private String color;

    public WhiteTriangle() {
        this.color = "white";
        System.out.println("Constructing white triangle");
    }

    @Override
    public String getColor(){
        return color;
    }
}
