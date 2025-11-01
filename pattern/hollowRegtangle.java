//Print hollow regtangle
public class hollowRegtangle {
    public static void main(String [] arg){
        int n = 9;
        int m = 10;
        //outer loop
        for(int i=1; i <=n; i++){
            //inner lopp
            for(int j=1; j<=m; j++){
                //Cell(i,j)
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}