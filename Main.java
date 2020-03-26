
import java.util.Scanner;
import java.io.File; 
import java.io.*;


class Main {

static String add = "10 0000 ";
static String addi = "00 1000";
static String sub = "10 0010";
static String mult = "00 0010";
static String div = "01 1010";
static String neg = "00 0111";
static String and = "10 0100";
static String andi = "00 1100";
static String or = "10 0101";
static String ori = "001101";
static String xor = "10 0101";
static String nor = "10 0111";
static String slt = "10 1010";
static String slti = "00 1010";
static String sll = "00 0000";
static String srl = "00 0010";
static String lw = "10 0011";
static String sw = "10 1011";
static String beq = "00 0100";
static String bne = "00 0101";
static String j = "00 0010";
static String jr = "00 1000";
static String jal = "00 0011";
static String nop = "00 0000";


  public static void main(String[] args) {
    try {
      File myReader = new File("entrada.txt");
      FileWriter myWriter = new FileWriter("saida.txt");
   
      var sb = new StringBuilder();
      var sc = new Scanner(myReader);
      while(sc.hasNextLine()){
      String line = sc.nextLine();

      // Tradução ---------------------
      line = line.replaceAll("div", div);
      line = line.replaceAll("neg", neg);
      line = line.replaceAll("andi", andi);
      line = line.replaceAll("and", and);
      line = line.replaceAll("ori", ori);
      line = line.replaceAll("or", or);
      line = line.replaceAll("xor", xor);
      line = line.replaceAll("nor", nor);
      line = line.replaceAll("slti", slti);
      line = line.replaceAll("sll", sll);
      line = line.replaceAll("slt", slt);
      line = line.replaceAll("srl", srl);
      line = line.replaceAll("lw", lw);
      line = line.replaceAll("sw", sw);
      line = line.replaceAll("beq", beq);
      line = line.replaceAll("bne", bne);
      line = line.replaceAll("jal", jal);
      line = line.replaceAll("jr", jr);
      line = line.replaceAll("j", j);
      line = line.replaceAll("nop", nop);




      line = line.replaceAll("mult", mult);
      line = line.replaceAll("sub", sub);
      line = line.replaceAll("addi", addi);
      line = line.replaceAll("add", add);
      line = line.replaceAll("sub", sub);
      line += "\n";
      //Fim da tradução
      sb.append(line);

      }
      var FileContent = sb.toString();
      FileContent = FileContent.replaceAll("add", add);
      myWriter.write(FileContent);
      myWriter.close();
		}
		catch (IOException excecao) {
			System.out.println("Erro na leitura do arquivo: " + excecao);	
		}
    
    
  }
}
 
 	