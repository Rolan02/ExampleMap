package org.jalafoundation.dev34.level1;

import java.util.Objects;

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
    public String toString() {
        return this.dorsal+"  --  "+this.name+"  --  "+this.demarcation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return dorsal == player.dorsal && Objects.equals(name, player.name)
            && Objects.equals(demarcation, player.demarcation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dorsal, name, demarcation);
    }
}
