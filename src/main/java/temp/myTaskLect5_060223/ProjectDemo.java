package temp.myTaskLect5_060223;

public class ProjectDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Output output = new Output();
        ProjectUtil projectUtil = new ProjectUtil();


        Project firstProject = ProjectUtil.createProject();
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
