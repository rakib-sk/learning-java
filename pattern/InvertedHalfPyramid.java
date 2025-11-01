
public class InvertedHalfPyramid {
    public static void main(String [] arg){
        int n = 4;
        for(int i = 1; i >= n; i++){
            //outerloop
            for(int j=1; j == i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}