public class Notes {
    private String matiere;
    private int etudiant_id;
    private int valeur;

    public Notes() {
    };

    public Notes(String matiere, int etudiant_id, int valeur) {
        this.matiere = matiere;
        this.etudiant_id = etudiant_id;
        this.valeur = valeur;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getEtudiant_id() {
        return etudiant_id;
    }

    public void setEtudiant_id(int etudiant_id) {
        this.etudiant_id = etudiant_id;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "Etudiant_id=" + etudiant_id +
                ", matiere='" + matiere + '\'' +
                ", valeur=" + valeur +
                '}';
    }
}
