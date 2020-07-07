
    import java.util.Scanner;
    public class HILO {
        public static void main (String[] args){
            int max = 101;
            int min = 0;
            int nbrEntre = 0;
            int partiesJouees = 0 ;
            int partiesGagnees = 0;
            String decision = null;
            String resultat = null;
            String annonce = null;
            int tauxReussite = 0;
            Scanner input = new Scanner(System.in);


            do{
                int nbrMystere = (int) (Math.random()*(max-min)+min-max);
                System.out.println ("Veuillez entrer un nombre:");
                nbrEntre = input.nextInt ();
                int nbrTentatives= 1;
                do{

                    if (( nbrEntre >= 0 ) && (nbrEntre <= 100)) {

                        if (nbrEntre>nbrMystere){
                            System.out.println ("Plus bas");
                        }else if (nbrEntre<nbrMystere){
                            System.out.println ("Plus haut");
                        }nbrTentatives= nbrTentatives+nbrTentatives;
                    }

                    else {
                        System.out.println ("Le nombre doit etre entre 0 et 100 inclusivement! Veuillez etrer un nouveau nombre:");
                    }
                    nbrEntre= input.nextInt();
                    if (nbrEntre==nbrMystere){
                        System.out.println ("Bravo vous avez gagner");
                        partiesGagnees = partiesGagnees+partiesGagnees;
                    }else if (nbrEntre!=nbrMystere && nbrTentatives==10){
                        System.out.println ("désolé! Vous avez perdu");}

                }while (nbrEntre!=nbrMystere && nbrTentatives<10);
                partiesJouees = partiesJouees+partiesJouees;
                do{
                    System.out.println("Voulez-vous jouer une nouvelle partie? (oui/non)");
                    decision = input.next();
                    if (decision.equalsIgnoreCase("non")){
                        resultat = "Vous avez joué " +partiesJouees +" partie";
                        if (partiesJouees>1){
                            resultat = resultat+"s";

                        }
                        System.out.println (resultat);
                        String ch1= "Vous avez gagné "+partiesGagnees+" partie";
                        String ch2= "sur les" + partiesJouees+ "parties jouées.";
                        if (partiesGagnees>1){
                            ch1 = ch1 + "s";}
                        ch2 = " sur la seule partie que vous avez joué.";

                    annonce = ch1+ch2;
                    System.out.println (annonce);
                    tauxReussite = (partiesGagnees*100)/partiesJouees;
                    System.out.println ("Votre taux de succès est: " +tauxReussite+ "%");
                }

            }while(!decision.equalsIgnoreCase ("non") && !decision.equalsIgnoreCase ("oui"));
        }while (decision.equalsIgnoreCase ("oui"));
    }}
