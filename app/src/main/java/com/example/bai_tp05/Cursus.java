package com.example.bai_tp05;


import java.util.ArrayList;
import java.util.Iterator;


public class Cursus {
    private ArrayList<Module> profil;

    public Cursus() {
        profil = new ArrayList();
        init();
    }

    public void ajoute(Module m) {
        profil.add(m);
    }

    public void init() {
        ajoute(new Module("GL02", "TCBR", "CS", 6));
        ajoute(new Module("NF16", "TCBR", "CS", 6));
        ajoute(new Module("NF20", "TCBR", "CS", 6));
        ajoute(new Module("IF09", "TCBR", "TM", 6));
        ajoute(new Module("IF14", "TCBR", "TM", 6));
        ajoute(new Module("LO02", "TCBR", "TM", 6));
        ajoute(new Module("NF21", "TCBR", "TM", 6));

        ajoute(new Module("IF02", "TCBR", "CS", 6));
        ajoute(new Module("LO12", "TCBR", "CS", 6));
        ajoute(new Module("IF08", "TCBR", "CS", 6));
        ajoute(new Module("EG23", "TCBR", "TM", 6));
        ajoute(new Module("IF03", "TCBR", "TM", 6));
        ajoute(new Module("LO07", "TCBR", "TM", 6));
        ajoute(new Module("NF19", "TCBR", "TM", 6));

        ajoute(new Module("IF05", "MPL", "CS", 6));
        ajoute(new Module("IF19", "MSI", "CS", 6));
        ajoute(new Module("IF11", "MPL", "TM", 6));
        ajoute(new Module("IF22", "MSI", "TM", 6));
        ajoute(new Module("IF24", "MSI", "TM", 6));
        ajoute(new Module("LO10", "MPL", "TM", 6));

        ajoute(new Module("IF10", "MPL", "CS", 6));
        ajoute(new Module("IF15", "MSI", "CS", 6));
        ajoute(new Module("IF16", "MSI", "TM", 6));
        ajoute(new Module("IF17", "MPL", "TM", 6));
        ajoute(new Module("IF20", "MSI", "TM", 6));
        ajoute(new Module("IF26", "MPL", "TM", 6));


        ajoute(new Module("MCS1", "MCS", "CS", 3));
        ajoute(new Module("MCS2", "MCS", "TM", 3));
        ajoute(new Module("MCS3", "MCS", "TM", 3));
        ajoute(new Module("MCS4", "MCS", "TM", 3));
        ajoute(new Module("MCS5", "MCS", "TM", 3));
        ajoute(new Module("MCS6", "MCS", "TM", 3));
        ajoute(new Module("MCS7", "MCS", "TM", 3));
        ajoute(new Module("MCS8", "MCS", "CS", 3));
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


    public ArrayList<Module> getModules() {
        System.out.println(profil.toString());
        return profil;
    }
}
