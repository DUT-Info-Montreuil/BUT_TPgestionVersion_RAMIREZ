package fr.iut.montreuil.S05_R08.tp01_GestionVersion.modele.quetes;

public class TalkQuete extends Quete{

    private String pnjName;

    public TalkQuete(String titre, String description, int recompenseOr, String recompenseObjet, int quantiteObjet, String pnj) {
        super(titre, description, recompenseOr, recompenseObjet, quantiteObjet);
        pnjName = pnj;
    }

    public String getPnjName() {
        return pnjName;
    }

}
