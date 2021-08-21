public class Main {
  public static void main(String [] args) {
    int AlphabetNumerical = 5;
    System.out.print("Nilai A = " + AlphabetNumerical + "\n");
    //pengkondisian if jika true
    if (AlphabetNumerical == 5 ) {
      System.out.print("Ini adalah jalur true \n");
    } else {
      System.out.print("Ini adalah jalur false \n");
    }
    //pengkondisian jika false
    if ( AlphabetNumerical == 10 ) {
      System.out.print("Ini adalah jalur true (2) \n");
    } else {
      System.out.print("Ini adalah jalur false (2) \n");
    }
    //AlphabetNumerical bukanlah 10,melainkan 5 maka dari itu akan false dan turun ke bawah sebagai jakur seksekusi false
  }
}