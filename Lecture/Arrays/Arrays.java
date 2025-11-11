
public class Arrays {
    public static void main(String arg []){
        System.out.println("Arrays declear System 1.\n");
        //Array delcear system 1.
            //type[] arrayName = new int[];
        int[] numbars = new int[3];
        numbars[0] = 10; // index 1
        numbars[1] = 20; // index 2
        numbars[2] = 40; // index 3
        //print arrays using loop
        for(int i = 0; i < 3; i++){
            System.out.println(numbars[i]);
        }
        System.out.println("\nArrays declear System 2.\n");
        //Arrays declear System 2.
            //type[] arrayName = {//value};
        int[] marks = {80,90,100};
        //Access elemet
        System.out.print(marks[0]);
        
        //Access element using loop
        for(int i = 0; i < 3; i++){
            System.out.println(marks[i]);
        }
    }
}