public class Exercisi1 {

    public static void main(String[] args) {
        
        int edat = 6;
        evaluarValorCicle(edat);

        if(edat == 6){
            System.out.println("Curs 1");
        } 
        if (edat == 7) {
            System.out.println("Curs 2");
        }
        if (edat == 8) {
            System.out.println("Cura 3");
        }
        if (edat == 9) {
            System.out.println("Curs 4");
        }
        if (edat == 10) {
            System.out.println("Cura 5");
        }
        if (edat == 11) {
            System.out.println("Curs 6");
        }
        
    }


    public static void evaluarValorCicle(int edat){

        if (edat < 3) {
                System.out.println("Es massa petit");
        }
        else if (edat >= 12) {
                System.out.println("Es massa gran");
        }

        else{
            if(edat < 6){
                System.out.println("Es d'educació infantil");
            }
            else if (edat < 8) {
                System.out.println("Es d'educació primaria. Cicle inicial.");
            }
            else if (edat < 10) {
                System.out.println("Es d'educació primaria. Cicle mitjá.");
            }
            else {
                System.out.println("Es d'educació primaria. Cicle superior.");
            }
        } 
    }

}