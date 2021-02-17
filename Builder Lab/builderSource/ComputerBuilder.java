/**
 * The computer builder interface used for us to extend from and have many computer presets
 */
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
