
public class numHalfPraymid {
    public static void main(String [] arg){
        int n = 10;
        
        //outerloop -> print line
        for(int i=1; i <=n; i++){
            
            //innerloop -> print *
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}