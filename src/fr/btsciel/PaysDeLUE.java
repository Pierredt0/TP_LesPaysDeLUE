package fr.btsciel;

public class PaysDeLUE {
    public String nom;
    public String capitale;
    public int superficie;
    public double population;
    public int anneeAdhesion;
    public double getDensite() {
        return this.population / this.superficie;
    }
    
    public PaysDeLUE() {
    }
    
    public PaysDeLUE(String nom, String capitale, int superficie, double population, int anneeAdhesion) {
        this.nom = nom;
        this.capitale = capitale;
        this.superficie = superficie;
        this.population = population;
        this.anneeAdhesion = anneeAdhesion;
        this.getDensite();
    }
    
    
    
}