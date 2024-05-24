/**
 * @Author : Kyaw Zaw Htet
 * @Date : 5/24/2024
 * @Time : 9:34 PM
 * @Project_Name : CSBeginnerBootCamp-PreTest
 */

public class FizzBuzz {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
}
