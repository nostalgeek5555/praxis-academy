package Vending.Machine;

public class VendingMachineFactory {
    public static VendingMachine createVendingMachine() {
        return new VendingMachineImpl();
    }
}