import java.io.DataInputStream; //classe DataInputStream para a entrada de dados
public class aula03_ex02 {
public static void main(String args[]) {
String linha="";
DataInputStream meuDataInputStream;
meuDataInputStream = new DataInputStream(System.in);
try{
  /**@param Teste de parametros
    * @param Entrada: Este metodo ira receber uma varial inteira
    * @param Processamento: O método calcula o quadrado de um número
    * @param Saida: Devolve o valor com duas casas decimais
    * @return valorCalculado
    * */
  
linha =  meuDataInputStream.readLine();
}
catch (Exception erro) { System.out.println("Erro de leitura"); }

System.out.println(linha);
System.out.print(meuDataInputStream);
} 
}
