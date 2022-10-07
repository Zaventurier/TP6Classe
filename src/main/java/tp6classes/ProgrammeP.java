package tp6classes;

public class ProgrammeP {
    public static void main(String[] args) {
        Train unTrain = new Train();

        unTrain.setEnMarche(true);
        unTrain.demarrer();
        unTrain.setVitesse(0);
        System.out.println(unTrain.getVitesse());

        //Vitesse à 30
        unTrain.setVitesse(30);
        System.out.println(unTrain.getVitesse());

        //Vitesse à 60
        unTrain.setVitesse(60);
        System.out.println(unTrain.getVitesse());

        //Vitesse à 0
        unTrain.setVitesse(0);
        System.out.println(unTrain.getVitesse());

        unTrain.stopper();
        unTrain.setEnMarche(false);
    }
}
