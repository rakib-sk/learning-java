
public class Functions {
    public static void print(String name){
        System.out.print(name);
        return; //Create String name print function
    }
    
    public static void printInt(int name){
        System.out.print(name);
        return; //Create String name print function
    }
    
    public static int sumTwoNum(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String [] arg){
        int sum = sumTwoNum(10,20);
        print("sum is = ");
        printInt(sum);
    }
}