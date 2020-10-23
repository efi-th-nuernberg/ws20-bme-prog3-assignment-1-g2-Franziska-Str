class Main {
  public static void main(String[] args) {
    Zahlenfilter ();
  }
  public static void Zahlenfilter() {
    for (int i=1; i<201; i++){
      if((i%5)== 0){
       System.out.println("ZAHL " +  i +" ist durch 5 teilbar!");
      }
      if((i%10)== 9){
       System.out.println("ZAHL " + i+   " endet auf 9!");
      }
      if (((i + (i-1))%3)==0){
        System.out.println("ZAHL " +i+ " und VORGÄNGER addiert ergeben ERGEBNIS und ERGEBNIS ist durch 3 teilbar");
      }
    }
  }  
}