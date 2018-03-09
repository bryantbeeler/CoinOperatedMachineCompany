package com.company;

import java.util.ArrayList;

public class Location {
    private String name;
    private ArrayList<VendingMachine> machineList = new ArrayList<VendingMachine>();

    public Location(String name){
        this.name = name;
        ArrayList<VendingMachine> machineList = new ArrayList<VendingMachine>();
    }

    public void addMachine(VendingMachine machine){
        machineList.add(machine);
    }
}
