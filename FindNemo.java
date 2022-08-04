class FindNemo {
  public static void findingNemo(String[] nemo){
    long startTime = System.nanoTime();
    for(int i=0;i<nemo.length;i++){
      if(nemo[i]=="nemo"){
        System.out.println("Found Nemo!!");
      }
    }
    long stopTime = System.nanoTime();
    System.out.println(stopTime - startTime);
  }
  public static void main(String[] args) {
    String nemo[]= new String[10];
    nemo[0]="nemo";
    findingNemo(nemo);
  }
}