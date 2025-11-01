//Print -> 180deg pyramid
public class rotetedDegPyrmid {
    public static void main(String [] arg){
        int n = 10;
        //outerloop
        for(int i = 1; i <= n; i++){
            //inner loop
            for(int j = 1; j <=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}