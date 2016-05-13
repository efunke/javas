import java.io.*;

public class aula03_ex04
{
  public static void main(String args[]) throws IOException
  {
    String nome;
    int idade=0;
    float altura = 1.7f;
    //Declarando o metodo de entrada padrão
    BufferedReader teclado = new BufferedReader
      (new InputStreamReader(System.in));
    //Lendo o nome do usuario
    System.out.print("Digite um nome: ");
    nome = teclado.readLine();
    //Lendo a idade
    System.out.print("Digite uma idade: ");
    idade = Integer.parseInt(teclado.readLine());
   //Lendo a altua
    try{
      System.out.print("Informe a sua altura");
      altura = Float.parseFloat(teclado.readLine());
    }catch(Exception erro){
      System.out.println("Houve um erro de formato informado ! ("+ erro+ ")");
      System.out.println("Informe a altura com o ponto");
      altura = Float.parseFloat(teclado.readLine());
    }
    
    System.out.println("O nome que você digitou foi "+nome + 
                       " sua idade é "+idade+
                       " sua altura é "+altura);
  }
} 
