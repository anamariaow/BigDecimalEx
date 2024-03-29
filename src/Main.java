import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum, crei un metodo per calcolare l'operazione richiesta e ritorni il risultato.
        BigDecimal numero1 = new BigDecimal("345.67");
        BigDecimal numero2 = new BigDecimal("456.78");

        //Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo
        System.out.println("Il risultato della moltiplicazione tra il numero " + numero1 + " e il numero " + numero2 + " è: " + Operazione(numero1, numero2, OperazioneEnum.MOLTIPLICAZIONE));

    }
    public static BigDecimal Operazione(BigDecimal numero1, BigDecimal numero2, OperazioneEnum operazioneEnum) {
        switch (operazioneEnum) {
            case ADDIZIONE:
                System.out.println("Addizione: ");
                return numero1.add(numero2);
            case SOTTRAZIONE:
                System.out.println("Sottrazione: ");
                return numero1.subtract(numero2);
            case MOLTIPLICAZIONE:
                System.out.println("Moltiplicazione: ");
                return numero1.multiply(numero2);
            case DIVISIONE:
                System.out.println("Divisione: ");
                 return numero1.divide(numero2);
            case MIN:
                System.out.println("Numero minimo: ");
                return numero1.min(numero2);
            case MAX:
                System.out.println("Numero massimo: ");
                return numero1.max(numero2);
            default:
                throw new ArithmeticException("Errore: operazione impossibile da eseguire" + operazioneEnum);
        }
    }
}