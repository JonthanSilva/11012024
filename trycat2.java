import java.util.*;
public class trycat2 {
public static void verificarIdade(short idade)
    public static void main(String[] args) {
        if (idade >= 18) {
        System.out.println("Acesso garantido");
        }else {
            throw new ArithmeticException("Idade não pertida");
        }
    }
    public static void main (String[] args) {
        
    } {
        try{
            Scanner scnInput = new Scanner(System.in);
            System.out.println("Digite sua idade");
            short idadeDigitada = scnInput.nextShort();
            verificarIdade(idadeDigitada);
            scnInput,close()
        }catch (Exception e) {
            Scanner scnSair =new Scanner(System.in);
           // System.err.println("Ops! Ocorreu um erro" + e);
            System.err.println(e.getMessage() + "Presione enter para continuar");
            scnSair.nextLine();
            scnSair.close( );
        }finally{
            System.out.println("Mensagem Final");
        }
    }
}