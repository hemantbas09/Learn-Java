package collection;

import java.util.*;

public class Day4Loops {
    public static void run() {
        System.out.println("=== Day 4 ===");

        // 1. Create a List<Integer> with the numbers 1 to 10 (make it changeable)
        List<Integer> nums= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        // 2. Print every number using a for-each loop

        for(Integer n:nums){
            System.out.println(n);
        }

//            1
//            2
//            3
//            4
//            5
//            6
//            7
//            8
//            9
//            10

        // 3. WRONG way: remove even numbers inside a for-each loop.
        //    Wrap it in try/catch (ConcurrentModificationException) and print the message.

        try{
            for(Integer num:nums){
                if(num%2 ==0){
                    nums.remove(Integer.valueOf(num));
                }
            }
        }
        catch (ConcurrentModificationException e){
            System.out.println(e.getMessage());
        }



        // 4. Rebuild the list. RIGHT way: remove even numbers using an Iterator. Print the list.
        List<Integer> nums1= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
        Iterator<Integer> it= nums1.iterator();
        while(it.hasNext()){
            if(it.next() % 2 ==0 ){
                it.remove();
            }
        }
        System.out.println("list after remove even number " + nums1); //[1,3,5,7,9]

        // 5. Rebuild the list. Remove numbers greater than 7 using a backwards index loop. Print the list.
        List<Integer> nums2= new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));

        for(int i = nums2.size() - 1 ; i >=0 ; i--){
            if(nums2.get(i) > 7){
                nums2.remove(i);
            }
        }

        System.out.println("list after remove greter then 7 " + nums2); //[1, 2, 3, 4, 5, 6, 7]

        // Prediction: if you remove even numbers with a FORWARD index loop;

        // on [2, 4, 6, 7], which number is skipped and what stays in the list? [4,7]
    }
}
