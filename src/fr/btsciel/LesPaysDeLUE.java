package fr.btsciel;

public class LesPaysDeLUE {
    public PaysDeLUE[] lesPays = new PaysDeLUE[27];
    
    public LesPaysDeLUE() {
        lesPays[0] = new PaysDeLUE("Allemagne", "Berlin", 357569, 83445000, 1995);
        lesPays[1] = new PaysDeLUE("Autriche", "Vienne", 83882, 9158750, 1995);
        lesPays[2] = new PaysDeLUE("Belgique", "Bruxelles", 30667, 11832049, 1958);
        lesPays[3] = new PaysDeLUE("Bulgarie", "Sofia", 110996, 6445481,2007);
        lesPays[4] = new PaysDeLUE("Chypre", "Nicosie", 9253, 933505, 2008);
        lesPays[5] = new PaysDeLUE("Croatie", "Zagreb", 56594,3861967,2013);
        lesPays[6] = new PaysDeLUE("Danemark", "Copenhague", 42925, 5961249, 1973);
        lesPays[7] = new PaysDeLUE("Espagne", "Madrid", 505983, 48610458, 1995);
        lesPays[8] = new PaysDeLUE("Estonie", "Tallinn", 45336, 1374687, 2004);
        lesPays[9] = new PaysDeLUE("Finlande", "Helsinki", 338363, 5603851, 1995);
        lesPays[10] = new PaysDeLUE("France", "Paris", 638475, 68401997, 1958);
        lesPays[11] = new PaysDeLUE("Grece", "Athenes", 131694, 10367193, 1981);
        lesPays[12] = new PaysDeLUE("Hongrie", "Budapest", 93012, 9584627, 2004);
        lesPays[13] = new PaysDeLUE("Irlande", "Dublin", 69947, 5343805, 1973);
        lesPays[14] = new PaysDeLUE("Italie", "Rome", 302073, 58989749, 1958);
        lesPays[15] = new PaysDeLUE("Lettonie", "Riga", 64594, 1871882, 2004);
        lesPays[16] = new PaysDeLUE("Lituanie", "Vilnius", 65284, 2885891, 2004);
        lesPays[17] = new PaysDeLUE("Luxembourg", "Luxembourg", 2595, 672050, 1958);
        lesPays[18] = new PaysDeLUE("Malte", "La Valette", 316, 563443, 2004);
        lesPays[19] = new PaysDeLUE("Pays-Bas", "Amsterdam", 37391, 17942942, 1958);
        lesPays[20] = new PaysDeLUE("Pologne", "Varsovie", 311928, 36620970, 2004);
        lesPays[21] = new PaysDeLUE("Portugal", "Lisbonne", 92226, 10639726, 1986);
        lesPays[22] = new PaysDeLUE("Roumanie", "Bucarest", 238398, 19064409, 2007);
        lesPays[23] = new PaysDeLUE("Slovaquie", "Bratislava", 49035, 5424687, 2004);
        lesPays[24] = new PaysDeLUE("Slovenie", "Ljubljana", 20273, 2123949, 2004);
        lesPays[25] = new PaysDeLUE("Suede", "Stockholm", 447424, 10551707, 1995);
        lesPays[26] = new PaysDeLUE("Tchequie", "Prague", 78871, 10900555, 2004);
    }
    public void triNom() {
        PaysDeLUE buffer;
        for (int i = 0; i < lesPays.length - 1; i++) {
            for (int j = 0; j < lesPays.length - i - 1; j++) {
                if (lesPays[j].nom.compareToIgnoreCase(lesPays[j + 1].nom) > 0) {
                    buffer = lesPays[j];
                    lesPays[j] = lesPays[j + 1];
                    lesPays[j + 1] = buffer;
                }
            }
        }
    }
    public void triCapitale() {
        PaysDeLUE buffer;
        for (int i = 0; i < lesPays.length - 1; i++) {
            for (int j = 0; j < lesPays.length - i - 1; j++) {
                if (lesPays[j].capitale.compareToIgnoreCase(lesPays[j + 1].capitale) > 0) {
                    buffer = lesPays[j];
                    lesPays[j] = lesPays[j + 1];
                    lesPays[j + 1] = buffer;
                }
            }
        }
    }
    public void triPopulation() {
        PaysDeLUE buffer;
        for (int i = 0; i < lesPays.length - 1; i++) {
            for (int j = 0; j < lesPays.length - i - 1; j++) {
                if (lesPays[j].population > lesPays[j + 1].population) {
                    buffer = lesPays[j];
                    lesPays[j] = lesPays[j + 1];
                    lesPays[j + 1] = buffer;
                }
            }
        }
    }
    public void triSuperficie() {
        PaysDeLUE buffer;
        for (int i = 0; i < lesPays.length - 1; i++) {
            for (int j = 0; j < lesPays.length - i - 1; j++) {
                if (lesPays[j].superficie > lesPays[j + 1].superficie) {
                    buffer = lesPays[j];
                    lesPays[j] = lesPays[j + 1];
                    lesPays[j + 1] = buffer;
                }
            }
        }
    }
    public void triDensite() {
        PaysDeLUE buffer;
        for (int i = 0; i < lesPays.length - 1; i++) {
            for (int j = 0; j < lesPays.length - i - 1; j++) {
                if (lesPays[j].getDensite() > lesPays[j + 1].getDensite()) {
                    buffer = lesPays[j];
                    lesPays[j] = lesPays[j + 1];
                    lesPays[j + 1] = buffer;
                }
            }
        }
    }
}