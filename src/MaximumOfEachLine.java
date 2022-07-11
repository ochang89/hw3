import java.util.*;
import java.io.*;

public class MaximumOfEachLine {
    public static void main(String[] args) {
        // read data
        File file = new File("data.txt");

        try (Scanner input = new Scanner(file)){
            while(input.hasNext()) {
                String s = input.nextLine();
                String[] sp = s.split(" ");
                String[] nums = sp[2].split(",");
                int[] numArray = new int[nums.length];
                int max = numArray[0];

                for (int i = 0; i < nums.length-1; i++) {
                    numArray[i] = Integer.parseInt(nums[i]);
                    if(numArray[i] > max) {
                        max = numArray[i];
                    }
                }
                System.out.format("%s %s\tMax: %d\n",sp[0],sp[1],max);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found.");
        }
    }
}