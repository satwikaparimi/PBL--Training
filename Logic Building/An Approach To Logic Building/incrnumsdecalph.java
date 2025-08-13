class incrnumsdecalph{
    public static void main(String[] args){
        int rows=10;
        for(int i=1;i<=rows;i++){
            for(int spaces=1;spaces<=rows-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(j);
            }
            for(char ch=(char)('A'+i-3);ch>='A';ch--){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}