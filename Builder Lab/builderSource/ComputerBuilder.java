public interface ComputerBuilder{

    void setCPU();
    void setGPU();
    void setPSU();
    void setCase();
    void setRAM();
    void setStorage();
    void setFans();
    void setCooler();
    void setMotherBoard();

    Computer getResult();
}
