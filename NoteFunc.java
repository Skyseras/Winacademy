import java.util.*;
import java.util.stream.Collectors;

public class NoteFunc {
    LinkedList<Notes> list;

    public NoteFunc() {
        this.list = new LinkedList<>();
    }

    public void afficherNotes(Scanner scan) {
        if (list.isEmpty()) {
            System.out.println("Liste des etudiants vide ");
        } else {
            System.out.println("Entrer id etudiant");
            int id_etudiant = scan.nextInt();
            System.out.println(
                    list.stream().filter(id_e -> id_e.getEtudiant_id() == id_etudiant).collect(Collectors.toList()));
        }
    }

    public void ajouterNote(int etudiant_id, Notes notes, EtudiantFunc eFunc) {
        if (eFunc.trouverEtudiant(etudiant_id) == null) {
            System.out.println("etudiant non trouvée");
        } else {
            Scanner scan = new Scanner(System.in);
            System.out.println("entrer  La matiere");
            String matiere = scan.nextLine();
            System.out.println("entrer  La note");
            int valeur = scan.nextInt();
            notes = new Notes(matiere, etudiant_id, valeur);
            list.add(notes);
            System.out.println("Note ajouter par succès");
        }
    }

}
