package circles;

public class BlackCircle implements Circle {
    private String color;

    public BlackCircle() {
        this.color = "black";
        System.out.println("Constructing black circle");
    }

    @Override
    public String getColor(){
        return color;
    }
}
