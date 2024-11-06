public class Exercisi3{

    public static void main(String[] args){
        double temp = 40;
        int edat = 12;
        int KilosPes = 4;
        int dosisParacetamol = 0;
        

        if (temp < 38){
            System.out.println("El nen està bé");
        }
        if (temp < 39) {
            System.out.println("Es recomanable donar-li un bany per baixar temperatura");
        }

        if (temp == 39){

            if(edat < 3){
              System.out.println("has de consultar al médic");  
            }
            else if(edat < 12){
                dosisParacetamol = 15 * KilosPes;
                System.out.println("Avís: cal donar-li " + dosisParacetamol + " mg de Paracetamol"); 
            }
            else{
                dosisParacetamol = 500;
                System.out.println("Avís: cal donar-li " + dosisParacetamol + " mg de Paracetamol cada 8h");
            }
        }

        if(temp >= 40){
            System.out.println("per més de 40 cal portar-lo a l'hospital");
        }
    }
}