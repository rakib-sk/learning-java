//Print solid regtangle
public class solidRegtangle {
    public static void main(String [] arg){
        int n = 10;
        int m = 10;
        //outer loop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <= m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}