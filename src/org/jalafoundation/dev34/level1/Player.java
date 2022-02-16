package org.jalafoundation.dev34.level1;

public class Player {
    private int dorsal;
    private String name;
    private String demarcation;

    public Player() {
    }

    public Player(int dorsal, String name, String demarcation) {
        this.dorsal = dorsal;
        this.name = name;
        this.demarcation = demarcation;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDemarcation() {
        return demarcation;
    }

    public void setDemarcation(String demarcation) {
        this.demarcation = demarcation;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return this.dorsal+"  --  "+this.name+"  --  "+this.demarcation;
    }

}
