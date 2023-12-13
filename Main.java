import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> resultado= new ArrayList<Integer>();
      Random rnd = new Random();
      int n1sorteados = rnd.nextInt(100);
      int n2sortedos = rnd.nextInt(100);
      int n3sortedos = rnd.nextInt(100);
      int n4sortedos = rnd.nextInt(100);
      Scanner scan = new Scanner(System.in);
      System.out.println("Mega-Sena");
      System.out.println("Digite 4 numeros por favor");
      System.out.println("DIgite o primeiro número");
      int n1 = scan.nextInt();
      System.out.println("DIgite o segundo número");
      int n2 = scan.nextInt();
      System.out.println("DIgite o terceiro número");
      int n3 = scan.nextInt();
      System.out.println("DIgite o quarto número");
      int n4 = scan.nextInt();
       if(n1 == n1sorteados && n2 == n2sortedos && n3== n3sortedos && n4 == n4sortedos){
         System.out.println("Parabens!! Voce ganhou a mega-sena!!");
       }else{
         System.out.println("Não foi dessa vez!");
       }
       //criei um array para depois iterar cada numero com essa estrutura
      //for (tipoDeElemento nomeDoElemento : colecao)
      int[] numerosSorteados = {n1sorteados, n2sortedos, n3sortedos, n4sortedos};
  for(int numero : numerosSorteados){
    System.out.println("Esses foram os numeros:" + numero);
  }

    }
}