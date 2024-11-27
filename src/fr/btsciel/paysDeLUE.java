package fr.btsciel;

public class paysDeLUE {
    public String nom;
    public String capitale;
    public int superficie;
    public double population;
    public int anneeAdhesion;
    public double densite;
    
    public paysDeLUE(String nom, String capitale, int superficie, double population, int anneeAdhesion) {
        this.nom = nom;
        this.capitale = capitale;
        this.superficie = superficie;
        this.population = population;
        this.anneeAdhesion = anneeAdhesion;
    }
    
    public paysDeLUE() {
    }
}