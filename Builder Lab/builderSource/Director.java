public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder){
        this.builder = builder;
    }

    public void construct(){
        builder.setCooler();
        builder.setCase();
        builder.setCPU();
        builder.setGPU();
        builder.setFans();
        builder.setStorage();
        builder.setPSU();
        builder.setMotherBoard();
        builder.setRAM();
    }
}
