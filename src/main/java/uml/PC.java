package uml;

public class PC {
    private Case case;
    private Motherboard motherboard;
    private Monitor monitor;

    public PC (case,monitor,motherboard){

 }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixelAt(x,y,z);
    }

public void description(){
    System.out.println("welcome to Worst Buy! Below is the description of the PC on sale today: case, monitor, motherboard");
}

public void powerUp(){
        case.pressPowerButton();
        case.drawLogo();
        motherboard.loadProgram();
}

}
