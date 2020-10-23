class Main {
  public static void main(String[] args) {
    Zahlenfilter ();
  }
  public static void Zahlenfilter() {
    for (int i=1; i<201; i++){
      if((i%5)== 0){
       System.out.println(i +" ist durch 5 teilbar!");
      }
      if((i%10)== 9){
       System.out.println(i+   " endet auf 9!");
      }
      if (((i + (i-1))%3)==0){
        int z = (i-1);
        int j = i +z;
        System.out.println(i+ " und " + z +" addiert ergeben " + j + " und " +j + " ist durch 3 teilbar!");
      }
    }
  }  
}