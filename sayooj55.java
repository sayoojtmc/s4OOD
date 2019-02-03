class sayooj55{
    public static void main(String[] args){
        int n=21;
        int i, j , k=0;
        for (i=1; i<=n; i++) {         //Upper part
          if(i<=n/2){
            for (j=0; j<n-i; j++) {
              System.out.print(" ");
            }
            for (j=0; j<(2*i-1); j++) {
              System.out.print("1");
            }
            System.out.println();
          }
          else{
            for (j=0; j<n-i; j++) {
              System.out.print(" ");
            }
            for (j=0; j<(2*i-1); j++) {
              if(n/2<=j&&j<=n/2-1+2*k)
                System.out.print(" ");
              else
                System.out.print("1");

            }
            System.out.println();
            k++;
          }

        }
        k=n/2;
        for (i=n; i>=0; i--) {         //LOWER PART
          if(i>=n/2){
            for (j=0; j<n-i; j++) {
              System.out.print(" ");
            }
            for (j=0; j<(2*i-1); j++) {
              if(n/2<=j&&j<=n/2+2*k)
                System.out.print(" ");
              else
                System.out.print("1");

            }
            System.out.println();
            k--;

          }
          else{

            for (j=0; j<n-i; j++) {
              System.out.print(" ");
            }
            for (j=0; j<(2*i-1); j++) {
              System.out.print("1");
            }
            System.out.println();
          }

        }
    }
}
