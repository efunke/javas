import java.io.*;
public class aula03_ex05
{
  public static void main(String args[]) throws IOException
  {
    int numero=0;
    String entrada;
    int dobro;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Digite um numero inteiro: ");
    entrada = teclado.readLine(); 
    try
    {
      numero = Integer.parseInt(entrada);
      dobro = numero * 2;
      System.out.println("O dobro do n�mero "+numero+" � "+dobro+".");
    }
    catch (Exception e)
    {
      System.out.println("N�o � inteiro");
    }
    
    
  }
} 
