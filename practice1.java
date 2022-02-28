
import java.util.ArrayList;

public class practice1 {
    public static void main (String args[]){
        // System.out.println("hola");
        // System.out.println(8/2);

        int x = 4;
        int y = 3;

        // System.out.println(x/y);
        

        
        // System.out.println(v1);

        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        nums.add(5);
        nums.add(6);
        nums.add(9);

        int index = nums.indexOf(9);  // get index of an element 
        System.out.println(index);


        System.out.println(nums.get(2)); // get element by index
       
        nums.set(2,52); // change value at index 2

        nums.remove(1); // remove an element by using index

        nums.size(); // size of the arraylist
       
        System.out.println(nums.toString());
         

    }


}