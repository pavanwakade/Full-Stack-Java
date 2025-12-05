class rec {

    // input 1,2,3,4   
    // output=10  using recurtion
    public static void main(String[] args) {
        int end = 4;
        int result = sum(end);
        System.out.println(result);
    }

   public static int sum(int a){ //4
    if (a==1) {
        return 1;
    }
    return a+sum(a-1);// 4+3
                       //3
   }

    
}