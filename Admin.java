import java.util.ArrayList;

public class Admin extends Users {
    private Etudiants etudiantsClasse;

    public Admin() {
        super(1, "Yasser", "EL", "yasser@gmail.com", "0699999999", "1234", false, "Youcode", "admin");
        this.etudiantsClasse = new Etudiants();
    }

}
