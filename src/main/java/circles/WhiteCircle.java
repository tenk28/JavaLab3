package circles;

public class WhiteCircle implements Circle {
    private String color;

    public WhiteCircle() {
        this.color = "white";
        System.out.println("Constructing white circle");
    }

    @Override
    public String getColor(){
        return color;
    }
}
