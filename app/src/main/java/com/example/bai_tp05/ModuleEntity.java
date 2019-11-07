package com.example.bai_tp05;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "modules")
public class ModuleEntity {
    @PrimaryKey
    @NonNull
    private String sigle;

    private String parcours;
    private String categorie;
    private int credit;

    public ModuleEntity(String sigle, String parcours, String categorie, int credit) {
        this.sigle = sigle;
        this.setParcours(parcours);
        this.categorie = categorie;
        this.credit = credit;

    }
    public String getSigle(){return this.sigle;}

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    public String getParcours() {
        return this.parcours;
    }

    public void setParcours(String parcours) {
        this.parcours = parcours;
    }


    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }


    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


    public void affiche() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Module{" +
                "sigle='" + sigle + '\'' +
                ", parcours='" + parcours + '\'' +
                ", categorie='" + categorie + '\'' +
                ", credit=" + credit +
                '}';
    }
}
