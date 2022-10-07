package tp6classes;
/*Class principale*/
public class Train {
    //Attributs
    private int vitesse = 0;
    private boolean enMarche = false;

    public int getVitesse(){
        return vitesse;
    }
    public void setVitesse(int uneVitesse){
        vitesse = uneVitesse;
    }
    public void setEnMarche(boolean unEtat){
        enMarche = unEtat;
    }

    //Méthodes
    public static void demarrer(){
        System.out.println("Démarrage");
    }
    public static void stopper(){
        System.out.println("Arrêt");
    }

}
