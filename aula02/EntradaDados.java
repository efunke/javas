import java.io.*;

public class EntradaDados
{
  public static void main(String args[]) throws IOException
  {
    String nome;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Digite um nome: ");
    nome = teclado.readLine();
    System.out.println("O nome que voc� digitou foi "+nome);
  }
} 
