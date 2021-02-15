public class Computer {
    private String CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard;

    public Computer(String CPU, String GPU, String PSU, String Case, String RAM, String Storage,
                    String Fans, String Cooler, String Motherboard){
        this.CPU = CPU;
        this.GPU = GPU;
        this.PSU = PSU;
        this.Case = Case;
        this.RAM = RAM;
        this.Storage = Storage;
        this.Fans = Fans;
        this.Cooler = Cooler;
        this.Motherboard = Motherboard;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }

    public String getPSU() {
        return PSU;
    }

    public void setPSU(String PSU) {
        this.PSU = PSU;
    }

    public String getCase() {
        return Case;
    }

    public void setCase(String aCase) {
        Case = aCase;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String storage) {
        Storage = storage;
    }

    public String getFans() {
        return Fans;
    }

    public void setFans(String fans) {
        Fans = fans;
    }

    public String getCooler() {
        return Cooler;
    }

    public void setCooler(String cooler) {
        Cooler = cooler;
    }

    public String getMotherboard() {
        return Motherboard;
    }

    public void setMotherboard(String motherboard) {
        Motherboard = motherboard;
    }
}
