class FindNemo {
  public static void findingNemo(String[] nemo){
    for(int i=0;i<nemo.length;i++){
      if(nemo[i]=="nemo"){
        System.out.println("Found Nemo!!");
      }
    }
  }
  public static void main(String[] args) {
    String nemo[]= new String[10];
    nemo[0]="nemo";
    findingNemo(nemo);
  }
}