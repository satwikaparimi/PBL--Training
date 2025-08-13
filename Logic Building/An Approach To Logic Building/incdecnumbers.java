class incdecnumbers{
    public static void main(String[] args){
        int rows=10;
        for(int i=1;i<=rows;i++){
            for(int spaces=1;spaces<=rows-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);//left increment numbers
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println(); //For rows
        }
    }
}