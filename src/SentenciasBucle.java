public class SentenciasBucle {
    public static void main(String[] args) {
        for(int i = 1; i <= 7; i++){
            int j = 1;
            while (j <= 8){
                if (i == 6 || i == 7){
                    System.out.println("Día " + i + " Descanso de fin de semana");
                } else {
                    System.out.println("Día " + i + " Día de trabajo duro");
                }
                j++;
            }
        }
    }
}
