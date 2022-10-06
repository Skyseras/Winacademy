import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Etudiants etudiants = new Etudiants();
        EtudiantFunc efunc = new EtudiantFunc();

        Enseignants enseignants = new Enseignants();
        EnseignantFunc sfunc = new EnseignantFunc();

        Notes note = new Notes();
        NoteFunc nfunc = new NoteFunc();

        Matieres matieres = new Matieres();
        MatiereFunc mfunc = new MatiereFunc();

        Scanner s = new Scanner(System.in);
        int cmenu;
        int cinsert;
        int cdisplay;
        int csearch;
        int cdelete;
        int cupdate;
        do {
            System.out.println("-------------------------------WINACADEMY------------------------------");
            System.out.println("1. Pour inserer les données");
            System.out.println("2. Pour afficher les données");
            System.out.println("3. Pour rechercher les données");
            System.out.println("4. Pour supprimer les données");
            System.out.println("5. Pour modifier les données");
            System.out.println("6. Pour Quitter le program");
            System.out.print("Entrer votre choix: ");
            cmenu = s.nextInt();

            switch (cmenu) {
                case 1:
                    System.out.println("1. (inserer) Etudiant");
                    System.out.println("2. (inserer) Enseigant");
                    System.out.println("3. (inserer) Matiere");
                    System.out.println("4. (inserer) Note");
                    System.out.print("Entrer votre choix: ");
                    cinsert = s.nextInt();
                    switch (cinsert) {
                        case 1:
                            efunc.ajouterEtudiant(etudiants);
                            break;
                        case 2:
                            sfunc.ajouterEnseignant(enseignants);
                            break;
                        case 3:
                            mfunc.ajouterMatiere(matieres);
                            break;
                        case 4:
                            System.out.println("entrer id etudiant");
                            int id_etu = s.nextInt();
                            nfunc.ajouterNote(id_etu, note, efunc);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1. (afficher) Tout les Etudiants");
                    System.out.println("2. (afficher) Tout les Enseigants");
                    System.out.println("3. (afficher) Toutes les Matieres");
                    System.out.println("4. (afficher) Notes pour etudiant");
                    System.out.print("Entrer votre choix: ");
                    cdisplay = s.nextInt();
                    switch (cdisplay) {
                        case 1:
                            efunc.afficherEtudiant();
                            break;
                        case 2:
                            sfunc.afficherEnseignant();
                            break;
                        case 3:
                            mfunc.afficherMatiere();
                            break;
                        case 4:
                            nfunc.afficherNotes(s);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. (rechercher) Etudiant par id");
                    System.out.println("2. (rechercher) Enseigant par id");
                    System.out.print("Entrer votre choix: ");
                    csearch = s.nextInt();
                    switch (csearch) {
                        case 1:
                            System.out.println("Entrer Id etudiant");
                            int id_etudiant = s.nextInt();
                            efunc.trouverEtudiantparid(id_etudiant);
                            break;
                        case 2:
                            System.out.println("Entrer le id enseignant");
                            int id_ens = s.nextInt();
                            sfunc.trouverEnseignantparid(id_ens);
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1. (supprimer) Etudiant");
                    System.out.println("2. (supprimer) Enseignant");
                    System.out.println("3. (supprimer) Matiere");
                    System.out.print("Entrer votre choix: ");
                    cdelete = s.nextInt();
                    switch (cdelete) {
                        case 1:
                            System.out.println("Entrer l'ID de l'Etudiant");
                            int id_etudiant = s.nextInt();
                            efunc.supprimerEtudiant(id_etudiant);
                            break;
                        case 2:
                            System.out.println("Entrer l'ID de l'Enseignant");
                            int id = s.nextInt();
                            sfunc.supprimerEnseignant(id);
                            break;
                        case 3:
                            System.out.println("Entrer le Nom de la matière");
                            String nom_mat = s.nextLine();
                            mfunc.supprimerMatiere(nom_mat);
                            break;
                    }
                    break;

                case 5:
                    System.out.println("1. (Modifier) Etudiant");
                    System.out.println("2. (Modifier) Enseigant");
                    System.out.println("3. (Modifier) Matiere");
                    System.out.print("Entrer votre choix: ");
                    cupdate = s.nextInt();
                    switch (cupdate) {
                        case 1:
                            System.out.println("Entrer le numero de l'etudiant :");
                            int id_etudiant = s.nextInt();
                            efunc.modifierEtudiant(id_etudiant, s);
                            break;
                        case 2:
                            System.out.println("Entrer le numero d'enseignant :");
                            int id_enseignant = s.nextInt();
                            sfunc.modifierEnseignant(id_enseignant, s);
                            break;
                        case 3:
                            System.out.println("Entrer le nom de la matiere :");
                            String nom_mat = s.next();
                            mfunc.modifierMatiere(nom_mat, s);
                            break;
                    }
                    break;

                case 6:
                    break;
            }
        } while (cmenu != 0);
    }
}