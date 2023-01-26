public class subGoal1 {
    String id;
    String des;


    public static context getContext() {
        context.desc("C1.1.1.1.2", "Test case is run on a script");
        return new context();

        
    }
    public static assumption getassumption() {
        assumption.print("A1.1.1.2",  "Test Case is assumed to be appropriate for general fault testing");
        return new assumption();

    }
    public static solution getsolution(){
        solution.des("Sn1.1.1.1.2", "Printed output of test case 2 6  found in logged runs on the two versions of swap.c in project directory");
        return new solution();
    }

}
