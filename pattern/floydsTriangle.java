
public class floydsTriangle {
    public static void main(String [] arg){
        int n = 10;
        int numbar = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j <=i; j++){
                System.out.print(numbar+ " ");
                numbar++;
            }
            System.out.println();
        }
    }
}