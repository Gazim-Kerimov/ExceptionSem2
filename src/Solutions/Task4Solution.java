package Solutions;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4Solution {
    public static void runSolution(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Введите строку для отображения ее трижды в консоли. Для выхода из решения введите return");
            try {
                String userInput = reader.readLine();
                if(userInput.equalsIgnoreCase("return")){
                    break;
                }
                else if(userInput.isEmpty()){
                    System.out.println("Пустые строки вводить нельзя");
                }
                else {
                    System.out.println(userInput + " " + userInput + " " + userInput);
                }
            }
            catch (IOException e){
                System.out.println("IOException is caught");
            }
        }
    }
}
