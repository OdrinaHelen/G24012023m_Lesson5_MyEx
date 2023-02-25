package groupe_24012023_m.lesson5_06_02_2023.myTaskLect5_060223;

public class Output {
   void printInformationOfProject(Project ourProject){
        System.out.println("Объект: " + ourProject.nameOfObject + ". Стадия проектирования: " + ourProject.designStage +
                ". Раздел проектирования: " + ourProject.designedSystem);
        System.out.println("Количество недель проектирования: " + ourProject.numberOfWeeksToComplete);

//        String messageExecutionState;
        if (ourProject.executionState = true) {ourProject.messageExecutionState = "Проект выполнено";}
        else {ourProject.messageExecutionState = "Проект НЕ выполнено";}
       System.out.println(ourProject.messageExecutionState);

    }
}
