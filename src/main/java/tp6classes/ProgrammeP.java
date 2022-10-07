package tp6classes;

public class ProgrammeP {
    public static void main(String[] args) {
        Train unTrain = new Train();

        unTrain.enMarche = true;
        unTrain.demarrer();
        System.out.println(unTrain.vitesse = 0);

        //Vitesse à 30
        System.out.println(unTrain.vitesse = 30);

        //Vitesse à 60
        System.out.println(unTrain.vitesse = 60);

        //Vitesse à 0
        System.out.println(unTrain.vitesse = 0);

        unTrain.stopper();
        unTrain.enMarche = false;
    }
}
