package Groupe_24012023_m.lesson5_06_02_2023.myTaskLect5_060223;

import static Groupe_24012023_m.lesson5_06_02_2023.myTaskLect5_060223.ProjectUtil.createProject;

public class ProjectDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Output output = new Output();
        ProjectUtil projectUtil = new ProjectUtil();


        Project firstProject = ProjectUtil.createProject(;
//        Project secondProject = ProjectUtil.createProject();
//        Project thirdProject = ProjectUtil.createProject();

        Output.printInformationOfProject(firstProject);
//        Output.printInformationOfProject(secondProject);
//        Output.printInformationOfProject(thirdProject);


   //     System.out.println(firstProject);
//        System.out.println(secondProject);
//        System.out.println(thirdProject);




    }
}
