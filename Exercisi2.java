public class Exercisi2 {
    public static void main(String[] args) {
        
        int notaProva = 6;
        int numeroLliurament = 50;
        int notaPractiques = 4;
        boolean noSeguidaAC = true;

        int notaLliuraments = TotalLliuraments (numeroLliurament);

        double notaFinal = 0.2 * notaProva + 0.1 * notaLliuraments + 0.7 * notaPractiques;
        System.out.println(notaFinal);

        if (notaProva < 7){
            notaProva = 0;
            System.out.println("està suspés per la prova final");
        }
        
        while (noSeguidaAC) {
            if (notaLliuraments < 70) {
                System.out.println("està suspés, no ha seguit avaluació continua");
            }
            if (notaFinal < 5) {
                System.out.println("recomendació: cal seguir l'avaluació continua");
            }
            noSeguidaAC = false;
        } 
        if (notaFinal < 5) {
                System.out.println("recomendació: fes els exercicis preparatoris per a la PAF2");
        }
    }



    public static int TotalLliuraments (int ValorLliuraments){
      
        if (ValorLliuraments < 70){
            return 0;
        }
        if (ValorLliuraments == 100) {
            return 10; 
        }
        else if (ValorLliuraments >= 90) {
            return  8;
        }
        else if (ValorLliuraments >= 80) {
            return 6;
        }
        else if (ValorLliuraments >= 70) {
            return 4;
        }

        return 0;
    }
}
