package eu.unareil.bo;

abstract public class Produit {
    private long refProd;
    private String marque;
    private String libelle;
    private long qteStock;
    private float prixUnitaire;

    public Produit(long refProd, String marque, String libelle, long qteStock, float prixUnitaire) {
        this.refProd = refProd;
        this.marque = marque;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.prixUnitaire = prixUnitaire;
    }

    public Produit(String marque, String libelle, long qteStock, float prixUnitaire) {
        this.marque = marque;
        this.libelle = libelle;
        this.qteStock = qteStock;
        this.prixUnitaire = prixUnitaire;
    }

    protected long getRefProd() {
        return refProd;
    }

    protected void setRefProd(long refProd) {
        this.refProd = refProd;
    }

    protected String getLibelle() {
        return libelle;
    }

    protected void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    protected String getMarque() {
        return marque;
    }

    protected void setMarque(String marque) {
        this.marque = marque;
    }

    public float getPrixUnitaire() {
        return prixUnitaire;
    }

    protected void setPrixUnitaire(float prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    protected long getQteStock() {
        return qteStock;
    }

    protected void setQteStock(long qteStock) {
        this.qteStock = qteStock;
    }
}
