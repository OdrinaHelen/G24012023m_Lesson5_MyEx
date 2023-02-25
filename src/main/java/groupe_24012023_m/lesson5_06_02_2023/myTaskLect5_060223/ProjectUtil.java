package groupe_24012023_m.lesson5_06_02_2023.myTaskLect5_060223;

public class ProjectUtil {


    Project createProject() {
        UserInput userInput = new UserInput();
        String nameOfObject = userInput.userInputText("Введите имя объекта: ");
        String designStage = userInput.userInputText("Введите стадию проектирования: ");
        String designedSystem = userInput.userInputText("Введите проектируемую систему: ");
        int numberOfWeeksToComplete = userInput.userInputInt("Введите количество недель выполнения проекта: ");
        boolean executionState = userInput.userInputBool("Введите состояние выполнения проекта (true/false): ");

//       Project project = new Project(nameOfObject, designStage, designedSystem, numberOfWeeksToComplete, executionState);
        String messageExecutionState;
        if (executionState = true) messageExecutionState = "Проект выполнено";
        else messageExecutionState = "Проект не выполнено";
        System.out.println(messageExecutionState);


        Project newProject = new Project(nameOfObject, designStage, designedSystem, numberOfWeeksToComplete, executionState, messageExecutionState);
//      System.out.println("Новый проект: " + newProject);
//////         System.out.println(messageExecutionState);


//        return newProject;

//        if (newProject.executionState = true) {
//            newProject.messageExecutionState = "Проект выполнено";
//        } else {
//            newProject.messageExecutionState = "Проект НЕ выполнено";
//        }
        return newProject;
    }
    }





