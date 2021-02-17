public class Computer {
    private String CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard;


    /**
     * Basic computer class which has getters, setters and stores what is a computor
     * @param CPU the cpu
     * @param GPU the gpu
     * @param PSU the pse
     * @param Case the case
     * @param RAM the ram
     * @param Storage the storage
     * @param Fans the fans
     * @param Cooler the cooler
     * @param Motherboard the motherboard
     */
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

    public void printConfig() {
        StringBuilder output = new StringBuilder();
        output.append(this);
        output.append("\n");
        output.append(CPU);
        output.append("\n");
        output.append(GPU);
        output.append("\n");
        output.append(PSU);
        output.append("\n");
        output.append(Case);
        output.append("\n");
        output.append(RAM);
        output.append("\n");
        output.append(Storage);
        output.append("\n");
        output.append(Fans);
        output.append("\n");
        output.append(Cooler);
        output.append("\n");
        output.append(Motherboard);
        output.append("\n");

        System.out.println(output.toString());
    }
}
