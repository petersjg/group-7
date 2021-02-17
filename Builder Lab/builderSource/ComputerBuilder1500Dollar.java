/**
 * Basic 1500 dollar pc preset implementing computerBuilder interface
 */
public class ComputerBuilder1500Dollar implements ComputerBuilder{
    private String CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard;

    @Override
    public void setCPU() {
        CPU = ("High Quality CPU");
    }

    @Override
    public void setGPU() {
        GPU = ("High Quality GPU");
    }

    @Override
    public void setPSU() {
        PSU = ("High Quality PSU");
    }

    @Override
    public void setCase() {
        Case = ("High Quality Case");
    }

    @Override
    public void setRAM() {
        RAM = ("High Quality RAM");
    }

    @Override
    public void setStorage() {
        Storage = ("High Quality Storage");
    }

    @Override
    public void setFans() {
        Fans = ("High Quality Fans");
    }

    @Override
    public void setCooler() {
        Cooler = ("High Quality Cooler");
    }

    @Override
    public void setMotherBoard() {
        Motherboard = ("High Quality Motherboard");
    }

    @Override
    public Computer getResult() {
        return new Computer(CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard);
    }

}
