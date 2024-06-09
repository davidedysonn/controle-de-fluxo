import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int p1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int p2 = sc.nextInt();
        try{
            contar(p1,p2);
        }catch (ParametrosInvalidosException e){

        }


        sc.close();
    }
    static void contar(int p1, int p2) throws ParametrosInvalidosException{
        if(p1>p2){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
        else {
            int cont = p2 - p1;
            for (int i =1; i<=cont;i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }

}
