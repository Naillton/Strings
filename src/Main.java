public class Main {
  public static void main(String[] args) {
    RString str = new RString("Frase muito boa para testes");
    String rFrase = str.getFrase();
    String rTest = str.training("So treinando interfaces");
    System.out.println(rFrase);
    System.out.println(rTest);
    // usando regex para sinalizar que estou querendo subistituir o espaço em branco
    // podemos usar o replaceAll para subistituir caracteres tambem
    String rplacedWhiteSpace = rFrase.replaceAll("\\s","|");
    System.out.println(rplacedWhiteSpace);
    // usando o replace para subistituir um charactere
    String replaceChar = rFrase.replace("e", "3");
    System.out.println(replaceChar);
    // o split divide uma frase em arrays, podemos usar um foreach para interar sobre ele
    // como vimos abaixo ou usar a poosicao do array para acessar
    String[] splitFrase = rFrase.split("\\s", 3);
    //System.out.println(splitFrase[0]);
    /* for (String f : splitFrase) {
      System.out.println(f);
    } */
    // usando indexof para retornar a posição de um caracter na frase
    int indString = rFrase.indexOf("o");
    int nextIndStrinf = rFrase.indexOf("o", 13);
    System.out.println(indString);
    System.out.println(nextIndStrinf);
    // também temos a substring onde eu consigo retornar uma determinada string
    // passando como parametro seu comeco e o final
    String subStr = rFrase.substring(11, 20);
    System.out.println(subStr);
    /*
     Existem outros metodos para tratar string, como o strip e o trim, onde ambos servem
     para retornar strings sem espaço em branco no inicio e no final das frases
     */
  }
}