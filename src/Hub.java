public class Hub implements NetworkDevice {
    private String type;
    public Hub(String type){
        this.type=type;
    }
    public String getType(){
        return this.type;
    }
    public void use(){
        System.out.println("Linked by hub,type is"+this.type);
    }
}
