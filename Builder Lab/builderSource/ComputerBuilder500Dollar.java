public class ComputerBuilder500Dollar implements ComputerBuilder{
    private String CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard;

    @Override
    public void setCPU() {
        CPU =  "Low Quality CPU";
    }

    @Override
    public void setGPU() {
        GPU = "Low Quality GPU";
    }

    @Override
    public void setPSU() {
        PSU = "Low Quality PSU";
    }

    @Override
    public void setCase() {
        Case = "Low Quality Case";
    }

    @Override
    public void setRAM() {
        RAM = "Low Quality RAM";
    }

    @Override
    public void setStorage() {
        Storage = "Low Quality Storage";
    }

    @Override
    public void setFans() {
        Fans = "Low Quality Fans";
    }

    @Override
    public void setCooler() {
        Cooler = "Low Quality Cooler";
    }

    @Override
    public void setMotherBoard() {
        Motherboard = "Low Quality Motherboard";
    }

    @Override
    public Computer getResult() {
        return new Computer(CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard);
    }


}
