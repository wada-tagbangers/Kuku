public class Kuku{
  public static void main (String[] args){
    System.out.print("    ");

    for(int i=1;i<10;i++){
      System.out.print(i);
      System.out.print("  ");
    }
    System.out.println();

    for(int i=1;i<10;i++){
      System.out.print(i + "|");
      for(int j=1;j<10;j++){
        if(i*j<10){
          System.out.print("  ");
          System.out.print(i * j);
        }
        if(i*j>9){
          System.out.print(" ");
          System.out.print(i * j);
        }
      }
      System.out.println("");
    }
  }
}
