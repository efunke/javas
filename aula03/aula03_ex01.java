import java.io.DataInputStream; //classe DataInputStream para a entrada de dados
public class aula03_ex01 {
public static void main(String args[]) {
String linha="";
DataInputStream meuDataInputStream;
meuDataInputStream = new DataInputStream(System.in);
try{
linha = meuDataInputStream.readLine();
}
catch (Exception erro) { System.out.println("Erro de leitura"); }

System.out.println(linha);
} 
}
