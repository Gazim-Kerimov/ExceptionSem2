package SolutionsManager;

import Solutions.Task1Solution;
import Solutions.Task2Solution;
import Solutions.Task3Solution;
import Solutions.Task4Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Manager {
    public static void start(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Введите номер задачи (1,2,3 или 4) для отображения решения. " +
                    "Для выхода из программы введите exit");
            try {
                String userInput = reader.readLine();
                if(userInput.equalsIgnoreCase("exit")){
                    reader.close();
                    break;
                }
                else {
                    switch (userInput) {
                        case "1":
                            Task1Solution.runSolution();
                            break;
                        case "2":
                            Task2Solution.runSolution();
                            break;
                        case "3":
                            Task3Solution.runSolution();
                            break;
                        case "4":
                            Task4Solution.runSolution();
                            break;
                        default:
                            System.out.println("Введено некорректное значение. Попробуйте снова");
                            break;
                    }
                }
            }
            catch (IOException e){
                System.out.println("IOException is caught");
            }

        }
    }
}
