public class SentenciaIf {

    float promedio = 5.5f;

    public void verificarPromedio(){
        if(promedio >= 6.5){
            System.out.println("Felicidades, excelente resultado");
        }else if(promedio >= 6.0){
            System.out.println("Muy Buen promedio");
        } else if(promedio >= 5.5){
            System.out.println("Buen promedio");
        } else {
            System.out.println("Reprobado");
        }
    }
}
