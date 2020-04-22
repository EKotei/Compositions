package uml;

public class Monitor<Model, Manufacturer> extends PC{
    private Resolution resolution;
    private Model model;
    private Manufacturer manufacturer;

public void drawPixelAt(int x, int y, String color){
    System.out.println("Drawing pixel at " + x + "," + y + " " +" in color ");
}

}
