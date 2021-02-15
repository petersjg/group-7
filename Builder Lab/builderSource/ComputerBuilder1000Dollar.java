public class ComputerBuilder1000Dollar implements ComputerBuilder{
    private String CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard;

    @Override
    public void setCPU() {
        this.CPU = "Medium Quality CPU";
    }

    @Override
    public void setGPU() {
        this.GPU = "Medium Quality GPU";
    }

    @Override
    public void setPSU() {
        this.PSU = "Medium Quality PSU";
    }

    @Override
    public void setCase() {
        this.Case = "Medium Quality Case";
    }

    @Override
    public void setRAM() {
        this.RAM = "Medium Quality RAM";
    }

    @Override
    public void setStorage() {
        this.Storage = "Medium Quality Storage";
    }

    @Override
    public void setFans() {
        this.Fans = "Medium Quality Fans";
    }

    @Override
    public void setCooler() {
        this.Cooler = "Medium Quality Cooler";
    }

    @Override
    public void setMotherBoard() {
        this.Motherboard = "Medium Quality Motherboard";
    }

    @Override
    public Computer getResult() {
        return null;
    }
}
