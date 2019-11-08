package com.example.bai_tp05;


import java.util.ArrayList;
import java.util.Iterator;


public class CursusEntity {
    private ArrayList<ModuleEntity> profil;

    public CursusEntity() {
        profil = new ArrayList();
        init();
    }

    public void ajoute(ModuleEntity m) {
        profil.add(m);
    }

    public void init() {
        ajoute(new ModuleEntity("GL02", "TCBR", "CS", 6));
        ajoute(new ModuleEntity("NF16", "TCBR", "CS", 6));
        ajoute(new ModuleEntity("NF20", "TCBR", "CS", 6));
        ajoute(new ModuleEntity("IF09", "TCBR", "TM", 6));
        ajoute(new ModuleEntity("IF14", "TCBR", "TM", 6));
        ajoute(new ModuleEntity("LO02", "TCBR", "TM", 6));
        ajoute(new ModuleEntity("NF21", "TCBR", "TM", 6));

        ajoute(new ModuleEntity("IF02", "TCBR", "CS", 6));
        ajoute(new ModuleEntity("LO12", "TCBR", "CS", 6));
        ajoute(new ModuleEntity("IF08", "TCBR", "CS", 6));
        ajoute(new ModuleEntity("EG23", "TCBR", "TM", 6));
        ajoute(new ModuleEntity("IF03", "TCBR", "TM", 6));
        ajoute(new ModuleEntity("LO07", "TCBR", "TM", 6));
        ajoute(new ModuleEntity("NF19", "TCBR", "TM", 6));

        ajoute(new ModuleEntity("IF05", "MPL", "CS", 6));
        ajoute(new ModuleEntity("IF19", "MSI", "CS", 6));
        ajoute(new ModuleEntity("IF11", "MPL", "TM", 6));
        ajoute(new ModuleEntity("IF22", "MSI", "TM", 6));
        ajoute(new ModuleEntity("IF24", "MSI", "TM", 6));
        ajoute(new ModuleEntity("LO10", "MPL", "TM", 6));

        ajoute(new ModuleEntity("IF10", "MPL", "CS", 6));
        ajoute(new ModuleEntity("IF15", "MSI", "CS", 6));
        ajoute(new ModuleEntity("IF16", "MSI", "TM", 6));
        ajoute(new ModuleEntity("IF17", "MPL", "TM", 6));
        ajoute(new ModuleEntity("IF20", "MSI", "TM", 6));
        ajoute(new ModuleEntity("IF26", "MPL", "TM", 6));


        ajoute(new ModuleEntity("MCS1", "MCS", "CS", 3));
        ajoute(new ModuleEntity("MCS2", "MCS", "TM", 3));
        ajoute(new ModuleEntity("MCS3", "MCS", "TM", 3));
        ajoute(new ModuleEntity("MCS4", "MCS", "TM", 3));
        ajoute(new ModuleEntity("MCS5", "MCS", "TM", 3));
        ajoute(new ModuleEntity("MCS6", "MCS", "TM", 3));
        ajoute(new ModuleEntity("MCS7", "MCS", "TM", 3));
        ajoute(new ModuleEntity("MCS8", "MCS", "CS", 3));
    }

    public ArrayList<String> getSigles() {
        ArrayList res = new ArrayList();
        Iterator iterateur = profil.iterator();
        while (iterateur.hasNext()) {
            Module m = (Module) (iterateur.next());
            res.add(m.getSigle());
        }
        return res;
    }


    public ArrayList<ModuleEntity> getModules() {
        System.out.println(profil.toString());
        return profil;
    }
}
