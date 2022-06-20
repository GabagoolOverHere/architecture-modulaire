package eu.unareil.bo;

import java.util.List;

public class CartePostale extends Produit {
    List<Auteur> lesAuteurs;
    private String type;

    public CartePostale(long refProd, String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> lesAuteurs, TypeCartePostale type) {
        super(refProd, marque, libelle, qteStock, prixUnitaire);
        this.lesAuteurs = lesAuteurs;
        this.type = type.toString();
    }

    public CartePostale(String marque, String libelle, long qteStock, float prixUnitaire, List<Auteur> lesAuteurs, TypeCartePostale type) {
        super(marque, libelle, qteStock, prixUnitaire);
        this.lesAuteurs = lesAuteurs;
        this.type = type.toString();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("CartePostale [libelle=%s, marque=%s, prixUnitaire=%s euros,\n" +
            "qteStock=%s, auteur(s)=");
        for (Auteur a : lesAuteurs) {
            sb.append(String.format("auteur%d=%s, ", count, a.toString()));
            count++;
        }
        sb.append(String.format("type=%s]", getType()));
        return sb.toString();
    }
}