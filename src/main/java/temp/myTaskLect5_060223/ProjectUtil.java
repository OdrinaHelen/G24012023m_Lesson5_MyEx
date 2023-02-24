package temp.myTaskLect5_060223;

public class ProjectUtil {
    static Project createProject() {
        UserInput userInput = new UserInput();
        String nameOfObject = userInput.userInputText("Введите имя объекта: ");
        String designStage = userInput.userInputText("Введите стадию проектирования: ");
        String designedSystem = userInput.userInputText("Введите проектируемую систему: ");
        int numberOfWeeksToComplete = userInput.userInputInt("Введите количество недель выполнения проекта: ");
        boolean executionState = userInput.userInputBool("Введите состояние выполнения проекта (true/false): ");
//        String messageExecutionState;
//        if (executionState = true) messageExecutionState = "Проект выполнено";
//        else messageExecutionState = "Проект не выполнено";





//        String messageExecutionState;
//        if (executionState = true) messageExecutionState = "Проект выполнено";
//        else messageExecutionState = "Проект не выполнено";

        Project newProject = new Project(nameOfObject, designStage, designedSystem, numberOfWeeksToComplete, executionState);
//      System.out.println("Новый проект: " + newProject);
//////         System.out.println(messageExecutionState);
      return newProject;
    }}



