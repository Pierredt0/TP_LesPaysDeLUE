package fr.btsciel;

import fr.btsciel.clavier.In;

import java.text.DecimalFormat;

public class Ihm {
    static LesPaysDeLUE gestion = new LesPaysDeLUE();
    public static void main(String[] args) {
        /*for (int i = 0; i < gestion.lesPays.length; i++) {
            System.out.println(gestion.lesPays[i].nom + " " + gestion.lesPays[i].capitale + " " + gestion.lesPays[i].superficie + " m² " + gestion.lesPays[i].population + " habitants et à adherer à l'UE en " + gestion.lesPays[i].anneeAdhesion);
        }*/
        int choix = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat df2 = new DecimalFormat("00,000.##");
        
        System.out.print("""
            1   Pour lister les pays par ordre croissant du nom
            2   Pour lister les pays par ordre croissant de la capitale
            3   Pour lister les pays par ordre croissant du nombre d'habitants
            4   Pour lister les pays par ordre croissant de la superficie
            
            """);
        System.out.print("Votre choix : ");
        choix = In.readInteger();
        
        switch (choix) {
            case 1:
                gestion.triNom();
                for (int i = 0; i < gestion.lesPays.length; i++) {
                    System.out.println("Pays : " + gestion.lesPays[i].nom.toUpperCase() + ". Capitale : " + gestion.lesPays[i].capitale + ". Superficie " + gestion.lesPays[i].superficie + " m².\nNombre d'habitants " + df2.format(gestion.lesPays[i].population) + ". Date adhération l'UE en " + gestion.lesPays[i].anneeAdhesion + ".\nLa densité est de " + df.format(gestion.lesPays[i].getDensite()) + " habitants par km²");
                    System.out.println();
                }
                break;
            case 2:
                gestion.triCapitale();
                for (int i = 0; i < gestion.lesPays.length; i++) {
                    System.out.println("Pays : " + gestion.lesPays[i].nom.toUpperCase() + ". Capitale : " + gestion.lesPays[i].capitale + ". Superficie " + gestion.lesPays[i].superficie + " m².\nNombre d'habitants " + df2.format(gestion.lesPays[i].population) + ". Date adhération l'UE en " + gestion.lesPays[i].anneeAdhesion + ".\nLa densité est de " + df.format(gestion.lesPays[i].getDensite()) + " habitants par km²");
                    System.out.println();
                }
                break;
            case 3:
                gestion.triPopulation();
                for (int i = 0; i < gestion.lesPays.length; i++) {
                    System.out.println("Pays : " + gestion.lesPays[i].nom.toUpperCase() + ". Capitale : " + gestion.lesPays[i].capitale + ". Superficie " + gestion.lesPays[i].superficie + " m².\nNombre d'habitants " + df2.format(gestion.lesPays[i].population) + ". Date adhération l'UE en " + gestion.lesPays[i].anneeAdhesion + ".\nLa densité est de " + df.format(gestion.lesPays[i].getDensite()) + " habitants par km²");
                    System.out.println();
                }
                break;
            case 4:
                gestion.triSuperficie();
                for (int i = 0; i < gestion.lesPays.length; i++) {
                    System.out.println("Pays : " + gestion.lesPays[i].nom.toUpperCase() + ". Capitale : " + gestion.lesPays[i].capitale + ". Superficie " + gestion.lesPays[i].superficie + " m².\nNombre d'habitants " + df2.format(gestion.lesPays[i].population) + ". Date adhération l'UE en " + gestion.lesPays[i].anneeAdhesion + ".\nLa densité est de " + df.format(gestion.lesPays[i].getDensite()) + " habitants par km²");
                    System.out.println();
                }
                break;
            case 5:
                gestion.triDensite();
                for (int i = 0; i < gestion.lesPays.length; i++) {
                    System.out.println("Pays : " + gestion.lesPays[i].nom.toUpperCase() + ". Capitale : " + gestion.lesPays[i].capitale + ". Superficie " + gestion.lesPays[i].superficie + " m².\nNombre d'habitants " + df2.format(gestion.lesPays[i].population) + ". Date adhération l'UE en " + gestion.lesPays[i].anneeAdhesion + ".\nLa densité est de " + df.format(gestion.lesPays[i].getDensite()) + " habitants par km²");
                    System.out.println();
                }
                break;
            case 6:
                
        }
    }
}