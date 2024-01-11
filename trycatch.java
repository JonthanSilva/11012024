public class trycatch {
public static void main(String[] args) {
    try {
        int resultado = dividir(10,0);
        System.out.println("Resultado" + resultado);
    }catch (ArithmeticException e) {
        System.out.println("Erro de divisão por zero" + e.getMessage());
    }finally{
        System.out.println("Operação concluida");
    }
}
    private static int dividir(int numerador,int denominador){
        return numerador / denominador;
    }
}