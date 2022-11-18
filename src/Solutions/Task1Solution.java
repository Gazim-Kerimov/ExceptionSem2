package Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1Solution {
    public static void runSolution(){
        while (true){
            System.out.println("Введите дробное число для вывода его в консоль. Для выхода из решения введите return");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                String userInput = reader.readLine();
                if(userInput.equalsIgnoreCase("return")){
                    break;
                }
                else{
                    try {
                        float perm = Float.parseFloat(userInput);
                        System.out.println(perm);
                    }
                    catch (NumberFormatException e){
                        System.out.println("Введенные данные не являются числом. Попробуйте снова");
                    }
                }

            }
            catch (IOException e){
                System.out.println("IO Exception caught");
            }
        }
    }
}
