public class App {

    public static void main(String[] args) {
        int Goal = 1;
        int arr[] = {1, 3};
        
        Decisionfactory abstractDecisionFactory = Decisionfactory.getDecisionfactory(Goal);
        //subGoal sub = abstractDecisionFactory.getsubGoal(arr);
        abstractDecisionFactory.getsubGoal(arr);
        

            
        };
    }

