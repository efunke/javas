public class aula03_ex06
{
  public static void main (String args[])
  {
    System.out.println("Tecle \"Enter\"  ou qualquer tecla para terminar.");
    try{
         System.in.read();
    } catch (Exception erro) {
     erro.printStackTrace();
  }
  }
}
