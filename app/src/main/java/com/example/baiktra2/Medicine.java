package com.example.baiktra2;

import java.io.Serializable;

public class Medicine implements Serializable {
    String name, scienceName, nature, uses;

    public Medicine() {
    }

    public Medicine(String name, String scienceName, String nature, String uses) {
        this.name = name;
        this.scienceName = scienceName;
        this.nature = nature;
        this.uses = uses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScienceName() {
        return scienceName;
    }

    public void setScienceName(String scienceName) {
        this.scienceName = scienceName;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses;
    }
}
