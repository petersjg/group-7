public class ComputerBuilder1500Dollar implements ComputerBuilder{
    private String CPU, GPU, PSU, Case, RAM, Storage, Fans, Cooler, Motherboard;

    @Override
    public void setCPU() {
        computer.setCPU("High Quality CPU");
    }

    @Override
    public void setGPU() {
        computer.setGPU("High Quality GPU");
    }

    @Override
    public void setPSU() {
        computer.setPSU("High Quality PSU");
    }

    @Override
    public void setCase() {
        computer.setCase("High Quality Case");
    }

    @Override
    public void setRAM() {
        computer.setRAM("High Quality RAM");
    }

    @Override
    public void setStorage() {
        computer.setStorage("High Quality Storage");
    }

    @Override
    public void setFans() {
        computer.setFans("High Quality Fans");
    }

    @Override
    public void setCooler() {
        computer.setCooler("High Quality Cooler");
    }

    @Override
    public void setMotherBoard() {
        computer.setMotherboard("High Quality Motherboard");
    }

    @Override
    public Computer getResult() {
        return null;
    }
}
